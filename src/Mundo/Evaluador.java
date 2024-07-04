package Mundo;

import com.singularsys.jep.EvaluationException;
import com.singularsys.jep.Jep;
import com.singularsys.jep.ParseException;
import com.singularsys.jep.misc.functions.Factorial;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Evaluador {
    private Jep jep;

    public Evaluador(){
        jep = new Jep();
        jep.setAllowUndeclared(true);
        jep.setAllowAssignment(true);
        jep.addStandardConstants();
        jep.setImplicitMul(true);
        jep.addFunction("fact", new Factorial());
        jep.addFunction("raiz", new Raiz());
    }

    private String replaceTrigFunctions(String input) {
        String patternString = "(cos|sin|tan|acos|asin|atan)\\((\\d+(\\.\\d+)?)\\)";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);

        StringBuffer result = new StringBuffer();

        //cos(2) -> cos(2 * pi / 180)
        while (matcher.find()) {
            String function = matcher.group(1);
            String value = matcher.group(2);
            String replacement = String.format("%s(%s * pi / 180)", function, value);
            matcher.appendReplacement(result, replacement);
        }
        matcher.appendTail(result);
        return result.toString();
    }

    public Object calcularExpression(String expression,boolean isRad) throws ParseException, EvaluationException {
        String inGrados = replaceTrigFunctions(expression);
        if(isRad){
            inGrados = expression;
        }
        //2 EE 3 = 20000.0 -> (2 * 10 ^ 3) = 2000.0
        String replaceEE = inGrados.replace("EE","*10^");

        // % = *1/100 -> 20% -> (20*1/100)
        String replacePorcentaje = replaceEE.replace("%","*1/100");
        jep.parse(replacePorcentaje);
        return jep.evaluate();
    }
}

