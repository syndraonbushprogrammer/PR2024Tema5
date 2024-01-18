package es.studium.ejercicios;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Par/Impar");
	TextField txtNumero = new TextField(10);
	Button btnCalcular = new Button ("Calcular");
	Label lblResultado = new Label ("                    ");
	
	public Ejercicio1() // Constructor
	{
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		ventana.setSize(300,80);// Ancho , Alto.
		ventana.setLayout(new FlowLayout());// Encuadrar
		ventana.setResizable(true);// Poder cambiarle el tamaño de la ventana
		ventana.setBackground(Color.yellow);// ventana color amarillo
		
		ventana.add(txtNumero);// Se le añade el txt del numero
		ventana.add(btnCalcular);// Se le añade el botón calcular
		ventana.add(lblResultado);// Se le añade el txt del numero
		
		ventana.setVisible(true);// Mostrar la ventana
	}
	public static void main(String[] args)
	{
		new Ejercicio1();
	}
	
	@Override
	public void windowOpened(WindowEvent e)
	{
		System.out.println("La ventana se ha abierto correctamente");
		
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
		System.out.println("La ventana se ha cerrado correctamente");
		
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		System.out.println("Ventana minimizada");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		System.out.println("Se restauró");
		
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		System.out.println("La ventana se activó");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		System.out.println("La ventana se desactivó");
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//Coger el número escrito y pasar de String al Número
		int numero = Integer.parseInt(txtNumero.getText());
		//Comprobar si es Par o Impar
		String mensaje ="";
		if (numero % 2 == 0)
		{
			mensaje = "ES PAR";
		}
		else
		{
			mensaje = "ES IMPAR";
		}
		//Mostrar el Resultado
		lblResultado.setText(mensaje);
		
	}
}
