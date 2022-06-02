package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;

public class Silver extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Silver frame = new Silver();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Silver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		String[] tiposArquivo = {"Selecione uma Opção", "PDF", "JSON", "CSV", "Planilhas", "Tabelas", "Audio", "Texto"};
		contentPane.setLayout(null);
		
		
		JComboBox comboBox = new JComboBox(tiposArquivo);
		comboBox.setBounds(10, 5, 764, 20);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedItem() == "PDF") {
					
				}
			}
		});
		
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Avançar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(624, 520, 150, 30);
		contentPane.add(btnNewButton);
		
		JLabel lbPdf = new JLabel("PDF");
		lbPdf.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbPdf.setBounds(10, 36, 50, 30);
		contentPane.add(lbPdf);
		
		JLabel lbJson = new JLabel("JSON");
		lbJson.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbJson.setBounds(180, 36, 67, 30);
		contentPane.add(lbJson);
		
		JLabel lbCsv = new JLabel("CSV");
		lbCsv.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbCsv.setBounds(440, 36, 50, 30);
		contentPane.add(lbCsv);
		
		JLabel lbPlanilhas = new JLabel("Planilhas");
		lbPlanilhas.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbPlanilhas.setBounds(659, 36, 115, 30);
		contentPane.add(lbPlanilhas);
		
		JLabel lbTabelas = new JLabel("Tabelas\r\n");
		lbTabelas.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbTabelas.setBounds(10, 220, 97, 30);
		contentPane.add(lbTabelas);
		
		JLabel lbAudio = new JLabel("Audio");
		lbAudio.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbAudio.setBounds(180, 220, 72, 30);
		contentPane.add(lbAudio);
		
		JLabel lbTexto = new JLabel("Texto");
		lbTexto.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbTexto.setBounds(431, 220, 72, 30);
		contentPane.add(lbTexto);
	}
}
