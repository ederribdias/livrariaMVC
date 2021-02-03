package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;

public class AWLivraria {

	public JFrame frmLivraria;

	/**
	 * Create the application.
	 */
	public AWLivraria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLivraria = new JFrame();
		frmLivraria.setTitle("Livraria");
		frmLivraria.setBounds(100, 100, 735, 422);
		frmLivraria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLivraria.setLocationRelativeTo(null);
		frmLivraria.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		frmLivraria.getContentPane().add(menuBar);
		
		JMenu mnProdutos = new JMenu("Produtos");
		menuBar.add(mnProdutos);
		
		JMenuItem mniCD = new JMenuItem("CD");
		mniCD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JDCd dialog = new JDCd();
					dialog.setLocationRelativeTo(null);
					dialog.setModal(true);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception erroCD) {
					erroCD.printStackTrace();
				}
			}
		});
		mnProdutos.add(mniCD);
		
		JMenuItem mniDVD = new JMenuItem("DVD");
		mniDVD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JDDvd dialog = new JDDvd();
					dialog.setLocationRelativeTo(null);
					dialog.setModal(true);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception erroDVD) {
					erroDVD.printStackTrace();
				}
			}
		});
		mnProdutos.add(mniDVD);
		
		JMenuItem mniLivros = new JMenuItem("Livros");
		mniLivros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JDLivro dialog = new JDLivro();
					dialog.setLocationRelativeTo(null);
					dialog.setModal(true);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception erroLivro) {
					erroLivro.printStackTrace();
				}
			}
		});
		mnProdutos.add(mniLivros);
		
		JMenuItem mniSair = new JMenuItem("Sair");
		mniSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mniSair.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mniSair);
	}
}
