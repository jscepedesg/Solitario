package Mundo;

public class Carta {

	private int num;
	private String palo,color;
	private Carta baraja[] = new Carta[52];
	
	public Carta(int num,String palo,String color)
	{
		this.num=num;
		this.palo=palo;
		this.color=color;
		
	}

	public int getNum() {
		return num;
	}

	public String getPalo() {
		return palo;
	}

	public String getColor() {
		return color;
	}
	
	public void setGenerarBaraja()
	{
		int auxnum=0,auxpal=0,auxcol=0;
		String color[] = {"Negro","Rojo","Rojo","Negro"};
        int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        String palos[] = {"Pica","Corazon","Diamante","Trebol"};
        
        for(int i=0;i<52;i++) 
        {         
            baraja[i] = new Carta(numeros[auxnum++],palos[auxpal],color[auxcol]);
            if(auxnum==13){  auxnum=0; auxpal++; auxcol++; }             
        }
		
	}
	
	public void setDesordenarBaraja()
	{
        Carta[] aux = new Carta[1];       
        for(int i=0;i<100;i++)
        {
            int Random1 = (int)(Math.random()*52);
            int Random2 = (int)(Math.random()*52);
            aux[0] = baraja[Random1];
            baraja[Random1] = baraja[Random2];
            baraja[Random2] = aux[0];
        }           
    }
	
	public void setMostrarBaraja() 
	{
        for(int i=0;i<52;i++)
           System.out.println(baraja[i].palo + " : " + baraja[i].num+" : "+baraja[i].color);              
    }
	public Carta[] getbarajas()
	{
		return baraja;
	}
}
