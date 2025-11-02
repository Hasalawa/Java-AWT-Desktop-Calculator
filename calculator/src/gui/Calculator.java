package gui;

import java.awt.*;
import java.awt.event.*;

class Close extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener,KeyListener {

    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30;
    String fv, sv, op;
    Double fdv, sdv, tot, memory = 0.0;
    int decimalCount = 0, zeroCount = 0;
    Frame f = new Frame();
    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Dialog aboutDialog;
    Dialog helpDialog;

    Cal() {

        f.addWindowListener(new Close());
        f.setBackground(Color.white);
        f.setTitle("My Calculator");
        f.setResizable(false);
        f.setSize(500, 650);
        f.setLocationRelativeTo(null);
        
        f.addKeyListener(this);
        f.setFocusable(true);

        p2.setPreferredSize(new Dimension(300, 500));

        Font f1 = new Font("Poppins", Font.BOLD, 30);
        Font f2 = new Font("Quicksand", Font.BOLD, 14);
        Font f3 = new Font("Quicksand", Font.BOLD, 60);

        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("View");
        MenuItem miL = new MenuItem("Light Theme");
        MenuItem miD = new MenuItem("Dark Theme");
        m1.add(miL);
        m1.add(miD);

        Menu m2 = new Menu("Edit");
        MenuItem mi2 = new MenuItem("Copy");
        MenuItem mi3 = new MenuItem("Cut");
        m2.add(mi2);
        m2.add(mi3);

        Menu m3 = new Menu("Help");
        MenuItem mi4 = new MenuItem("View Help F1");
        MenuItem mi5 = new MenuItem("About Calculator");
        m3.add(mi4);
        m3.add(mi5);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        f.setMenuBar(mb);

        GridLayout g1 = new GridLayout(6, 5, 5, 5);
        p2.setLayout(g1);
        p2.setBackground(Color.white);

        tf = new TextField();
        tf.setPreferredSize(new Dimension(490, 80));
        tf.setFont(f3);
        tf.setEditable(false);
        tf.setForeground(Color.black);
        tf.setBackground(Color.white);
        tf.setText(" 0");
        tf.setFocusable(false);

        p1.add(tf);

        b1 = new Button("MC");
        b2 = new Button("MR");
        b3 = new Button("MS");
        b4 = new Button("M+");
        b5 = new Button("M-");
        b6 = new Button("<-");
        b7 = new Button("CE");
        b8 = new Button("C");
        b9 = new Button("+/-");
        b10 = new Button("SQRT");
        b11 = new Button("7");
        b12 = new Button("8");
        b13 = new Button("9");
        b14 = new Button("/");
        b15 = new Button("%");
        b16 = new Button("4");
        b17 = new Button("5");
        b18 = new Button("6");
        b19 = new Button("*");
        b20 = new Button("1/X");
        b21 = new Button("1");
        b22 = new Button("2");
        b23 = new Button("3");
        b24 = new Button("-");
        b25 = new Button("=");
        b26 = new Button("0");
        b27 = new Button("");
        b28 = new Button(".");
        b29 = new Button("+");
        b30 = new Button("");

        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        b5.setFont(f1);
        b6.setFont(f1);
        b7.setFont(f1);
        b8.setFont(f1);
        b9.setFont(f1);
        b10.setFont(f1);
        b11.setFont(f1);
        b12.setFont(f1);
        b13.setFont(f1);
        b14.setFont(f1);
        b15.setFont(f1);
        b16.setFont(f1);
        b17.setFont(f1);
        b18.setFont(f1);
        b19.setFont(f1);
        b20.setFont(f1);
        b21.setFont(f1);
        b22.setFont(f1);
        b23.setFont(f1);
        b24.setFont(f1);
        b25.setFont(f1);
        b26.setFont(f1);
        b27.setFont(f1);
        b28.setFont(f1);
        b29.setFont(f1);
        b30.setFont(f1);

        lightTheme();

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        p2.add(b21);
        p2.add(b22);
        p2.add(b23);
        p2.add(b24);
        p2.add(b25);
        p2.add(b26);
        p2.add(b27);
        p2.add(b28);
        p2.add(b29);
        p2.add(b30);

        miL.addActionListener(this);
        miD.addActionListener(this);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);

