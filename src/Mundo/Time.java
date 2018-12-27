package Mundo;


public class Time implements Runnable {

	// Atributos de instancia	
	   private boolean paused, stopped;
	   private int mseg;
	   
	   private Solitario solitario;
	   
	   public Time(Solitario solitario)
	   { 	this.paused = this.stopped = false;
	   		this.solitario=solitario;
	   }
	   
	   public void setSleep(int mseg) { this.mseg = mseg; }
	   
	   public void start(int mseg)
	   { new Thread(this, "Player").start(); this.mseg = mseg; }
	   
	   public synchronized void pause() 
	   { if (paused) resume();
	     else paused = true;
	    }
	   
	   public synchronized void resume()
	   { paused = false; notify(); } 
	   
	   public synchronized void stop() 
	   { stopped = true; notify(); }
	   
	public void run() {
		 { while (!stopped)
	     { try 
	       { synchronized (this) 
		     { if (paused) 
		       {   wait(); }
		     }
	         Thread.sleep(this.mseg); 
	         solitario.move();				// Metodo que actualiza el mundo 
	       } 
	       catch (InterruptedException ex)
	       { System.out.println(ex);
	       }
	     }    
	   }
	}

}
