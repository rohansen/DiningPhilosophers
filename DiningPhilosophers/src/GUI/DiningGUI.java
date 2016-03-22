package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import diningphilosophers.Waiter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;

public class DiningGUI {

	private JFrame frmDiningPhilosophers;
	private JLabel label_0 = new JLabel();
	
	private final JLabel label_1 = new JLabel();
	private final JLabel label_2 = new JLabel();
	private final JLabel label_3 = new JLabel();
	private final JLabel label_4 = new JLabel();
	private final JLabel label = new JLabel("");
	private final JLabel fork_0 = new JLabel("");
	private final JLabel fork_1 = new JLabel("");
	private final JLabel fork_2 = new JLabel("");
	private final JLabel fork_3 = new JLabel("");
	private final JLabel fork_4 = new JLabel("");
	private final JLabel lbl_p0 = new JLabel("P0 Ate ");
	private final JLabel lbl_p1 = new JLabel("P1 Ate");
	private final JLabel lbl_p2 = new JLabel("P2 Ate ");
	private final JLabel lbl_p3 = new JLabel("P3 Ate ");
	private final JLabel lbl_p4 = new JLabel("P4 Ate ");
	private final JLabel label_5 = new JLabel("0");
	private final JLabel label_6 = new JLabel("0");
	private final JLabel label_7 = new JLabel("0");
	private final JLabel label_8 = new JLabel("0");
	private final JLabel label_9 = new JLabel("0");
	private final JLabel speak_0 = new JLabel("...");
	private final JLabel speak_1 = new JLabel("...");
	private final JLabel speak_2 = new JLabel("...");
	private final JLabel speak_3 = new JLabel("...");
	private final JLabel speak_4 = new JLabel("...");
	private final JLabel waiter_speak = new JLabel("...");
	private final JLabel lbl_Waiter = new JLabel("");
	private final JButton btnStop = new JButton("Stop");
	private Waiter w;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiningGUI window = new DiningGUI();
					window.frmDiningPhilosophers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DiningGUI() {
		w=new Waiter(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDiningPhilosophers = new JFrame();
		frmDiningPhilosophers.setTitle("Dining Philosophers");
		frmDiningPhilosophers.getContentPane().setBackground(Color.WHITE);
		frmDiningPhilosophers.setBounds(100, 100, 844, 730);
		frmDiningPhilosophers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDiningPhilosophers.getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("Start");
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					w.startServing();
				}
		});
		btnStart.setBounds(598, 13, 97, 25);
		frmDiningPhilosophers.getContentPane().add(btnStart);
	
		
		label_0.setIcon(new ImageIcon(DiningGUI.class.getResource("/images/thales_think.jpg")));
		label_0.setBounds(390, 466, 160, 171);
		frmDiningPhilosophers.getContentPane().add(label_0);
		label_4.setIcon(new ImageIcon(DiningGUI.class.getResource("/images/thales_think.jpg")));
		label_4.setBounds(434, 218, 160, 171);
		
		frmDiningPhilosophers.getContentPane().add(label_4);
		label_1.setIcon(new ImageIcon(DiningGUI.class.getResource("/images/thales_think.jpg")));
		label_1.setBounds(114, 466, 160, 171);
		
		frmDiningPhilosophers.getContentPane().add(label_1);
		label_2.setIcon(new ImageIcon(DiningGUI.class.getResource("/images/thales_think.jpg")));
		label_2.setBounds(12, 218, 160, 171);
		
		frmDiningPhilosophers.getContentPane().add(label_2);
		label_3.setIcon(new ImageIcon(DiningGUI.class.getResource("/images/thales_think.jpg")));
		label_3.setBounds(228, 13, 160, 171);
		
		frmDiningPhilosophers.getContentPane().add(label_3);
		label.setIcon(new ImageIcon(DiningGUI.class.getResource("/images/spaghetti2.png")));
		label.setBounds(184, 218, 226, 215);
		
		frmDiningPhilosophers.getContentPane().add(label);
		fork_0.setIcon(new ImageIcon(DiningGUI.class.getResource("/images/fork.png")));
		fork_0.setBounds(573, 416, 51, 242);
		
		frmDiningPhilosophers.getContentPane().add(fork_0);
		fork_1.setIcon(new ImageIcon(DiningGUI.class.getResource("/images/fork.png")));
		fork_1.setBounds(309, 436, 51, 242);
		
		frmDiningPhilosophers.getContentPane().add(fork_1);
		fork_2.setIcon(new ImageIcon(DiningGUI.class.getResource("/images/fork.png")));
		fork_2.setBounds(49, 416, 51, 242);
		
		frmDiningPhilosophers.getContentPane().add(fork_2);
		fork_3.setIcon(new ImageIcon(DiningGUI.class.getResource("/images/fork.png")));
		fork_3.setBounds(153, 0, 51, 242);
		
		frmDiningPhilosophers.getContentPane().add(fork_3);
		fork_4.setIcon(new ImageIcon(DiningGUI.class.getResource("/images/fork.png")));
		fork_4.setBounds(422, 17, 51, 242);
		
		frmDiningPhilosophers.getContentPane().add(fork_4);
		lbl_p0.setBounds(673, 88, 53, 16);
		
		frmDiningPhilosophers.getContentPane().add(lbl_p0);
		lbl_p1.setBounds(673, 117, 53, 16);
		
		frmDiningPhilosophers.getContentPane().add(lbl_p1);
		lbl_p2.setBounds(673, 146, 53, 16);
		
		frmDiningPhilosophers.getContentPane().add(lbl_p2);
		lbl_p3.setBounds(673, 175, 53, 16);
		
		frmDiningPhilosophers.getContentPane().add(lbl_p3);
		lbl_p4.setBounds(673, 204, 53, 16);
		
		frmDiningPhilosophers.getContentPane().add(lbl_p4);
		label_5.setBounds(738, 88, 53, 16);
		
		frmDiningPhilosophers.getContentPane().add(label_5);
		label_6.setBounds(738, 117, 53, 16);
		
		frmDiningPhilosophers.getContentPane().add(label_6);
		label_7.setBounds(738, 146, 53, 16);
		
		frmDiningPhilosophers.getContentPane().add(label_7);
		label_8.setBounds(738, 175, 53, 16);
		
		frmDiningPhilosophers.getContentPane().add(label_8);
		label_9.setBounds(738, 204, 53, 16);
		
		frmDiningPhilosophers.getContentPane().add(label_9);
		speak_0.setBounds(400, 650, 150, 16);
		
		frmDiningPhilosophers.getContentPane().add(speak_0);
		speak_1.setBounds(114, 642, 160, 16);
		
		frmDiningPhilosophers.getContentPane().add(speak_1);
		speak_2.setBounds(12, 387, 160, 16);
		
		frmDiningPhilosophers.getContentPane().add(speak_2);
		speak_3.setBounds(228, 189, 160, 16);
		
		frmDiningPhilosophers.getContentPane().add(speak_3);
		speak_4.setBounds(434, 402, 150, 16);
		
		frmDiningPhilosophers.getContentPane().add(speak_4);
		waiter_speak.setBounds(673, 444, 221, 16);
		
		frmDiningPhilosophers.getContentPane().add(waiter_speak);
		lbl_Waiter.setIcon(new ImageIcon(DiningGUI.class.getResource("/images/waiter.png")));
		lbl_Waiter.setBounds(673, 292, 141, 152);
		
		frmDiningPhilosophers.getContentPane().add(lbl_Waiter);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w.closeBusiness();
				for (int i = 0; i < w.getPhilosophers().length; i++) {
					try {
						w.getPhilosophers()[i].getPhilosopherThread().join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					getAllSpeakingLabels()[i].setText("awwwwww...");
				}
				getAllSpeakingLabels()[5].setText("Phew, greedy gits");
				JOptionPane.showMessageDialog(null, "Were closed boiss!!!!");
			}
		});
		btnStop.setBounds(598, 50, 97, 25);
		
		frmDiningPhilosophers.getContentPane().add(btnStop);
	}


	public JLabel[] getAllPhilosopherImages(){
		return new JLabel[]{ label_0,label_1,label_2, label_3,label_4};
	}
	public ImageIcon[] getAllImageIcons(){
		ImageIcon imageEat = new ImageIcon(this.getClass().getResource("/images/thales_eat.jpg"));
		ImageIcon imageIdle = new ImageIcon(this.getClass().getResource("/images/thales.jpg"));
		ImageIcon imageThink = new ImageIcon(this.getClass().getResource("/images/thales_think.jpg"));
		return new ImageIcon[]{imageEat,imageIdle,imageThink};
	}
	public ImageIcon[] getAllForkIcons(){
		ImageIcon fork = new ImageIcon(this.getClass().getResource("/images/fork.png"));
		ImageIcon formtaken = new ImageIcon(this.getClass().getResource("/images/fork2.png"));
		return new ImageIcon[]{ fork,formtaken };
	}
	
	public JLabel[] getAllForkImages(){
		return new JLabel[]{ fork_0,fork_1,fork_2, fork_3,fork_4};
	}
	
public JLabel[] getAllStatusLabels(){
		
		return new JLabel[]{lbl_p0, lbl_p1, lbl_p2, lbl_p3, lbl_p4};
	}
public JLabel[] getAllStatusValueLabels(){
	
	return new JLabel[]{label_5, label_6, label_7, label_8, label_9};
}
//index 0-4 is philosophers, index 5 is the waiter
public JLabel[] getAllSpeakingLabels(){
	
	return new JLabel[]{speak_0, speak_1, speak_2, speak_3, speak_4, waiter_speak};
}
	
	
}