        mi4.addActionListener(this);
        mi5.addActionListener(this);

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);

        // About dialog
        aboutDialog = new Dialog(f, "About Calculator", true);
        aboutDialog.setSize(350, 100);
        aboutDialog.setResizable(false);
        aboutDialog.setLayout(new FlowLayout());
        aboutDialog.setLocationRelativeTo(null);
        Label aboutLabel = new Label();
        aboutLabel.setText("Calculator v1, Developed by Kehan Hasalawa");
        aboutLabel.setFont(f2);
        aboutDialog.add(aboutLabel);
        aboutDialog.setBackground(Color.white);
        Button closeButton = new Button("Close");
        closeButton.addActionListener(e -> aboutDialog.setVisible(false));
        closeButton.setBackground(Color.white);
        aboutDialog.add(closeButton);
        aboutDialog.addWindowListener(new WindowAdapter() {           
            @Override
            public void windowClosing(WindowEvent e) {
                aboutDialog.setVisible(false);
            }
        });
        
        // Help Dialog 
        helpDialog = new Dialog(f, " Calculator Help Guide", true);
        helpDialog.setSize(650, 515);
        helpDialog.setResizable(false);
        helpDialog.setLayout(new BorderLayout());
        helpDialog.setLayout(new FlowLayout());
        helpDialog.setLocationRelativeTo(null);

        String helpText1 = " Basic Operations\n" +
