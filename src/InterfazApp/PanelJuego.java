package InterfazApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

import Controlador.Controlador;

public class PanelJuego extends JPanel implements ActionListener,MouseListener, MouseMotionListener{
	
	private Controlador ctrl;
	private JLabel listaFinal[] = new JLabel[4];
	private JLabel numLista[] = new JLabel[4];
	private JLabel pilaJuego[] = new JLabel[112];
	private JLabel numpila[] = new JLabel[112];
	private JLabel colaInicio;
	private JLabel[] numCola = new JLabel[1];
	private Font font[]=new Font[112];
	private Icon cartaIcon;
	private String cartanum;
	
	private JButton btngenerar;
	
	public PanelJuego(Controlador ctrl)
	{
		
		setBackground(new Color(52,149,82));
		setLayout( null );
		
		//Integar controlador
		this.ctrl=ctrl;
		
		btngenerar = new JButton();
	    btngenerar.addActionListener(this);
		add(btngenerar);
		btngenerar.setBounds(30, 30, 95, 125);
		btngenerar.setIcon(new ImageIcon("imagenes/303.png"));
		
		 numCola[0] = new JLabel("13");
		 Font auxFonta23=numCola[0].getFont();
		 numCola[0].setFont(new Font(auxFonta23.getFontName(), auxFonta23.getStyle(), 25));
		 numCola[0].setForeground(Color.BLACK);
		 numCola[0].setBounds(155, 30, 30, 30);
	     add(numCola[0]);
	     
		colaInicio = new JLabel();
		 Font auxFonta=colaInicio.getFont();
		 colaInicio.setFont(new Font(auxFonta.getFontName(), auxFonta.getStyle(), 25));
		 colaInicio.setForeground(Color.BLUE.darker().darker().darker().darker());
		 colaInicio.setIcon(new ImageIcon("imagenes/361.png"));
		 colaInicio.setBounds(150, 30, 95, 125);
	     add(colaInicio);
	     
	    
	    int auxli=390;
	     for(int i=0;i<4;i++)
	     {
	    	 numLista[i] = new JLabel("");
	    	 font[i] = numLista[i].getFont();
	    	 numLista[i].setFont(new Font(auxFonta.getFontName(), auxFonta.getStyle(), 25));
	    	 numLista[i].setForeground(Color.BLACK);
	    	 numLista[i].setBounds(auxli, 30, 30, 30);
	    	 add(numLista[i]);
	    	 auxli=auxli+115;
	     }
	     
		listaFinal[0] = new JLabel();
		 Font auxFont=listaFinal[0].getFont();
		 listaFinal[0].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
		 listaFinal[0].setForeground(Color.BLUE.darker().darker().darker().darker());
		 listaFinal[0].setIcon(new ImageIcon("imagenes/305.png"));
		 listaFinal[0].setBounds(385, 30, 95, 125);
	     add(listaFinal[0]);
	     
	    
	     
		//Texto C.c
	     listaFinal[1] = new JLabel();
		 Font auxFont1=listaFinal[1].getFont();
		 listaFinal[1].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 15));
		 listaFinal[1].setForeground(Color.BLUE.darker().darker().darker());
		 listaFinal[1].setIcon(new ImageIcon("imagenes/305.png"));
		 listaFinal[1].setBounds(500, 30, 95, 125);
	     add(listaFinal[1]);
	     
	   //Texto Nombre
	     listaFinal[2] = new JLabel();
		 Font auxFont2=listaFinal[2].getFont();
		 listaFinal[2].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 15));
		 listaFinal[2].setForeground(Color.BLUE.darker().darker().darker());
		 listaFinal[2].setIcon(new ImageIcon("imagenes/305.png"));
		 listaFinal[2].setBounds(615, 30, 95, 125);
	     add(listaFinal[2]);
	     
	     listaFinal[3] = new JLabel();
		 Font auxFont3=listaFinal[3].getFont();
		 listaFinal[3].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 15));
		 listaFinal[3].setForeground(Color.BLUE.darker().darker().darker());
		 listaFinal[3].setIcon(new ImageIcon("imagenes/305.png"));
		 listaFinal[3].setBounds(730, 30, 95, 125);
	     add(listaFinal[3]);
	     
	     
	     int aux =430; 
	     for(int i =0;i<=18;i++)
	     {
	    	
	    	 if(i>12)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(735, aux, 30, 30);
				 add(numpila[i]);
			     
	    	 	pilaJuego[i] = new JLabel();
		 		font[i] = pilaJuego[i].getFont();
		 		pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
		 		pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
		 		pilaJuego[i].setIcon(new ImageIcon("imagenes/303.png"));
		 		pilaJuego[i].setBounds(730, aux, 95, 125);
	     		add(pilaJuego[i]);
	     		aux=aux-13;
	    	 }
	    	 else if(i==12)
	    	 {
	    		 
	    		 numpila[i] = new JLabel("13");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(735, aux, 30, 30);
			     add(numpila[i]);
			     
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon("imagenes/359.png"));
				 pilaJuego[i].setBounds(730, aux, 95, 125);
			     add(pilaJuego[i]);
			     
			     aux=aux-13;
	    	 }
	    	 else if(i<12)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(735, aux, 30, 30);
			     add(numpila[i]);
			     
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon());
				 pilaJuego[i].setBounds(730, aux, 95, 125);
			     add(pilaJuego[i]);
			     aux=aux-13;
	    	 }
	    	 
	    	 
	    	 
	    	 
	     }     
	     //2Ciclo
	     int aux1=417;
	     for(int i =19;i<=36;i++)
	     {
	    	
	    	 if(i>31)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(620, aux1, 30, 30);
				 add(numpila[i]);
				 
	    	 	pilaJuego[i] = new JLabel();
		 		font[i] = pilaJuego[i].getFont();
		 		pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
		 		pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
		 		pilaJuego[i].setIcon(new ImageIcon("imagenes/303.png"));
		 		pilaJuego[i].setBounds(615, aux1, 95, 125);
	     		add(pilaJuego[i]);
	     		aux1=aux1-13;
	    	 }
	    	 else if(i==31)
	    	 {
	    		 
	    		 numpila[i] = new JLabel("13");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(620, aux1, 30, 30);
				 add(numpila[i]);
				 
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon("imagenes/361.png"));
				 pilaJuego[i].setBounds(615, aux1, 95, 125);
			     add(pilaJuego[i]);
			     aux1=aux1-13;
	    	 }
	    	 else if(i<31)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(620, aux1, 30, 30);
				 add(numpila[i]);
				 
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon());
				 pilaJuego[i].setBounds(615, aux1, 95, 125);
			     add(pilaJuego[i]);
			     aux1=aux1-13;
	    	 }
	     }
	     
	     //3Ciclo
	     
	     int aux2=405;
	     for(int i =37;i<=53;i++)
	     {
	    	
	    	 if(i>49)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(505, aux2, 30, 30);
				 add(numpila[i]);
				 
	    	 	pilaJuego[i] = new JLabel();
		 		font[i] = pilaJuego[i].getFont();
		 		pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
		 		pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
		 		pilaJuego[i].setIcon(new ImageIcon("imagenes/303.png"));
		 		pilaJuego[i].setBounds(500, aux2, 95, 125);
	     		add(pilaJuego[i]);
	     		aux2=aux2-13;
	     		
	    	 }
	    	 else if(i==49)
	    	 {
	    		 numpila[i] = new JLabel("13");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(505, aux2, 30, 30);
				 add(numpila[i]);
				 
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon("imagenes/360.png"));
				 pilaJuego[i].setBounds(500, aux2, 95, 125);
			     add(pilaJuego[i]);
			     aux2=aux2-13;
	    	 }
	    	 else if(i<49)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(505, aux2, 30, 30);
				 add(numpila[i]);
				 
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon());
				 pilaJuego[i].setBounds(500, aux2, 95, 125);
			     add(pilaJuego[i]);
			     aux2=aux2-13;
	    	 }
	     }
	     //Cuarto ciclo
	     int aux3=392;
	     for(int i =54;i<=69;i++)
	     {
	    	
	    	 if(i>66)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(390, aux3, 30, 30);
				 add(numpila[i]);
				 
	    	 	pilaJuego[i] = new JLabel();
		 		font[i] = pilaJuego[i].getFont();
		 		pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
		 		pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
		 		pilaJuego[i].setIcon(new ImageIcon("imagenes/303.png"));
		 		pilaJuego[i].setBounds(385, aux3, 95, 125);
	     		add(pilaJuego[i]);
	     		aux3=aux3-13;
	     		
	    	 }
	    	 else if(i==66)
	    	 {
	    		 numpila[i] = new JLabel("13");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(390, aux3, 30, 30);
				 add(numpila[i]);
				 
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon("imagenes/362.png"));
				 pilaJuego[i].setBounds(385, aux3, 95, 125);
			     add(pilaJuego[i]);
			     aux3=aux3-13;
	    	 }
	    	 else if(i<66)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(390, aux3, 30, 30);
				 add(numpila[i]);
				 
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon());
				 pilaJuego[i].setBounds(385, aux3, 95, 125);
			     add(pilaJuego[i]);
			     aux3=aux3-13;
	    	 }
	     }
	     
	     
	   //Quinto ciclo
	     int aux4=380;
	     for(int i =70;i<=84;i++)
	     {
	    	
	    	 if(i>82)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(275, aux4, 30, 30);
				 add(numpila[i]);
				 
	    	 	pilaJuego[i] = new JLabel();
		 		font[i] = pilaJuego[i].getFont();
		 		pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
		 		pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
		 		pilaJuego[i].setIcon(new ImageIcon("imagenes/303.png"));
		 		pilaJuego[i].setBounds(270, aux4, 95, 125);
	     		add(pilaJuego[i]);
	     		aux4=aux4-13;
	     		
	    	 }
	    	 else if(i==82)
	    	 {
	    		 numpila[i] = new JLabel("13");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(275, aux4, 30, 30);
				 add(numpila[i]);
				 
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon("imagenes/359.png"));
				 pilaJuego[i].setBounds(270, aux4, 95, 125);
			     add(pilaJuego[i]);
			     aux4=aux4-13;
	    	 }
	    	 else if(i<82)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(275, aux4, 30, 30);
				 add(numpila[i]);
				 
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon());
				 pilaJuego[i].setBounds(270, aux4, 95, 125);
			     add(pilaJuego[i]);
			     aux4=aux4-13;
	    	 }
	     }
	     
	     //Sexto Ciclo
	     int aux5=368;
	     for(int i =85;i<=98;i++)
	     {
	    	
	    	 if(i>97)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(160, aux5, 30, 30);
				 add(numpila[i]);
				 
	    	 	pilaJuego[i] = new JLabel();
		 		font[i] = pilaJuego[i].getFont();
		 		pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
		 		pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
		 		pilaJuego[i].setIcon(new ImageIcon("imagenes/303.png"));
		 		pilaJuego[i].setBounds(155, aux5, 95, 125);
	     		add(pilaJuego[i]);
	     		aux5=aux5-13;
	     		
	    	 }
	    	 else if(i==97)
	    	 {
	    		 numpila[i] = new JLabel("13");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(160, aux5, 30, 30);
				 add(numpila[i]);
				 
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon("imagenes/361.png"));
				 pilaJuego[i].setBounds(155, aux5, 95, 125);
			     add(pilaJuego[i]);
			     aux5=aux5-13;
	    	 }
	    	 else if(i<97)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(160, aux5, 30, 30);
				 add(numpila[i]);
				 
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon());
				 pilaJuego[i].setBounds(155, aux5, 95, 125);
			     add(pilaJuego[i]);
			     aux5=aux5-13;
	    	 }
	     }
	     
	   //Septimo Ciclo
	     int aux6=356;
	     for(int i =99;i<=111;i++)
	     {
	    	
	    	 if(i>111)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(45, aux6, 30, 30);
				 add(numpila[i]);
				 
	    	 	pilaJuego[i] = new JLabel();
		 		font[i] = pilaJuego[i].getFont();
		 		pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
		 		pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
		 		pilaJuego[i].setIcon(new ImageIcon("imagenes/303.png"));
		 		pilaJuego[i].setBounds(40, aux6, 95, 125);
	     		add(pilaJuego[i]);
	     		aux6=aux6-13;
	     		
	    	 }
	    	 else if(i==111)
	    	 {
	    		 numpila[i] = new JLabel("13");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(45, aux6, 30, 30);
				 add(numpila[i]);
				 
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon("imagenes/360.png"));
				 pilaJuego[i].setBounds(40, aux6, 95, 125);
			     add(pilaJuego[i]);
			     aux6=aux6-13;
	    	 }
	    	 else if(i<111)
	    	 {
	    		 numpila[i] = new JLabel("");
				 font[i] = numpila[i].getFont();
				 numpila[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 numpila[i].setForeground(Color.BLACK);
				 numpila[i].setBounds(45, aux6, 30, 30);
				 add(numpila[i]);
				 
	    		 pilaJuego[i] = new JLabel();
				 font[i] = pilaJuego[i].getFont();
				 pilaJuego[i].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
				 pilaJuego[i].setForeground(Color.BLUE.darker().darker().darker().darker());
				 pilaJuego[i].setIcon(new ImageIcon());
				 pilaJuego[i].setBounds(40, aux6, 95, 125);
			     add(pilaJuego[i]);
			     aux6=aux6-13;
	    	 }
	     }
	   
	     
	}

	
	public void actionPerformed(ActionEvent e) {ctrl.setBarajain2();}
	public void keyPressed(int key) {}
	
	public void setBarajaini(String num,String img)
	{numCola[0].setText(num);colaInicio.setIcon(new ImageIcon(img));}
	
	public void setpilasini(String num,String img,int num1)
	{
		numpila[num1].setText(num);pilaJuego[num1].setIcon(new ImageIcon(img));
	}
	public void setListaFinal(Icon icon,String cartanum,int num)
	{
		listaFinal[num].setIcon(icon);
		numLista[num].setText(cartanum);
	}



	public void mouseDragged(MouseEvent e) 
	{
		//System.out.println("Pocicion en x: "+e.getX()+"Pocicion en y: "+e.getY());
		if(161<e.getX()&&e.getX()<250&&137<e.getY()&&e.getY()<254)
		{
			System.out.println("Esta dentro de la carta baraja");
			cartaIcon=colaInicio.getIcon();
			cartanum=numCola[0].getText();
			System.out.println(colaInicio.getIcon()+" "+numCola[0].getText());
		}
		/*else if(255<e.getX()&&e.getX()<346&&70<e.getY()&&e.getY()<192)
		{
			System.out.println("Esta dentro de la carta 2");
			carta="src/imagenes/361.png";
		
		}*/
	}
	public void mouseMoved(MouseEvent e) {}

	public void mouseClicked(MouseEvent e) {System.out.println("Pocicion en x: "+e.getX()+"Pocicion en y: "+e.getY());}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) 
	{
		if(cartaIcon!=null)
		{
			if(395<e.getX()&&e.getX()<483&&138<e.getY()&&e.getY()<256)
			{
				setListaFinal(cartaIcon,cartanum,0);
			}
			else if(510<e.getX()&&e.getX()<599&&138<e.getY()&&e.getY()<256)
			{
				setListaFinal(cartaIcon,cartanum,1);
			}
			else if(625<e.getX()&&e.getX()<715&&138<e.getY()&&e.getY()<256)
			{
				setListaFinal(cartaIcon,cartanum,2);
			}
			else if(740<e.getX()&&e.getX()<830&&138<e.getY()&&e.getY()<256)
			{
				setListaFinal(cartaIcon,cartanum,3);
			}
		}
	}
}