package Mundo;

import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

import java.awt.*;

public class Latex {

    public Latex(){
    }

    public TeXIcon iconEnLatex(String latex){
        TeXFormula formula = new TeXFormula(latex);
        TeXIcon icon = formula.createTeXIcon(Font.BOLD,25,3);
        return icon;
    }
}
