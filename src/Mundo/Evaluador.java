package Mundo;

import com.singularsys.jep.EvaluationException;
import com.singularsys.jep.Jep;
import com.singularsys.jep.JepException;
import com.singularsys.jep.ParseException;
import com.singularsys.jep.misc.functions.Factorial;

import java.sql.SQLOutput;
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
        String patternString = "(cos|sin|tan)\\((\\d+)\\)";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);

        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String function = matcher.group(1);
            String value = matcher.group(2);
            String replacement = String.format("%s(%s * pi / 180)", function, value);
            matcher.appendReplacement(result, replacement);
        }
        matcher.appendTail(result);

        return result.toString();
    }

    public Object calcularExpression(String expression) throws ParseException, EvaluationException {
        jep.parse(replaceTrigFunctions(expression).replace("EE","*10^"));
        return jep.evaluate();
    }
}

