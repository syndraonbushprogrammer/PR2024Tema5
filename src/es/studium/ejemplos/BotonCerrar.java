package es.studium.ejemplos;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonCerrar implements ActionListener /*Tenemos que implementar esta clasi y después añadir los métodos inimplementados en source*/
{
	
	Frame ventana = new Frame("Ventana que se cierra");
	Button btnCerrar = new Button ("Cerrar Ventana");
	
	public BotonCerrar()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setSize(270,220);
		
		btnCerrar.addActionListener(this);
		ventana.add(btnCerrar);
		
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new VentanaCerrar();
	}

	@Override //Tienes que completar el método para poder usar la clase
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
		
	}
}
