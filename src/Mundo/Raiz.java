package Mundo;

import com.singularsys.jep.EvaluationException;
import com.singularsys.jep.functions.BinaryFunction;

public class Raiz extends BinaryFunction {

    @Override
    //raiz(y,x)
    public Object eval(Object x, Object y) throws EvaluationException {
        int x1 = ((Number) x).intValue();
        double y1 = ((Number) y).doubleValue();
        return Math.pow(y1, 1.0 / x1);
    }
}
