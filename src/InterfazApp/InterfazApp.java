package InterfazApp;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import Controlador.Controlador;

public class InterfazApp extends JFrame{
	
	private PanelJuego pnlJuego;
	private PanelPuntaje pnlPuntaje;
	
	Controlador ctrl;
	
	public InterfazApp(Controlador ctrl)
	{
		getContentPane( ).setLayout( null );
		//Color JFrame
		this.getContentPane().setBackground(Color.GRAY.darker().darker().darker().darker());
		//Icono JFrame
		Toolkit mipantalla=  Toolkit.getDefaultToolkit();
		Image MiIcono=mipantalla.getImage("imagenes/295.png");//Icono
		setIconImage(MiIcono);
					
		setTitle("Solitario");
		setSize(850,700);
		setResizable(false);
		util.Util.centrarVentana(this);
		
		// Integra el Controlador. 
	   	  this.ctrl=ctrl;
	   	  
	   	//Instancia los paneles
	   	  
	   	  pnlPuntaje = new PanelPuntaje(ctrl);
	   	  pnlPuntaje.setBounds(5, 5, 834, 60);
	   	  pnlJuego = new PanelJuego(ctrl);
	   	  pnlJuego.setBounds(5, 80, 834, 580);
	   	  addMouseListener(pnlJuego);
	   	  addMouseMotionListener(pnlJuego);
	   	  
	   // Conecta objetos al controlador.
	      ctrl.conectar(pnlJuego, pnlPuntaje);
	   // Organizar el panel principal. 
	      getContentPane( ).add( pnlJuego);
	      getContentPane( ).add( pnlPuntaje);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfazApp ventana = new InterfazApp(new Controlador());
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
