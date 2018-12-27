package Controlador;

import InterfazApp.PanelJuego;
import InterfazApp.PanelPuntaje;
import Mundo.Solitario;

public class Controlador {

	private PanelJuego pnlJuego;
	private PanelPuntaje pnlPuntaje;
	private Solitario solitario;
	private int cont=0;
	// Atributos de instancia
	private boolean paused;
	public Controlador(){solitario = new Solitario();paused = false;}
	public void conectar(PanelJuego pnlJuego, PanelPuntaje pnlPuntaje) 
	{this.pnlJuego=pnlJuego;this.pnlPuntaje=pnlPuntaje;solitario.initThread(this);solitario.setGererarbaraja();}
	
	public void keyPressed(int key){ if (!paused) pnlJuego.keyPressed(key);}
	public void pause() throws InterruptedException{ solitario.pause(); paused = !paused;}
	public void setTime(String time) {pnlPuntaje.setTime(time);}

	public void setBarajain(String num,String palo) 
	{
		String palo1="";
		if(palo.equalsIgnoreCase("pica")){palo1="imagenes/361.png";}
		else if(palo.equalsIgnoreCase("Trebol")){palo1="imagenes/362.png";}
		else if(palo.equalsIgnoreCase("Diamante")){palo1="imagenes/360.png";}
		else if(palo.equalsIgnoreCase("Corazon")){palo1="imagenes/359.png";}
		pnlJuego.setBarajaini(num, palo1);	
	}

	public void setBarajain2() {solitario.setEnlistarCola();}

	public void pilaIni(String num,String palo,int pil) 
	{
		String palo1="";
		if(palo.equalsIgnoreCase("pica")){palo1="imagenes/361.png";}
		else if(palo.equalsIgnoreCase("Trebol")){palo1="imagenes/362.png";}
		else if(palo.equalsIgnoreCase("Diamante")){palo1="imagenes/360.png";}
		else if(palo.equalsIgnoreCase("Corazon")){palo1="imagenes/359.png";}
		pnlJuego.setpilasini(num,palo1,pil);
	}
	
	public void juegoalistas()
	{
		solitario.setJuegoalistas();
	}
}