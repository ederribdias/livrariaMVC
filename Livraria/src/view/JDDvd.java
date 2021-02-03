package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Dvd;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDDvd extends JDialog {

	Dvd dvd = new Dvd();
	
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtGenero;
	private JTextField txtDiretor;
	private JTextField txtOrigem;
	private JTextField txtDescricao;
	private JTextField txtEstoque;
	private JTextField txtPCusto;
	private JTextField txtPVenda;


	/**
	 * Create the dialog.
	 */
	public JDDvd() {
		setTitle("DVD");
		setBounds(100, 100, 473, 308);
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
		
		JLabel lblGnero = new JLabel("G\u00EAnero:");
		lblGnero.setBounds(10, 59, 46, 14);
		contentPanel.add(lblGnero);
		
		txtGenero = new JTextField();
		txtGenero.setColumns(10);
		txtGenero.setBounds(10, 74, 255, 20);
		contentPanel.add(txtGenero);
		
		JLabel lblDiretor = new JLabel("Diretor:");
		lblDiretor.setBounds(10, 151, 46, 14);
		contentPanel.add(lblDiretor);
		
		txtDiretor = new JTextField();
		txtDiretor.setColumns(10);
		txtDiretor.setBounds(10, 166, 255, 20);
		contentPanel.add(txtDiretor);
		
		txtOrigem = new JTextField();
		txtOrigem.setColumns(10);
		txtOrigem.setBounds(10, 120, 255, 20);
		contentPanel.add(txtOrigem);
		
		JLabel lblCodigo_1_1 = new JLabel("Origem:");
		lblCodigo_1_1.setBounds(10, 105, 86, 14);
		contentPanel.add(lblCodigo_1_1);
		
		JLabel lblCodigo_1_2 = new JLabel("Descri\u00E7\u00E3o:");
		lblCodigo_1_2.setBounds(119, 11, 86, 14);
		contentPanel.add(lblCodigo_1_2);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(119, 28, 271, 20);
		contentPanel.add(txtDescricao);
		
		JLabel lblNewLabel = new JLabel("Estoque dispon\u00EDvel:");
		lblNewLabel.setBounds(295, 59, 150, 14);
		contentPanel.add(lblNewLabel);
		
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
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnInserir = new JButton("Inserir");
				btnInserir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dvd.setCodigo(Integer.parseInt(txtCodigo.getText()));
						dvd.setDescricao(txtDescricao.getText());
						dvd.setGenero(txtGenero.getText());
						dvd.setEstoqueDisponivel(Integer.parseInt(txtEstoque.getText()));
						dvd.setPrecoCusto(Double.parseDouble(txtPCusto.getText()));
						dvd.setPrecoVenda(Double.parseDouble(txtPVenda.getText()));
						dvd.setOrigem(txtOrigem.getText());
						dvd.setDiretor(txtDiretor.getText());
					}
				});
				buttonPane.add(btnInserir);
			}
			{
				JButton btnDetalhes = new JButton("Detalhes");
				btnDetalhes.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, dvd.apresentarDetalhes());
					}
				});
				buttonPane.add(btnDetalhes);
			}
			{
				JButton btnApresentar = new JButton("Apresentar");
				btnApresentar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtCodigo.setText(String.valueOf(dvd.getCodigo()));
						txtDescricao.setText(dvd.getDescricao());
						txtGenero.setText(dvd.getGenero());
						txtEstoque.setText(String.valueOf(dvd.getEstoqueDisponivel()));
						txtPCusto.setText(String.valueOf(dvd.getPrecoCusto()));
						txtPVenda.setText(String.valueOf(dvd.getPrecoVenda()));
						txtOrigem.setText(dvd.getOrigem());
						txtDiretor.setText(dvd.getDiretor());
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
						txtDiretor.setText("");
					}
				});
				buttonPane.add(btnLimpar);
			}
			{
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
}
