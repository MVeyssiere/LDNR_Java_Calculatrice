/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculette;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Marine V
 */
public class Calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // créer une calculette
        JFrame frame = new JFrame("Calculatrice");
        frame.setSize(240, 280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel content = new JPanel();
        JTextField field = new JTextField("0");
        field.setHorizontalAlignment(JTextField.RIGHT);
        content.add(field, BorderLayout.NORTH);

         JPanel chiffres = new JPanel();
        chiffres.setLayout(new GridLayout(0, 3));
        JButton egal = new JButton("=");
        JButton point = new JButton(".");
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        b0.setBackground(new java.awt.Color(235, 235, 224));
        b1.setBackground(new java.awt.Color(235, 235, 224));
        b2.setBackground(new java.awt.Color(235, 235, 224));
        b3.setBackground(new java.awt.Color(235, 235, 224));
        b4.setBackground(new java.awt.Color(235, 235, 224));
        b5.setBackground(new java.awt.Color(235, 235, 224));
        b6.setBackground(new java.awt.Color(235, 235, 224));
        b7.setBackground(new java.awt.Color(235, 235, 224));
        b8.setBackground(new java.awt.Color(235, 235, 224));
        b9.setBackground(new java.awt.Color(235, 235, 224));
        egal.setBackground(new java.awt.Color(235, 235, 224));
        point.setBackground(new java.awt.Color(235, 235, 224));
        chiffres.add(b7);
        chiffres.add(b8);
        chiffres.add(b9);
        chiffres.add(b4);
        chiffres.add(b5);
        chiffres.add(b6);
        chiffres.add(b1);
        chiffres.add(b2);
        chiffres.add(b3);
        chiffres.add(b0);
        chiffres.add(point);
        chiffres.add(egal);

        JPanel operations = new JPanel();
        operations.setLayout(new GridLayout(0, 2));

        content.add(operations, BorderLayout.EAST);

        JButton ce = new JButton("CE");
        JButton c = new JButton("C");
        JButton multiplication = new JButton("x");
        JButton addition = new JButton("+");
        JButton division = new JButton("/");
        JButton soustraction = new JButton("-");
        ce.setForeground(Color.red);
        ce.setBackground(Color.WHITE);
        c.setBackground(Color.WHITE);
        addition.setBackground(Color.WHITE);
        soustraction.setBackground(Color.WHITE);
        multiplication.setBackground(Color.WHITE);
        division.setBackground(Color.WHITE);
        operations.add(ce);
        operations.add(c);
        operations.add(addition);
        operations.add(soustraction);
        operations.add(multiplication);
        operations.add(division);

        content.add(chiffres, BorderLayout.WEST);

        frame.add(content);
        frame.setVisible(true);
    }

}
