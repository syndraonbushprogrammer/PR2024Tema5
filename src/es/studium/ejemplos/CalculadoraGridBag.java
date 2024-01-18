package es.studium.ejemplos;
import java.awt.*;
import java.awt.event.*;


public class CalculadoraGridBag
{
	private Frame frame;
    private TextField textField;
    private double num1=0,num2=0,result=0;
    private int operator=0;

    public static void main(String[] args) {
        CalculadoraGridBag window = new CalculadoraGridBag();
        window.frame.setVisible(true);
    }

    public CalculadoraGridBag() {
        initialize();
    }

    private void initialize() {
        frame = new Frame();
        frame.setBounds(100, 100, 250, 350);
        frame.setLayout(new GridBagLayout());

        textField = new TextField();
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.HORIZONTAL;
        frame.add(textField, c);

        // Aquí puedes agregar los botones de la calculadora
        String[] buttons = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "C", "+", "-", "÷", "x", "/"};
        for (String buttonText : buttons) {
            Button button = new Button(buttonText);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    if(button.getLabel().equals("C")){
                        textField.setText("");
                        num1 = num2 = result = 0;
                        operator = 0;
                    }else if(button.getLabel().equals("+")){
                        num1 = Double.parseDouble(textField.getText());
                        operator = 1;
                        textField.setText("");
                    }else if(button.getLabel().equals("-")){
                        num1 = Double.parseDouble(textField.getText());
                        operator = 2;
                        textField.setText("");
                    }else if(button.getLabel().equals("÷")){
                        num1 = Double.parseDouble(textField.getText());
                        operator = 3;
                        textField.setText("");
                    }else if(button.getLabel().equals("x")){
                        num1 = Double.parseDouble(textField.getText());
                        operator = 4;
                        textField.setText("");
                    }else if(button.getLabel().equals("/")){
                        // Aquí puedes agregar la funcionalidad para la fracción
                    }else{
                        String EnterNumber = textField.getText() + button.getLabel();
                        textField.setText(EnterNumber);
                    }
                }
            });
            c = new GridBagConstraints();
            c.weightx = 0.5;
            c.fill = GridBagConstraints.HORIZONTAL;
            frame.add(button, c);
        }

        Button equals = new Button("=");
        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                num2 = Double.parseDouble(textField.getText());
                switch(operator){
                    case 1: result = num1 + num2; break;
                    case 2: result = num1 - num2; break;
                    case 3: result = num1 / num2; break;
                    case 4: result = num1 * num2; break;
                    default: result = 0;
                }
                textField.setText(String.valueOf(result));
            }
        });
        c = new GridBagConstraints();
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        frame.add(equals, c);

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}