"\t Addition (+): Adds two numbers. \n" +
"\t\tExample: `5 + 3 = 8`\n" +
"\t Subtraction (-): Subtracts the second number from the first.\n" +
"\t\tExample: `5 - 3 = 2`\n" +
"\t Multiplication (* or x): Multiplies two numbers.\n" +
"\t\tExample: `5 * 3 = 15`\n" +
"\t Division (/): Divides the first number by the second.\n" +
"\t\tExample: `6 / 3 = 2`\n" +
"\n" +
" Advanced Operations:\n" +
"\t Square Root (√x): Calculates the square root of a number.\n" +
"\t\tExample: `√25 = 5`\n" +
"\t Percent (%):** Calculates the percentage.\n" +
"\t\tExample: `50% of 200 = 100`\n" +
"\n" +
" Memory Functions:\n" +
"\t Memory Clear (MC): Clears the memory.\n" +
"\t Memory Recall (MR): Recalls the current number stored in memory.\n" +
"\t Memory Add (M+): Adds the displayed number to memory.\n" +
"\t Memory Subtract (M-): Subtracts the displayed number from memory.\n" +
"\n" +
" Special Functions:\n" +
"\t Clear Entry (CE): Clears the current entry.\n" +
"\t Clear (C):** Clears all entries.\n" +
"\t Backspace (←): Deletes the last digit entered.\n" +
"\n" +
" For further assistance, refer to the user manual or contact support.";
        TextArea helpLabel = new TextArea(helpText1, 28, 75, TextArea.SCROLLBARS_VERTICAL_ONLY);
        helpLabel.setEditable(false);
        helpLabel.setFocusable(false);
        helpDialog.setBackground(Color.white);
        helpDialog.add(helpLabel);
        helpLabel.setFont(f2);
        helpDialog.add(helpLabel, BorderLayout.CENTER);

        helpDialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                helpDialog.setVisible(false);
            }
        });

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent d) {

        Object o = d.getSource();

        if (o.equals(b26) & zeroCount != 0) { // 0
            tf.setText(tf.getText() + b26.getLabel());
        } else if (o.equals(b21)) { // 1
            tf.setText(zeroCount == 0 ? (" " + b21.getLabel()) : (tf.getText() + b21.getLabel()));
            zeroCount++;
        } else if (o.equals(b22)) { // 2
            tf.setText(zeroCount == 0 ? (" " + b22.getLabel()) : (tf.getText() + b22.getLabel()));
            zeroCount++;
        } else if (o.equals(b23)) { // 3
            tf.setText(zeroCount == 0 ? (" " + b23.getLabel()) : (tf.getText() + b23.getLabel()));
            zeroCount++;
        } else if (o.equals(b16)) { // 4
            tf.setText(zeroCount == 0 ? (" " + b16.getLabel()) : (tf.getText() + b16.getLabel()));
            zeroCount++;
        } else if (o.equals(b17)) { // 5
            tf.setText(zeroCount == 0 ? (" " + b17.getLabel()) : (tf.getText() + b17.getLabel()));
            zeroCount++;
        } else if (o.equals(b18)) { // 6
            tf.setText(zeroCount == 0 ? (" " + b18.getLabel()) : (tf.getText() + b18.getLabel()));
            zeroCount++;
        } else if (o.equals(b11)) { // 7
            tf.setText(zeroCount == 0 ? (" " + b11.getLabel()) : (tf.getText() + b11.getLabel()));
            zeroCount++;
        } else if (o.equals(b12)) { // 8
            tf.setText(zeroCount == 0 ? (" " + b12.getLabel()) : (tf.getText() + b12.getLabel()));
            zeroCount++;
        } else if (o.equals(b13)) { // 9
            tf.setText(zeroCount == 0 ? (" " + b13.getLabel()) : (tf.getText() + b13.getLabel()));
            zeroCount++;
        } else if (o.equals(b28)) { // .
            decimalCount++;
            zeroCount++;
            tf.setText(tf.getText() + b28.getLabel());
        } else if (o.equals(b8)) { // C
            tf.setText(" 0");
            fv = null;
            sv = null;
            fdv = 0.0;
            sdv = 0.0;
            tot = 0.0;
            decimalCount = 0;
            zeroCount = 0;
        } else if (o.equals(b1)) { // MC
            memory = 0.0;
        } else if (o.equals(b2)) { // MR
            tf.setText(" " + memory);
        } else if (o.equals(b3)) { // MS
            try {
                memory = Double.parseDouble(tf.getText().trim());
            } catch (NumberFormatException e) {
                tf.setText(" Error");
            }
        } else if (o.equals(b4)) { //M+
            try {
                memory += Double.parseDouble(tf.getText().trim());
            } catch (NumberFormatException e) {
                tf.setText(" Error");
            }
        } else if (o.equals(b5)) { // M-
            try {
                memory -= Double.parseDouble(tf.getText().trim());
            } catch (NumberFormatException e) {
                tf.setText(" Error");
            }
        } else if (o.equals(b7)) { // CE

            tf.setText(" 0");
            decimalCount = 0;
            zeroCount = 0;

        } else if (o.equals(b6)) { // <-

            String currentText = tf.getText().trim();
            if (currentText.length() > 1) {
                tf.setText(" " + currentText.substring(0, currentText.length() - 1));
            } else {
                tf.setText(" 0");
            }

        } else if (o.equals(b20)) { // 1/x
            String currentText = tf.getText().trim();
            try {
                double value = Double.parseDouble(currentText);
                if (value != 0) {
                    tf.setText(" " + (1 / value));
                } else {
                    tf.setText(" Cannot divide by zero");
                }
            } catch (NumberFormatException e) {
                tf.setText(" Error");
            }
        } else if (o.equals(b29)) { // +

            if (fv == null) {
                fv = tf.getText();
            } else {
                sv = tf.getText();

                fdv = Double.parseDouble(fv);
                sdv = Double.parseDouble(sv);

                tot = fdv + sdv;
                fv = "" + tot;
            }

            tf.setText(" ");
            op = b29.getLabel();
            decimalCount = 0;

        } else if (o.equals(b24)) { // -

            if (fv == null) {
                fv = tf.getText();
            } else {
                sv = tf.getText();

                fdv = Double.parseDouble(fv);
                sdv = Double.parseDouble(sv);

                tot = fdv - sdv;
                fv = "" + tot;
            }

            tf.setText(" ");
            op = b24.getLabel();
            decimalCount = 0;

        } else if (o.equals(b19)) { // *

            if (fv == null) {
                fv = tf.getText();
            } else {
                sv = tf.getText();

                fdv = Double.parseDouble(fv);
                sdv = Double.parseDouble(sv);

                tot = fdv * sdv;
                fv = "" + tot;
            }
            tf.setText(" ");
            op = b19.getLabel();
            decimalCount = 0;

        } else if (o.equals(b14)) { // /

            if (fv == null) {
                fv = tf.getText();
            } else {
                sv = tf.getText();

                fdv = Double.parseDouble(fv);
                sdv = Double.parseDouble(sv);

                tot = fdv / sdv;
                fv = "" + tot;
            }
            tf.setText(" ");
            op = b14.getLabel();
            decimalCount = 0;

        } else if (o.equals(b10)) { // SqRt

            try {

                fv = tf.getText();
                fdv = Double.parseDouble(fv);
                tot = Math.sqrt(fdv);
                tf.setText(" " + tot);

            } catch (Exception e) {
                tf.setText(" Error");
            }

        } else if (o.equals(b15)) { // %

            try {

                sv = tf.getText();

                fdv = Double.parseDouble(fv);
                sdv = Double.parseDouble(sv);

                if (op == "/") {
                    tot = (fdv / sdv) * 100;
                    tf.setText(" " + tot);
                }

                fv = null;
                decimalCount = 0;

            } catch (NullPointerException e) {
                tf.setText(" Error");
            }

        } else if (o.equals(b9)) { // +/-

            if (zeroCount != 0 & Double.parseDouble(tf.getText()) > 0) {
                fdv = Double.parseDouble(tf.getText());
                tf.setText(" -" + fdv);
            }else{
                tf.setText(" " + fdv);
            }

        } else if (o.equals(b25)) { // =

            sv = tf.getText();

            if (fv != null && !fv.isEmpty() && sv != null && !sv.isEmpty()) {

                try {

                    fdv = Double.parseDouble(fv);
                    sdv = Double.parseDouble(sv);

                    if (op.equals("+")) {
                        tot = fdv + sdv;
                    } else if (op.equals("-")) {
                        tot = fdv - sdv;
                    } else if (op.equals("*")) {
                        tot = fdv * sdv;
                    } else if (op.equals("/")) {
                        tot = fdv / sdv;
                    }

                    fv = null;
                    decimalCount = 0;

                    tf.setText(" " + tot);

                } catch (Exception e) {
                    tf.setText(" Error");
                }

            }

        }

        if (d.getActionCommand().equals("About Calculator")) {  // About Calculator
            aboutDialog.setVisible(true);
        }
        
        if (d.getActionCommand().equals("View Help F1")) {  // View Help Calculator
            helpDialog.setVisible(true);
        }

        if (d.getActionCommand().equals("Dark Theme")) {
            darkTheme();
        } else if (d.getActionCommand().equals("Light Theme")) {
            lightTheme();
        }

    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_F1) {
            helpDialog.setVisible(true);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}


    @Override
    public void keyTyped(KeyEvent e) {}

    public void lightTheme() {

        f.setBackground(Color.white);

        p1.setBackground(Color.white);
        p2.setBackground(Color.white);

        tf.setForeground(Color.black);
        tf.setBackground(Color.white);
        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);
        b6.setBackground(Color.white);
        b7.setBackground(Color.white);
        b8.setBackground(Color.white);
        b9.setBackground(Color.white);
        b10.setBackground(Color.white);
        b11.setBackground(Color.white);
        b12.setBackground(Color.white);
        b13.setBackground(Color.white);
        b14.setBackground(Color.white);
        b15.setBackground(Color.white);
        b16.setBackground(Color.white);
        b17.setBackground(Color.white);
        b18.setBackground(Color.white);
        b19.setBackground(Color.white);
        b20.setBackground(Color.white);
        b21.setBackground(Color.white);
        b22.setBackground(Color.white);
        b23.setBackground(Color.white);
        b24.setBackground(Color.white);
        b25.setBackground(Color.white);
        b26.setBackground(Color.white);
        b27.setBackground(Color.white);
        b28.setBackground(Color.white);
        b29.setBackground(Color.white);
        b30.setBackground(Color.white);

        b1.setForeground(Color.black);
        b2.setForeground(Color.black);
        b3.setForeground(Color.black);
        b4.setForeground(Color.black);
        b5.setForeground(Color.black);
        b6.setForeground(Color.black);
        b7.setForeground(Color.black);
        b8.setForeground(Color.black);
        b9.setForeground(Color.black);
        b10.setForeground(Color.black);
        b11.setForeground(Color.black);
        b12.setForeground(Color.black);
        b13.setForeground(Color.black);
        b14.setForeground(Color.black);
        b15.setForeground(Color.black);
        b16.setForeground(Color.black);
        b17.setForeground(Color.black);
        b18.setForeground(Color.black);
        b19.setForeground(Color.black);
        b20.setForeground(Color.black);
        b21.setForeground(Color.black);
        b22.setForeground(Color.black);
        b23.setForeground(Color.black);
        b24.setForeground(Color.black);
        b25.setForeground(Color.black);
        b26.setForeground(Color.black);
        b27.setForeground(Color.black);
        b28.setForeground(Color.black);
        b29.setForeground(Color.black);
        b30.setForeground(Color.black);

    }

    public void darkTheme() {

        f.setBackground(Color.black);

        p1.setBackground(Color.black);
        p2.setBackground(Color.black);

        tf.setForeground(Color.white);
        tf.setBackground(Color.black);

        b1.setBackground(Color.black);
        b2.setBackground(Color.black);
        b3.setBackground(Color.black);
        b4.setBackground(Color.black);
        b5.setBackground(Color.black);
        b6.setBackground(Color.black);
        b7.setBackground(Color.black);
        b8.setBackground(Color.black);
        b9.setBackground(Color.black);
        b10.setBackground(Color.black);
        b11.setBackground(Color.black);
        b12.setBackground(Color.black);
        b13.setBackground(Color.black);
        b14.setBackground(Color.black);
        b15.setBackground(Color.black);
        b16.setBackground(Color.black);
        b17.setBackground(Color.black);
        b18.setBackground(Color.black);
        b19.setBackground(Color.black);
        b20.setBackground(Color.black);
        b21.setBackground(Color.black);
        b22.setBackground(Color.black);
        b23.setBackground(Color.black);
        b24.setBackground(Color.black);
        b25.setBackground(Color.black);
        b26.setBackground(Color.black);
        b27.setBackground(Color.black);
        b28.setBackground(Color.black);
        b29.setBackground(Color.black);
        b30.setBackground(Color.black);

        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setForeground(Color.white);
        b4.setForeground(Color.white);
        b5.setForeground(Color.white);
        b6.setForeground(Color.white);
        b7.setForeground(Color.white);
        b8.setForeground(Color.white);
        b9.setForeground(Color.white);
        b10.setForeground(Color.white);
        b11.setForeground(Color.white);
        b12.setForeground(Color.white);
        b13.setForeground(Color.white);
        b14.setForeground(Color.white);
        b15.setForeground(Color.white);
        b16.setForeground(Color.white);
        b17.setForeground(Color.white);
        b18.setForeground(Color.white);
        b19.setForeground(Color.white);
        b20.setForeground(Color.white);
        b21.setForeground(Color.white);
        b22.setForeground(Color.white);
        b23.setForeground(Color.white);
        b24.setForeground(Color.white);
        b25.setForeground(Color.white);
        b26.setForeground(Color.white);
        b27.setForeground(Color.white);
        b28.setForeground(Color.white);
        b29.setForeground(Color.white);
        b30.setForeground(Color.white);

    }

}

public class Calculator {

    public static void main(String[] args) {
        new Cal();
    }
}
