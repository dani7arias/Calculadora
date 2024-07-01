package Interfaz;

import javax.swing.*;
import javax.swing.border.Border;

import Mundo.Latex;
import Mundo.Matriz;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import net.miginfocom.swing.MigLayout;

import java.awt.*;

public class Principal extends JFrame{
    private Matriz matriz;
    private Latex latex;

    private JButton btnAC;
    private JButton btnPorcentanje;
    private JButton btnDividir;
    private JPanel panelPrincipal;
    private JButton btnSumaSobreResta;
    private JTextField txtEntrada;
    private JButton btnParentesisIzquierdo;
    private JButton btnParentisisDerecho;
    private JButton btn2elevadoND;
    private JButton btnXelevado2;
    private JButton btnXelevado3;
    private JButton btnXelevadoY;
    private JButton btnEElevadoX;
    private JButton btn10Elevado;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnMultiplicacion;
    private JButton btn1sobreX;
    private JButton btnRaizCuadradaX;
    private JButton btnRaizCubicaX;
    private JButton btnRaizYdeX;
    private JButton btnLn;
    private JButton btnLogaritmo10;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnResta;
    private JButton btnSeno;
    private JButton btnXadmiracion;
    private JButton btnCoseno;
    private JButton btnTangente;
    private JButton btnE;
    private JButton btnEE;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnSuma;
    private JButton btnSinH;
    private JButton btnRad;
    private JButton btnCosH;
    private JButton btnTanH;
    private JButton btnPi;
    private JButton btnRand;
    private JButton btn0;
    private JButton btnComa;
    private JButton btnResultado;

    private void latexDeBotones(){
        btnParentesisIzquierdo.setIcon(latex.iconEnLatex("("));
        btnParentisisDerecho.setIcon(latex.iconEnLatex(")"));
        btnAC.setIcon(latex.iconEnLatex("AC"));
        btnSumaSobreResta.setIcon(latex.iconEnLatex("+/-"));
        btnPorcentanje.setIcon(latex.iconEnLatex("\\%"));
        btnDividir.setIcon(latex.iconEnLatex("÷"));
        btn7.setIcon(latex.iconEnLatex("7"));
        btn8.setIcon(latex.iconEnLatex("8"));
        btn9.setIcon(latex.iconEnLatex("9"));
        btnMultiplicacion.setIcon(latex.iconEnLatex("x"));
        btn10Elevado.setIcon(latex.iconEnLatex("10^x"));
        btnEElevadoX.setIcon(latex.iconEnLatex("e^x"));
        btnXelevadoY.setIcon(latex.iconEnLatex("x^y"));
        btnXelevado3.setIcon(latex.iconEnLatex("x^3"));
        btnXelevado2.setIcon(latex.iconEnLatex("x^2"));
        btn2elevadoND.setIcon(latex.iconEnLatex("2^{nd}"));

        btn1sobreX.setIcon(latex.iconEnLatex("1/x"));
        btnRaizCuadradaX.setIcon(latex.iconEnLatex("\\sqrt[2]{x}"));
        btnRaizCubicaX.setIcon(latex.iconEnLatex("\\sqrt[3]{x}"));
        btnRaizYdeX.setIcon(latex.iconEnLatex("\\sqrt[y]{x}"));
        btnLn.setIcon(latex.iconEnLatex("ln"));
        btnLogaritmo10.setIcon(latex.iconEnLatex("log_{10}"));
        btn4.setIcon(latex.iconEnLatex("4"));
        btn5.setIcon(latex.iconEnLatex("5"));
        btn6.setIcon(latex.iconEnLatex("6"));
        btnResta.setIcon(latex.iconEnLatex("-"));

        btnXadmiracion.setIcon(latex.iconEnLatex("x!"));
        btnSeno.setIcon(latex.iconEnLatex("sin"));
        btnCoseno.setIcon(latex.iconEnLatex("cos"));
        btnTangente.setIcon(latex.iconEnLatex("tan"));
        btnE.setIcon(latex.iconEnLatex("e"));
        btnEE.setIcon(latex.iconEnLatex("EE"));
        btn1.setIcon(latex.iconEnLatex("1"));
        btn2.setIcon(latex.iconEnLatex("2"));
        btn3.setIcon(latex.iconEnLatex("3"));
        btnSuma.setIcon(latex.iconEnLatex("+"));

        btnRad.setIcon(latex.iconEnLatex("Rad"));
        btnSinH.setIcon(latex.iconEnLatex("sinh"));
        btnCosH.setIcon(latex.iconEnLatex("cosh"));
        btnTanH.setIcon(latex.iconEnLatex("tanh"));
        btnPi.setIcon(latex.iconEnLatex("\\pi"));
        btnRand.setIcon(latex.iconEnLatex("Rand"));
        btn0.setIcon(latex.iconEnLatex("0"));
        btnComa.setIcon(latex.iconEnLatex(","));
        btnResultado.setIcon(latex.iconEnLatex("="));
    }

