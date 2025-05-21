package agendaDeContatos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class agendaDeContatos {

	private JFrame frame;
	private JTable table;
	DefaultTableModel model;
	private JTextField tf_nome;
	private JTextField tf_telefone;
	private JTextField tf_aniversario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agendaDeContatos window = new agendaDeContatos();
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
	public agendaDeContatos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 841, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_titulo = new JLabel("Agenda De Contatos");
		lbl_titulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_titulo.setBounds(298, 11, 255, 32);
		frame.getContentPane().add(lbl_titulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(461, 116, 340, 316);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel();
		Object[] column = {"Nome", "Telefone", "Aniversário"};
		Object[] row = new Object[3];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		scrollPane.setViewportView(table);
		
		JLabel lbl_nome = new JLabel("Nome:");
		lbl_nome.setBounds(20, 167, 68, 14);
		frame.getContentPane().add(lbl_nome);
		
		JLabel lbl_telefone = new JLabel("Telefone:");
		lbl_telefone.setBounds(20, 192, 68, 14);
		frame.getContentPane().add(lbl_telefone);
		
		JLabel lbl_aniversario = new JLabel("Aniversário:");
		lbl_aniversario.setBounds(20, 218, 88, 14);
		frame.getContentPane().add(lbl_aniversario);
		
		tf_nome = new JTextField();
		tf_nome.setBounds(98, 164, 143, 20);
		frame.getContentPane().add(tf_nome);
		tf_nome.setColumns(10);
		
		tf_telefone = new JTextField();
		tf_telefone.setColumns(10);
		tf_telefone.setBounds(98, 189, 143, 20);
		frame.getContentPane().add(tf_telefone);
		
		tf_aniversario = new JTextField();
		tf_aniversario.setColumns(10);
		tf_aniversario.setBounds(98, 215, 143, 20);
		frame.getContentPane().add(tf_aniversario);
		
		JButton btn_limpar = new JButton("Limpar");
		btn_limpar.setBounds(20, 267, 89, 64);
		frame.getContentPane().add(btn_limpar);
		
		JButton btn_salvar = new JButton("Salvar");
		btn_salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				row[0] = tf_nome.getText();
				row[1] = tf_telefone.getText();
				row[2] = tf_aniversario.getText();
				model.addRow(row);
			}
		});
		btn_salvar.setBounds(118, 267, 89, 64);
		frame.getContentPane().add(btn_salvar);
		
		JButton btn_editar = new JButton("Editar ");
		btn_editar.setBounds(118, 342, 89, 64);
		frame.getContentPane().add(btn_editar);
		
		JButton btn_deletar = new JButton("Deletar");
		btn_deletar.setBounds(20, 342, 89, 64);
		frame.getContentPane().add(btn_deletar);
	}
}
