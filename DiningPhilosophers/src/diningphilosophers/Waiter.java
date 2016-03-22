package diningphilosophers;
import GUI.DiningGUI;

public class Waiter 
{
	private static final int AMOUNT_OF_PHILOSOPHERS = 5;
    private boolean fork_States[] = new boolean[AMOUNT_OF_PHILOSOPHERS]; // false = Being Used, true = Available
    private DiningGUI gui;
    private Philosopher[] philosophers;
    
    public Waiter(DiningGUI gui) 
    {
    	this.philosophers = new Philosopher[AMOUNT_OF_PHILOSOPHERS];
    	this.gui = gui;
        for(int i=0;i<AMOUNT_OF_PHILOSOPHERS;i++) 
        {
            fork_States[i]=true;//Initialize forks to available
        }
    }
    
    //The waiter will sit the philosophers down (create and start the Threads, this happens in the Philo class)
    public void startServing(){
        for(int i=0; i<AMOUNT_OF_PHILOSOPHERS; i++)
        {
            philosophers[i] = new Philosopher(i,this); 
        }
        
    }
    
    public Philosopher[] getPhilosophers() {
		return philosophers;
	}

	public void setPhilosophers(Philosopher[] philosophers) {
		this.philosophers = philosophers;
	}

	public synchronized void canIEat(int pId)
    {
    	gui.getAllSpeakingLabels()[pId].setText("Hey Waiter! Can i eat?"); //little bit of cheat, should come from philosopher thread.. ITS JUST TEXT
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
        while(!fork_States[pId] || !fork_States[(pId+1)%AMOUNT_OF_PHILOSOPHERS]) // If two adjacent forks isn't available, wait()
        { 
            try
            {
                System.out.println("Sigh, i will wait said " + Thread.currentThread().getName());
            	wait();
                
            }
            catch(InterruptedException e)
            {
            	System.out.println("What the hell!??? said " + Thread.currentThread().getName());
            	e.printStackTrace();
            } 
        }
        	
        gui.getAllSpeakingLabels()[5].setText("Sure "+Thread.currentThread().getName()+", you can eat!"); //magic number 5 - GUI is made for 5 forks and philosophers
        philosophers[pId].setState(PhilosopherState.EATING);
        System.out.println(Thread.currentThread().getName() + " begins eating");
        fork_States[pId] = false; // Set the fork with the same id as the philosopher to Unavailable
        fork_States[(pId+1)%AMOUNT_OF_PHILOSOPHERS] = false; // Set the fork with the same id+1 % 5 as the Philosopher to Unavailable
        
        
        
        
        
        //Set some icons and texts on the GUI
        int currentAmount = Integer.parseInt(gui.getAllStatusValueLabels()[pId].getText());
        currentAmount++;
        gui.getAllStatusValueLabels()[pId].setText(currentAmount+"");
        gui.getAllPhilosopherImages()[pId].setIcon(gui.getAllImageIcons()[0]);//0 == eat
        gui.getAllForkImages()[pId].setIcon(gui.getAllForkIcons()[1]);//1 = fork taken
        gui.getAllForkImages()[(pId+1)%5].setIcon(gui.getAllForkIcons()[1]);//1 = fork taken
        gui.getAllSpeakingLabels()[pId].setText("...");
    }

    public synchronized void stopEating(int pId)
    {
        fork_States[pId] = true; // Set first philosopher fork available
        fork_States[(pId+1)%5] = true;// Set second philosopher fork available
        philosophers[pId].setState(PhilosopherState.THINKING);
        gui.getAllForkImages()[pId].setIcon(gui.getAllForkIcons()[0]);//0 = fork available
        gui.getAllForkImages()[(pId+1)%5].setIcon(gui.getAllForkIcons()[0]);//0 = fork available
        gui.getAllSpeakingLabels()[pId].setText("Thinking hard and long..");
        System.out.println(Thread.currentThread().getName() + " begins thinking");
        gui.getAllPhilosopherImages()[pId].setIcon(gui.getAllImageIcons()[2]);//2 == think
        notify(); // Allow another waiting philosopher to continue
    }
    
    
    public void closeBusiness(){
    	for (int i = 0; i < philosophers.length; i++) {
			philosophers[i].setAlive(false);
		}
    }
}