package es.studium.ejemplos;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class VentanaCerrar implements WindowListener /*Tenemos que implementar esta clasi y después añadir los métodos inimplementados en source*/
{
	
	Frame ventana = new Frame("Ventana que se cierra");
	
	public VentanaCerrar()
	{
		ventana.setSize(270,220);
		
		ventana.addWindowListener(this);
		
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new VentanaCerrar();
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
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

	
}