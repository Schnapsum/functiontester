package gui;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import lib.LoadNumbers;
import objects.Draw;
import objects.DrawManager;

public class GUI {

	private JFrame frmFunktionTester;
	
	/**
	 * Object to handle the access to the draws
	 */
	private DrawManager manager;
	
	private JTextField txtFunktion;
	private JTextField txtMatches;
	private JTextField txtMatchesOf;
	private JTextField txtChecked;
	private JTextField txtNumberFunction;

	private JList<Draw> lstFunktionen;
	
	private JButton btnStart;
	private JButton btnStop;
	
	private JPanel panel;
	private JScrollPane scrollPane_1;
	
	private JLabel lblAktuelleFunktion;
	private JLabel lbZutreffend;
	private JLabel lblDivider;
	private JLabel lblChecked;
	private JLabel lblFunktionNr;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmFunktionTester.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.manager = new DrawManager();
		manager.setDraws((new LoadNumbers()).loadNumbers());
		
		this.initFrame();
		this.initTopPanel();
		this.initBottomPanel();
		this.initValues();
	}
	
	
	private void initValues(){
		
		
	}
	

	private void initFrame(){
		frmFunktionTester = new JFrame();
		frmFunktionTester.setTitle("Funktionstester");
		frmFunktionTester.setType(Type.UTILITY);
		frmFunktionTester.setResizable(false);
		frmFunktionTester.setBounds(100, 100, 500, 302);
		frmFunktionTester.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFunktionTester.getContentPane().setLayout(new GridLayout(2, 1, 0, 0));
	}
	
	private void initTopPanel(){
		panel = new JPanel();
		frmFunktionTester.getContentPane().add(panel);
		panel.setLayout(null);	
		
		this.initStartButton();
		this.initStopButton();
		this.initLabels();
		this.initTextfields();
	}
	
	private void initBottomPanel(){
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		frmFunktionTester.getContentPane().add(scrollPane_1);
		
		this.initList();
	}
	
	private void initStartButton(){
		btnStart = new JButton("Start");
		btnStart.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == KeyEvent.VK_ENTER){
					
				}
			}
		});
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(arg0.getButton() == MouseEvent.BUTTON1){
					
				}
			}
		});
		btnStart.setBounds(10, 11, 89, 23);
		panel.add(btnStart);
	}
	
	private void initStopButton(){
		btnStop = new JButton("Stop");
		btnStop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnStop.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		btnStop.setBounds(109, 11, 89, 23);
		panel.add(btnStop);
	}
	
	private void initLabels(){
		lblAktuelleFunktion = new JLabel("Aktuelle Funktion:");
		lblAktuelleFunktion.setBounds(10, 45, 139, 14);
		panel.add(lblAktuelleFunktion);
		
		lbZutreffend = new JLabel("Zutreffend:");
		lbZutreffend.setBounds(10, 92, 139, 14);
		panel.add(lbZutreffend);

		lblDivider = new JLabel("/");
		lblDivider.setBounds(428, 92, 10, 14);
		panel.add(lblDivider);

		lblChecked = new JLabel("Gepr\u00FCft:");
		lblChecked.setBounds(10, 70, 139, 14);
		panel.add(lblChecked);
		
		lblFunktionNr = new JLabel("Funktion Nr.:");
		lblFunktionNr.setBounds(10, 115, 139, 14);
		panel.add(lblFunktionNr);
	}
	
	private void initTextfields(){
		txtFunktion = new JTextField();
		txtFunktion.setEditable(false);
		txtFunktion.setBounds(159, 45, 325, 20);
		panel.add(txtFunktion);
		txtFunktion.setColumns(10);
		
		txtMatches = new JTextField();
		txtMatches.setEditable(false);
		txtMatches.setBounds(378, 89, 46, 20);
		panel.add(txtMatches);
		txtMatches.setColumns(10);
		
		txtMatchesOf = new JTextField();
		txtMatchesOf.setEditable(false);
		txtMatchesOf.setBounds(438, 89, 46, 20);
		panel.add(txtMatchesOf);
		txtMatchesOf.setColumns(10);
		
		txtChecked = new JTextField();
		txtChecked.setEditable(false);
		txtChecked.setBounds(378, 67, 106, 20);
		panel.add(txtChecked);
		txtChecked.setColumns(10);
		
		txtNumberFunction = new JTextField();
		txtNumberFunction.setEditable(false);
		txtNumberFunction.setBounds(378, 112, 106, 20);
		panel.add(txtNumberFunction);
		txtNumberFunction.setColumns(10);
	}
	
	private void initList(){
		lstFunktionen = new JList<Draw>();
		scrollPane_1.setViewportView(lstFunktionen);
		
		lstFunktionen.setFocusTraversalKeysEnabled(false);
		lstFunktionen.setFocusable(false);
		lstFunktionen.setEnabled(false);
		lstFunktionen.setListData(manager.getDraws());
	}
}
