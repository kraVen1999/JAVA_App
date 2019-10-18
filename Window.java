import javax.swing.JFrame;

import javax.swing.JMenuBar;
import javax.swing.JMenu;


import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;

import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JTextArea;


public class Window extends JFrame{
	
	private static int widthWindow;
	private static int heightWindow;
	
	/*
	JPanel container = new JPanel();
	*/
	
	public Window(){
		
		super("Mondrian");
		this.widthWindow = 800;
		this.heightWindow = 600;
		
		this.setSize(this.widthWindow, this.heightWindow);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		// Construction et injection de la barre de menu
		this.setJMenuBar(this.createMenuBar());
		
		//Construction et injection de la barre d'outils
		JPanel contentPane = (JPanel) getContentPane();
		contentPane.add(this.createToolBar(), BorderLayout.NORTH);
		
		//Construction du containeur qui gere les operation d'affichage
		//JPanel container = new JPanel();
		//container.setBackground(Color.BLACK);
		
		JTextArea sortieText_SVG = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(sortieText_SVG);
		
		contentPane.add(sortieText_SVG,BorderLayout.CENTER);
		
	}
	
	//Accesseur
	
	public int getWidthWindow(){return this.widthWindow;}
	public int getHeightWindow(){return this.heightWindow;}
	
	private JMenuBar createMenuBar(){
	
		//Definition du menu deroulant "file" et de son contenu
	
		JMenuBar menuBar = new JMenuBar();
		
		//definition du menu deroulant  fichier
		JMenu menuFichier = new JMenu("Fichier");
		menuFichier.setMnemonic('F');
		
		
		// definition du menuNouveau
		JMenuItem menuNouveau = new JMenuItem("Nouveau Fichier");
		menuNouveau.setMnemonic('N');
		menuNouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		menuNouveau.setIcon(new ImageIcon("icons/new.png"));
		menuFichier.add(menuNouveau);
		
		//definition du menuOuvrir
		JMenuItem menuOuvrir = new JMenuItem("Ouvrir...");
		menuOuvrir.setMnemonic('O');
		menuOuvrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
		menuOuvrir.setIcon(new ImageIcon("icons/open.png"));
		menuFichier.add(menuOuvrir);
		
		//definition du menuEnregistrer
		JMenuItem menuEnregistrer = new JMenuItem("Enregistrer");
		menuEnregistrer.setMnemonic('S');
		menuEnregistrer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
		menuEnregistrer.setIcon(new ImageIcon("icons/save.png"));
		menuFichier.add(menuEnregistrer);
		
		//definition de enregistrer_sous
		JMenuItem menuEnregistrer_sous = new JMenuItem("Enregistrer sous...");
		menuEnregistrer_sous.setIcon(new ImageIcon("icons/save_as.png"));
		menuFichier.add(menuEnregistrer_sous);
		
		// definition de exit
		JMenuItem menuQuitter = new JMenuItem("Quitter");
		menuQuitter.setMnemonic('Q');
		menuQuitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK));
		menuQuitter.setIcon(new ImageIcon("icons/exit.png"));
		menuFichier.add(menuQuitter);
		
		
		JMenu menuEdition = new JMenu("Edition");
		
		// 
		JMenu menuAffichage = new JMenu("Affichage");
		JMenu menuAide = new JMenu("Aide");
	
		menuBar.add(menuFichier);
		menuBar.add(menuEdition);
		menuBar.add(menuAffichage);
		menuBar.add(menuAide);
	 
		return menuBar;
	}
	
	private JToolBar createToolBar(){
		JToolBar toolBar = new JToolBar();
		
		JButton rect = new JButton(new ImageIcon("icons/rect.png"));
		JButton circle = new JButton(new ImageIcon("icons/circle.png"));
		JButton line = new JButton(new ImageIcon("icons/line.png"));
		
		toolBar.add(rect);
		toolBar.add(circle);
		toolBar.add(line);
		
		return toolBar;
	}
	
	
	
	


}
