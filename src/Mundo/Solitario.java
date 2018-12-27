package Mundo;

import Controlador.Controlador;
import java.util.*;

public class Solitario {

	private Time time;
	private Controlador ctrl;
	private int seconds,minutes;
	private boolean enlistar;
	private static Carta cartas = new Carta(0,null,null);
	private static Queue<Carta> cola = new Queue<Carta>();
	private static StackLis<Carta> pila1 = new StackLis<Carta>();
	private static StackLis<Carta> pila2 = new StackLis<Carta>();
	private static StackLis<Carta> pila3 = new StackLis<Carta>();
	private static StackLis<Carta> pila4 = new StackLis<Carta>();
	private static StackLis<Carta> pila5 = new StackLis<Carta>();
	private static StackLis<Carta> pila6 = new StackLis<Carta>();
	private static StackLis<Carta> pila7 = new StackLis<Carta>();
	private static Lista<Carta> lista1 = new Lista<Carta>();
	private static Lista<Carta> lista2 = new Lista<Carta>();
	private static Lista<Carta> lista3 = new Lista<Carta>();
	private static Lista<Carta> lista4 = new Lista<Carta>();
	private Carta baraja[]= new Carta[52];
	private Carta colaIni[] = new Carta[24];
	private Carta pilas[] = new Carta[28];
	private Carta listo;
	
	public Solitario(){seconds=0;minutes=0;enlistar=true;listo=null;}
	public void setSleep(int mseg) { time.setSleep(mseg); }
	public void move(){seconds++;setTimeho();}
	public void initThread(Controlador controlador)
    {this.ctrl=controlador;time = new Time(this);time.start(1000);}
	public void pause(){time.pause();}
	
	public void setTimeho()
	{
		if(seconds>59)
		{	
			seconds=0;
			minutes++;
			if(seconds<10&&minutes<10)
			{ctrl.setTime("0"+String.valueOf(minutes)+":"+"0"+String.valueOf(seconds));}
			else if(seconds>=10&&minutes<10)
			{ctrl.setTime("0"+String.valueOf(minutes)+":"+String.valueOf(seconds));}
			else if(seconds<10&&minutes>=10)
			{ctrl.setTime(String.valueOf(minutes)+":"+"0"+String.valueOf(seconds));}
			else
			{ctrl.setTime(String.valueOf(minutes)+":"+String.valueOf(seconds));}
		}
		else
		{
			if(seconds<10&&minutes<10)
			{ctrl.setTime("0"+String.valueOf(minutes)+":"+"0"+String.valueOf(seconds));}
			else if(seconds>=10&&minutes<10)
			{ctrl.setTime("0"+String.valueOf(minutes)+":"+String.valueOf(seconds));}
			else if(seconds<10&&minutes>=10)
			{ctrl.setTime(String.valueOf(minutes)+":"+"0"+String.valueOf(seconds));}
			else
			{ctrl.setTime(String.valueOf(minutes)+":"+String.valueOf(seconds));}
		}
		
	}
	public void setGererarbaraja() 
	{
		cartas.setGenerarBaraja();
		cartas.setDesordenarBaraja();
		baraja = cartas.getbarajas();
		setColaInicial();
		setPilasJuego();
		setEnlistarCola();
	}
	
	public void setColaInicial()
	{
		
		for(int i=0;i<colaIni.length;i++)
		{
			colaIni[i]=baraja[i];
		}
		
		for(int i=0;i<colaIni.length;i++)
		{
			System.out.println(colaIni[i].getNum()+" "+colaIni[i].getPalo()+" "+colaIni[i].getColor());
		}
		
		for(int i =0;i<colaIni.length;i++)
		{
			cola.equeue(new Carta(colaIni[i].getNum(),colaIni[i].getPalo(),colaIni[i].getColor()));
		}
		
		System.out.println(cola.size());
		
		ctrl.setBarajain(String.valueOf(colaIni[0].getNum()),colaIni[0].getPalo());
	}
	
	public String getNum(int num){return String.valueOf(colaIni[num].getNum());}
	public String getPalo(int num){return String.valueOf(colaIni[num].getPalo());}
	
	public void setPilasJuego()
	{
		int aux =24;
		for(int i=0;i<pilas.length;i++)
		{			
			pilas[i]=baraja[aux];
			aux++;
		}
		System.out.println("Pilas: ");
		for(int i=0;i<pilas.length;i++){System.out.println(pilas[i].getNum()+" "+pilas[i].getPalo()+" "+pilas[i].getColor());}
		int p1=27,p2=25,p3=22,p4=18,p5=13,p6=7;
		for(int i =0;i<7;i++)
		{
			pila7.push(new Carta(pilas[i].getNum(),pilas[i].getPalo(),pilas[i].getColor()));
			if(p6<13){pila6.push(new Carta(pilas[p6].getNum(),pilas[p6].getPalo(),pilas[p6].getColor()));p6++;}
			if(p5<18){pila5.push(new Carta(pilas[p5].getNum(),pilas[p5].getPalo(),pilas[p5].getColor()));p5++;}
			if(p4<22){pila4.push(new Carta(pilas[p4].getNum(),pilas[p4].getPalo(),pilas[p4].getColor()));p4++;}
			if(p3<25){pila3.push(new Carta(pilas[p3].getNum(),pilas[p3].getPalo(),pilas[p3].getColor()));p3++;}
			if(p2<27){pila2.push(new Carta(pilas[p2].getNum(),pilas[p2].getPalo(),pilas[p2].getColor()));p2++;}
			if(p1<28){pila1.push(new Carta(pilas[p1].getNum(),pilas[p1].getPalo(),pilas[p1].getColor()));p1++;}
		}
			ctrl.pilaIni(String.valueOf(pilas[6].getNum()),pilas[6].getPalo(),12);
			ctrl.pilaIni(String.valueOf(pilas[12].getNum()),pilas[12].getPalo(),31);
			ctrl.pilaIni(String.valueOf(pilas[17].getNum()),pilas[17].getPalo(),49);
			ctrl.pilaIni(String.valueOf(pilas[21].getNum()),pilas[21].getPalo(),66);
			ctrl.pilaIni(String.valueOf(pilas[24].getNum()),pilas[24].getPalo(),82);
			ctrl.pilaIni(String.valueOf(pilas[26].getNum()),pilas[26].getPalo(),97);
			ctrl.pilaIni(String.valueOf(pilas[27].getNum()),pilas[27].getPalo(),111);
	}
	
	public void setEnlistarCola()
	{
		if(enlistar)
		{
			listo = cola.dequeue();
			enlistar=false;
			System.out.println(listo.getNum()+" "+listo.getPalo());
			System.out.println(cola.size());
		}
		else if(enlistar==false)
		{
			//Iterator iter = cola.iterator();
			
			cola.equeue(listo);
			listo=cola.dequeue();
			ctrl.setBarajain(String.valueOf(listo.getNum()),listo.getPalo());
			System.out.println(cola.size());
			System.out.println(cola.iterator().next().getNum()+" "+cola.iterator().next().getPalo());
			
			
		}
		
		
	}

	public void setJuegoalistas()
	{
		
	}
}
