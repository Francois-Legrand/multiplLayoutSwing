package fr.francois.cardLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MultipleLayouts {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultipleLayouts window = new MultipleLayouts();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MultipleLayouts() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(-40, 0, 476, 241);
		frame.getContentPane().add(splitPane);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		
		JPanel pnlCards = new JPanel();
		splitPane.setRightComponent(pnlCards);
		pnlCards.setLayout(new CardLayout(0, 0));
		
		CardLayout cardLayout;
		cardLayout = (CardLayout) (pnlCards.getLayout());
		
		JPanel pnlCard1 = new JPanel();
		pnlCard1.setBackground(Color.WHITE);
		pnlCards.add(pnlCard1, "pnlCard1");
		
		JLabel lblNewLabel = new JLabel("creation eleve");
		pnlCard1.add(lblNewLabel);
		
		//pnlCard1.getRootPane();
		
		JPanel pnlCard2 = new JPanel();
		pnlCard2.setBackground(Color.WHITE);
		pnlCards.add(pnlCard2, "pnlCard2");
		
		JLabel lblNewLabel_1 = new JLabel("creation salle");
		pnlCard2.add(lblNewLabel_1);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("create students");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pnlCards, "pnlCard1");
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("create room");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pnlCards, "pnlCard2");
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		frame.getContentPane().setLayout(null);
		
	}
}
