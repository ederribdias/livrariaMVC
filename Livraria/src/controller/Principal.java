package controller;

import java.awt.EventQueue;

import view.AWLivraria;

public class Principal {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AWLivraria window = new AWLivraria();
					window.frmLivraria.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
