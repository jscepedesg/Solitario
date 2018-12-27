package InterfazApp;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controlador.Controlador;

public class PanelPuntaje extends JPanel{
	
	private Controlador ctrl;
	private JLabel dat[] = new JLabel[5];
	public PanelPuntaje(Controlador ctrl)
	{
		setBackground(new Color(55,55,55));
		setLayout( null );
		//Integar controlador
		this.ctrl=ctrl;
		
		//Texto Datos
		 dat[0] = new JLabel("SOLITARIO ");
		 Font auxFont=dat[0].getFont();
	     dat[0].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
	     dat[0].setForeground(Color.RED);
	     dat[0].setBounds(330, 20, 300, 25);
	     add(dat[0]);
	     
	     dat[1] = new JLabel("Puntaje: ");
		 Font auxFont1=dat[1].getFont();
	     dat[1].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
	     dat[1].setForeground(Color.RED);
	     dat[1].setBounds(20, 18, 200, 30);
	     add(dat[1]);
	     
	     dat[2] = new JLabel("Tiempo: ");
		 Font auxFont2=dat[2].getFont();
	     dat[2].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
	     dat[2].setForeground(Color.RED);
	     dat[2].setBounds(600, 18, 200, 25);
	     add(dat[2]);
	     
	     dat[3] = new JLabel("1000");
		 Font auxFont3=dat[3].getFont();
	     dat[3].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
	     dat[3].setForeground(Color.BLACK);
	     dat[3].setBounds(130, 25, 100, 20);
	     add(dat[3]);
	     
	     dat[4] = new JLabel("00:00");
		 Font auxFont4=dat[4].getFont();
	     dat[4].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
	     dat[4].setForeground(Color.BLACK);
	     dat[4].setBounds(710, 20, 200, 20);
	     add(dat[4]);
		
		
	}
	
	public void setTime(String time){ dat[4].setText(time);}

}