    private void disenoBotones(){
        String tamanioBtn = "w 100%, h 100%,";
        panelPrincipal.setLayout(new MigLayout("fill, wrap 10",matriz.getColConstrains(),matriz.getRowConstrains()));
        panelPrincipal.add(txtEntrada, "w 100%, h 80!, span");
        panelPrincipal.add(btnParentesisIzquierdo,tamanioBtn);
        panelPrincipal.add(btnParentisisDerecho,tamanioBtn);
        panelPrincipal.add(btnAC,tamanioBtn + "cell 6 1");
        panelPrincipal.add(btnSumaSobreResta,tamanioBtn);
        panelPrincipal.add(btnPorcentanje,tamanioBtn);
        panelPrincipal.add(btnDividir,tamanioBtn +"wrap");
        panelPrincipal.add(btn2elevadoND,tamanioBtn);
        panelPrincipal.add(btnXelevado2,tamanioBtn);
        panelPrincipal.add(btnXelevado3,tamanioBtn);
        panelPrincipal.add(btnXelevadoY,tamanioBtn);
        panelPrincipal.add(btnEElevadoX,tamanioBtn);
        panelPrincipal.add(btn10Elevado,tamanioBtn);
        panelPrincipal.add(btn7,tamanioBtn);
        panelPrincipal.add(btn8,tamanioBtn);
        panelPrincipal.add(btn9,tamanioBtn);
        panelPrincipal.add(btnMultiplicacion,tamanioBtn);

        panelPrincipal.add(btn1sobreX,tamanioBtn);
        panelPrincipal.add(btnRaizCuadradaX,tamanioBtn);
        panelPrincipal.add(btnRaizCubicaX,tamanioBtn);
        panelPrincipal.add(btnRaizYdeX,tamanioBtn);
        panelPrincipal.add(btnLn,tamanioBtn);
        panelPrincipal.add(btnLogaritmo10,tamanioBtn);
        panelPrincipal.add(btn4,tamanioBtn);
        panelPrincipal.add(btn5,tamanioBtn);
        panelPrincipal.add(btn6,tamanioBtn);
        panelPrincipal.add(btnResta,tamanioBtn);

        panelPrincipal.add(btnXadmiracion,tamanioBtn);
        panelPrincipal.add(btnSeno,tamanioBtn);
        panelPrincipal.add(btnCoseno,tamanioBtn);
        panelPrincipal.add(btnTangente,tamanioBtn);
        panelPrincipal.add(btnE,tamanioBtn);
        panelPrincipal.add(btnEE,tamanioBtn);
        panelPrincipal.add(btn1,tamanioBtn);
        panelPrincipal.add(btn2,tamanioBtn);
        panelPrincipal.add(btn3,tamanioBtn);
        panelPrincipal.add(btnSuma,tamanioBtn);

        panelPrincipal.add(btnRad,tamanioBtn);
        panelPrincipal.add(btnSinH,tamanioBtn);
        panelPrincipal.add(btnCosH,tamanioBtn);
        panelPrincipal.add(btnTanH,tamanioBtn);
        panelPrincipal.add(btnPi,tamanioBtn);
        panelPrincipal.add(btnRand,tamanioBtn);
        panelPrincipal.add(btn0,tamanioBtn + "span 2");
        panelPrincipal.add(btnComa,tamanioBtn);
        panelPrincipal.add(btnResultado,tamanioBtn);

        add(panelPrincipal);
    }

    private void initComponents(){
        matriz = new Matriz();
        latex = new Latex();

        txtEntrada.setEditable(false);

        latexDeBotones();
        disenoBotones();

        //Detalles de ventana
        setSize(900,400);
        setMinimumSize(new Dimension(900,400));
        setLocationRelativeTo(null);
        setTitle("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public Principal(){
        initComponents();
    }

    public static void main(String[] args) {
        try {
            FlatMacDarkLaf.setup();
        }catch (Exception ex){
            System.err.println("Error al comenzar!");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
}
