package diningphilosophers;

import java.util.Random;

public class Philosopher implements Runnable 
{
    private Waiter waiter;
    private int philosopherId;
    private float time;
    private Thread philosopherThread;
    private PhilosopherState state;
    private boolean isAlive;
    private Random random = new Random();
 
	public Philosopher(int philosopherId, Waiter waiter) 
    {
		this.isAlive = true;
		this.state = PhilosopherState.THINKING;
    	this.philosopherThread = new Thread(this, "Philosopher " + philosopherId);
        this.philosopherId = philosopherId;
        this.waiter = waiter;
        this.philosopherThread.start(); // start the philosopher thread
       
    }

	public Thread getPhilosopherThread() {
		return philosopherThread;
	}

	public void setPhilosopherThread(Thread philosopherThread) {
		this.philosopherThread = philosopherThread;
	}

	public void run() //Will be executed when thread.start() is invoked
    { 
        System.out.println("Philosopher " + philosopherId + " sat down");
       
        while(isAlive)
        { 
            waiter.canIEat(philosopherId); 
            time = 100*random.nextInt(20);
            try 
            {
                Thread.sleep((int)time);
            } 
            catch(InterruptedException e)
            {
            }
            waiter.stopEating(philosopherId);
            time = 100*random.nextInt(20);
            try 
            {
                Thread.sleep((int)time);
            } 
            catch(InterruptedException e)
            {
            	e.printStackTrace();
            }
        }
    }
    public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	   public PhilosopherState getState() {
			return state;
		}
		public void setState(PhilosopherState state) {
			this.state = state;
		}
}