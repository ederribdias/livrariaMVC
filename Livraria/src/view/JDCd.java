package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Cd;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JDCd extends JDialog {

	Cd cd = new Cd();
	
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtDescricao;
	private JTextField txtGenero;
	private JTextField txtOrigem;
	private JTextField txtEstoque;
	private JTextField txtPCusto;
	private JTextField txtPVenda;
	private JTextField txtArtista;
	private JTextField txtGravadora;

	/**
	 * Create the dialog.
	 */
	public JDCd() {
		setTitle("CD");
		setBounds(100, 100, 471, 359);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setBounds(10, 11, 46, 14);
		contentPanel.add(lblCodigo);
		
		JLabel lblGnero = new JLabel("G\u00EAnero:");
		lblGnero.setBounds(10, 59, 46, 14);
		contentPanel.add(lblGnero);
		
		JLabel lblCodigo_1_1 = new JLabel("Origem:");
		lblCodigo_1_1.setBounds(119, 59, 46, 14);
		contentPanel.add(lblCodigo_1_1);
		
		JLabel lblCodigo_1_2 = new JLabel("Descri\u00E7\u00E3o:");
		lblCodigo_1_2.setBounds(119, 11, 86, 14);
		contentPanel.add(lblCodigo_1_2);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(10, 28, 86, 20);
		contentPanel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(119, 28, 271, 20);
		contentPanel.add(txtDescricao);
		
		JLabel lblNewLabel = new JLabel("Estoque dispon\u00EDvel:");
		lblNewLabel.setBounds(295, 59, 150, 14);
		contentPanel.add(lblNewLabel);
		
		txtGenero = new JTextField();
		txtGenero.setColumns(10);
		txtGenero.setBounds(10, 74, 86, 20);
		contentPanel.add(txtGenero);
		
		txtOrigem = new JTextField();
		txtOrigem.setColumns(10);
		txtOrigem.setBounds(119, 74, 146, 20);
		contentPanel.add(txtOrigem);
		
		txtEstoque = new JTextField();
		txtEstoque.setColumns(10);
		txtEstoque.setBounds(295, 74, 95, 20);
		contentPanel.add(txtEstoque);
		
		JLabel lblPreoDeCusto = new JLabel("Pre\u00E7o de custo:");
		lblPreoDeCusto.setBounds(295, 105, 102, 14);
		contentPanel.add(lblPreoDeCusto);
		
		txtPCusto = new JTextField();
		txtPCusto.setColumns(10);
		txtPCusto.setBounds(295, 120, 95, 20);
		contentPanel.add(txtPCusto);
		
		JLabel lblPreoDeVenda = new JLabel("Pre\u00E7o de venda:");
		lblPreoDeVenda.setBounds(295, 151, 102, 14);
		contentPanel.add(lblPreoDeVenda);
		
		txtPVenda = new JTextField();
		txtPVenda.setColumns(10);
		txtPVenda.setBounds(295, 166, 95, 20);
		contentPanel.add(txtPVenda);
		
		JLabel lblArtista = new JLabel("Artista:");
		lblArtista.setBounds(10, 105, 46, 14);
		contentPanel.add(lblArtista);
		
		txtArtista = new JTextField();
		txtArtista.setColumns(10);
		txtArtista.setBounds(10, 120, 255, 20);
		contentPanel.add(txtArtista);
		
		JLabel lblCodigo_1_1_1 = new JLabel("Gravadora:");
		lblCodigo_1_1_1.setBounds(10, 151, 86, 14);
		contentPanel.add(lblCodigo_1_1_1);
		
		txtGravadora = new JTextField();
		txtGravadora.setColumns(10);
		txtGravadora.setBounds(10, 166, 255, 20);
		contentPanel.add(txtGravadora);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnFechar = new JButton("Fechar");
				btnFechar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				{
					JButton btnInserir = new JButton("Inserir");
					btnInserir.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								cd.setCodigo(Integer.parseInt(txtCodigo.getText()));
								cd.setDescricao(txtDescricao.getText());
								cd.setGenero(txtGenero.getText());
								cd.setEstoqueDisponivel(Integer.parseInt(txtEstoque.getText()));
								cd.setPrecoCusto(Double.parseDouble(txtPCusto.getText()));
								cd.setPrecoVenda(Double.parseDouble(txtPVenda.getText()));
								cd.setOrigem(txtOrigem.getText());
								cd.setArtista(txtArtista.getText());
								cd.setGravadora(txtGravadora.getText());
							} catch (NumberFormatException eNumber) {
								JOptionPane.showMessageDialog(null, "Para os itens código, estoque, preço de custo e preço de venda digite apenas números!", "Erro de conversão", JOptionPane.ERROR_MESSAGE);
							} catch (Exception erro) {
								//Erro inesperado
							}
						}
					});
					buttonPane.add(btnInserir);
				}
				{
					JButton btnDetalhes = new JButton("Detalhes");
					btnDetalhes.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(null, cd.apresentarDetalhes());
						}
					});
					buttonPane.add(btnDetalhes);
				}
				{
					JButton btnApresentar = new JButton("Apresentar");
					btnApresentar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							txtCodigo.setText(String.valueOf(cd.getCodigo()));
							txtDescricao.setText(cd.getDescricao());
							txtGenero.setText(cd.getGenero());
							txtEstoque.setText(String.valueOf(cd.getEstoqueDisponivel()));
							txtPCusto.setText(String.valueOf(cd.getPrecoCusto()));
							txtPVenda.setText(String.valueOf(cd.getPrecoVenda()));
							txtOrigem.setText(cd.getOrigem());
							txtArtista.setText(cd.getArtista());
							txtGravadora.setText(cd.getGravadora());
						}
					});
					buttonPane.add(btnApresentar);
				}
				{
					JButton btnLimpar = new JButton("Limpar campos");
					btnLimpar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							txtCodigo.setText("");
							txtDescricao.setText("");
							txtGenero.setText("");
							txtEstoque.setText("");
							txtPCusto.setText("");
							txtPVenda.setText("");
							txtOrigem.setText("");
							txtArtista.setText("");
							txtGravadora.setText("");
						}
					});
					buttonPane.add(btnLimpar);
				}
				buttonPane.add(btnFechar);
			}
		}
	}
}
