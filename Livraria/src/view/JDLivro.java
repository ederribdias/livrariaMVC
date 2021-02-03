package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Livro;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JDLivro extends JDialog {

	private final JPanel contentPanel = new JPanel();

	Livro livro = new Livro();
	private JTextField txtCodigo;
	private JTextField txtDescricao;
	private JTextField txtGenero;
	private JTextField txtOrigem;
	private JTextField txtEstoque;
	private JTextField txtAutor;
	private JTextField txtPCusto;
	private JTextField txtEditora;
	private JTextField txtPVenda;
	private JTextField txtEdicao;

	/**
	 * Create the dialog.
	 */
	public JDLivro() {
		setTitle("Livro");
		setBounds(100, 100, 517, 367);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setBounds(10, 11, 46, 14);
		contentPanel.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(10, 28, 86, 20);
		contentPanel.add(txtCodigo);
		
		JLabel lblCodigo_1_2 = new JLabel("Descri\u00E7\u00E3o:");
		lblCodigo_1_2.setBounds(119, 11, 86, 14);
		contentPanel.add(lblCodigo_1_2);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(119, 28, 271, 20);
		contentPanel.add(txtDescricao);
		
		JLabel lblGnero = new JLabel("G\u00EAnero:");
		lblGnero.setBounds(10, 59, 46, 14);
		contentPanel.add(lblGnero);
		
		txtGenero = new JTextField();
		txtGenero.setColumns(10);
		txtGenero.setBounds(10, 74, 86, 20);
		contentPanel.add(txtGenero);
		
		JLabel lblCodigo_1_1 = new JLabel("Origem:");
		lblCodigo_1_1.setBounds(119, 59, 46, 14);
		contentPanel.add(lblCodigo_1_1);
		
		txtOrigem = new JTextField();
		txtOrigem.setColumns(10);
		txtOrigem.setBounds(119, 74, 146, 20);
		contentPanel.add(txtOrigem);
		
		JLabel lblNewLabel = new JLabel("Estoque dispon\u00EDvel:");
		lblNewLabel.setBounds(295, 59, 150, 14);
		contentPanel.add(lblNewLabel);
		
		txtEstoque = new JTextField();
		txtEstoque.setColumns(10);
		txtEstoque.setBounds(295, 74, 95, 20);
		contentPanel.add(txtEstoque);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(10, 105, 46, 14);
		contentPanel.add(lblAutor);
		
		txtAutor = new JTextField();
		txtAutor.setColumns(10);
		txtAutor.setBounds(10, 120, 255, 20);
		contentPanel.add(txtAutor);
		
		JLabel lblPreoDeCusto = new JLabel("Pre\u00E7o de custo:");
		lblPreoDeCusto.setBounds(295, 105, 102, 14);
		contentPanel.add(lblPreoDeCusto);
		
		txtPCusto = new JTextField();
		txtPCusto.setColumns(10);
		txtPCusto.setBounds(295, 120, 95, 20);
		contentPanel.add(txtPCusto);
		
		JLabel lblCodigo_1_1_1 = new JLabel("Editora:");
		lblCodigo_1_1_1.setBounds(10, 151, 86, 14);
		contentPanel.add(lblCodigo_1_1_1);
		
		txtEditora = new JTextField();
		txtEditora.setColumns(10);
		txtEditora.setBounds(10, 166, 155, 20);
		contentPanel.add(txtEditora);
		
		JLabel lblPreoDeVenda = new JLabel("Pre\u00E7o de venda:");
		lblPreoDeVenda.setBounds(295, 151, 102, 14);
		contentPanel.add(lblPreoDeVenda);
		
		txtPVenda = new JTextField();
		txtPVenda.setColumns(10);
		txtPVenda.setBounds(295, 166, 95, 20);
		contentPanel.add(txtPVenda);
		
		JLabel lblEdio = new JLabel("Edi\u00E7\u00E3o");
		lblEdio.setBounds(175, 151, 90, 14);
		contentPanel.add(lblEdio);
		
		txtEdicao = new JTextField();
		txtEdicao.setColumns(10);
		txtEdicao.setBounds(175, 166, 90, 20);
		contentPanel.add(txtEdicao);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnInserir = new JButton("Inserir");
			btnInserir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					livro.setCodigo(Integer.parseInt(txtCodigo.getText()));
					livro.setDescricao(txtDescricao.getText());
					livro.setGenero(txtGenero.getText());
					livro.setEstoqueDisponivel(Integer.parseInt(txtEstoque.getText()));
					livro.setPrecoCusto(Double.parseDouble(txtPCusto.getText()));
					livro.setPrecoVenda(Double.parseDouble(txtPVenda.getText()));
					livro.setOrigem(txtOrigem.getText());
					livro.setAutor(txtAutor.getText());
					livro.setEditora(txtEditora.getText());
					livro.setEdicao(txtEdicao.getText());
				}
			});
			buttonPane.add(btnInserir);
			
			JButton btnDetalhes = new JButton("Detalhes");
			btnDetalhes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, livro.apresentarDetalhes());
				}
			});
			buttonPane.add(btnDetalhes);
			
			JButton btnApresentar = new JButton("Apresentar");
			btnApresentar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtCodigo.setText(String.valueOf(livro.getCodigo()));
					txtDescricao.setText(livro.getDescricao());
					txtGenero.setText(livro.getGenero());
					txtEstoque.setText(String.valueOf(livro.getEstoqueDisponivel()));
					txtPCusto.setText(String.valueOf(livro.getPrecoCusto()));
					txtPVenda.setText(String.valueOf(livro.getPrecoVenda()));
					txtOrigem.setText(livro.getOrigem());
					txtAutor.setText(livro.getAutor());
					txtEditora.setText(livro.getEditora());
					txtEdicao.setText(livro.getEdicao());
				}
			});
			buttonPane.add(btnApresentar);
			
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
					txtAutor.setText("");
					txtEditora.setText("");
					txtEdicao.setText("");
				}
			});
			buttonPane.add(btnLimpar);
			
			JButton btnFechar = new JButton("Fechar");
			btnFechar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			buttonPane.add(btnFechar);
		}
	}
}
