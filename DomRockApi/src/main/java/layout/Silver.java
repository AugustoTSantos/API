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
import javax.swing.SwingConstants;
import java.awt.TextArea;
import javax.swing.JCheckBox;
import java.awt.Checkbox;

public class Silver extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		
		JCheckBox chckbxExtensaoPdfSilver = new JCheckBox(".pdf");
		chckbxExtensaoPdfSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExtensaoPdfSilver.setBounds(10, 73, 150, 23);
		
		JCheckBox chckbxTamanhoPdfSilver = new JCheckBox("até 10 mb");
		chckbxTamanhoPdfSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoPdfSilver.setBounds(10, 99, 150, 23);
		
		JCheckBox chckbxNomePdfSilver = new JCheckBox("nome padronizado");
		chckbxNomePdfSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomePdfSilver.setBounds(10, 125, 150, 23);
		
		JCheckBox chckbxExtensaoJsonSilver = new JCheckBox(".yaml ou .yml");
		chckbxExtensaoJsonSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExtensaoJsonSilver.setBounds(195, 73, 150, 23);
		
		JCheckBox chckbxTamanhoJsonSilver = new JCheckBox("até 20 mb");
		chckbxTamanhoJsonSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoJsonSilver.setBounds(195, 99, 136, 23);
		
		JCheckBox chckbxNomeJsonSilver = new JCheckBox("nome padronizado");
		chckbxNomeJsonSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomeJsonSilver.setBounds(195, 125, 150, 23);
		
		JCheckBox chckbxTamanhoCsvSilver = new JCheckBox("até 1 mb");
		chckbxTamanhoCsvSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoCsvSilver.setBounds(415, 99, 150, 23);
		contentPane.add(chckbxTamanhoCsvSilver);
		
		JCheckBox chckbxLimiteLinhasCsvSilver = new JCheckBox("até 1000 linhas");
		chckbxLimiteLinhasCsvSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxLimiteLinhasCsvSilver.setBounds(415, 125, 150, 23);
		contentPane.add(chckbxLimiteLinhasCsvSilver);
		
		JCheckBox chckbxExtensaoCsvSilver = new JCheckBox(".csv");
		chckbxExtensaoCsvSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExtensaoCsvSilver.setBounds(415, 73, 150, 23);
		contentPane.add(chckbxExtensaoCsvSilver);
		
		JCheckBox chckbxTamanhoTabelasSilver = new JCheckBox("até 10 mb");
		chckbxTamanhoTabelasSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoTabelasSilver.setBounds(10, 287, 150, 23);
		contentPane.add(chckbxTamanhoTabelasSilver);
		
		JCheckBox chckbxTamanhoAudioSilver = new JCheckBox("até 10 mb");
		chckbxTamanhoAudioSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoAudioSilver.setBounds(195, 287, 150, 23);
		contentPane.add(chckbxTamanhoAudioSilver);
		
		JCheckBox chckbxTamanhoTextoSilver = new JCheckBox("até 10 mb");
		chckbxTamanhoTextoSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoTextoSilver.setBounds(415, 287, 150, 23);
		contentPane.add(chckbxTamanhoTextoSilver);
		
		JCheckBox chckbxTamanhoPlanilhasSilver = new JCheckBox("até 10 mb");
		chckbxTamanhoPlanilhasSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoPlanilhasSilver.setBounds(624, 73, 150, 23);
		contentPane.add(chckbxTamanhoPlanilhasSilver);
		
		JCheckBox chckbxNomeCsvSilver = new JCheckBox("nome padronizado");
		chckbxNomeCsvSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomeCsvSilver.setBounds(415, 151, 150, 23);
		contentPane.add(chckbxNomeCsvSilver);
		
		JCheckBox chckbxNomeTabelasSilver = new JCheckBox("nome padronizado");
		chckbxNomeTabelasSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomeTabelasSilver.setBounds(10, 313, 150, 23);
		contentPane.add(chckbxNomeTabelasSilver);
		
		JCheckBox chckbxNomeAudioSilver = new JCheckBox("nome padronizado");
		chckbxNomeAudioSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomeAudioSilver.setBounds(195, 313, 150, 23);
		contentPane.add(chckbxNomeAudioSilver);
		
		JCheckBox chckbxNomeTextoSilver = new JCheckBox("nome padronizado");
		chckbxNomeTextoSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomeTextoSilver.setBounds(415, 313, 150, 23);
		contentPane.add(chckbxNomeTextoSilver);
		
		JCheckBox chckbxNomePlanilhasSilver = new JCheckBox("nome padronizado");
		chckbxNomePlanilhasSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomePlanilhasSilver.setBounds(624, 99, 150, 23);
		contentPane.add(chckbxNomePlanilhasSilver);
		
		
		String[] tiposArquivo = {"Selecione uma Opção", "PDF", "JSON", "CSV", "Planilhas", "Tabelas", "Audio", "Texto"};
		contentPane.setLayout(null);
		
		JComboBox<?> comboBox = new JComboBox<Object>(tiposArquivo);
		comboBox.setBounds(10, 5, 764, 20);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedItem() == "PDF") {
					contentPane.add(chckbxExtensaoPdfSilver);
					contentPane.add(chckbxTamanhoPdfSilver);
					contentPane.add(chckbxNomePdfSilver);

				} else {
					contentPane.remove(chckbxExtensaoPdfSilver);
					contentPane.remove(chckbxTamanhoPdfSilver);
					contentPane.remove(chckbxNomePdfSilver);
				}
				
				if(comboBox.getSelectedItem() == "JSON") {
					contentPane.add(chckbxExtensaoJsonSilver);
					contentPane.add(chckbxTamanhoJsonSilver);
					contentPane.add(chckbxNomeJsonSilver);
				} else {
					contentPane.remove(chckbxExtensaoJsonSilver);
					contentPane.remove(chckbxTamanhoJsonSilver);
					contentPane.remove(chckbxNomeJsonSilver);
				}
			}
		});
		contentPane.add(comboBox);
		
		
		JButton btnNewButton = new JButton("Avançar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(624, 520, 150, 30);
		contentPane.add(btnNewButton);
		
		JLabel lbPdfSilver = new JLabel("PDF");
		lbPdfSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbPdfSilver.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbPdfSilver.setBounds(10, 36, 150, 30);
		contentPane.add(lbPdfSilver);
		
		JLabel lbJsonSilver = new JLabel("JSON");
		lbJsonSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbJsonSilver.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbJsonSilver.setBounds(195, 36, 150, 30);
		contentPane.add(lbJsonSilver);
		
		JLabel lbCsvSilver = new JLabel("CSV");
		lbCsvSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbCsvSilver.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbCsvSilver.setBounds(415, 36, 150, 30);
		contentPane.add(lbCsvSilver);
		
		JLabel lbPlanilhasSilver = new JLabel("Planilhas");
		lbPlanilhasSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbPlanilhasSilver.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbPlanilhasSilver.setBounds(624, 36, 150, 30);
		contentPane.add(lbPlanilhasSilver);
		
		JLabel lbTabelasSilver = new JLabel("Tabelas\r\n");
		lbTabelasSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbTabelasSilver.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbTabelasSilver.setBounds(10, 250, 150, 30);
		contentPane.add(lbTabelasSilver);
		
		JLabel lbAudioSilver = new JLabel("Audio");
		lbAudioSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbAudioSilver.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbAudioSilver.setBounds(195, 250, 150, 30);
		contentPane.add(lbAudioSilver);
		
		JLabel lbTextoSilver = new JLabel("Texto");
		lbTextoSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbTextoSilver.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbTextoSilver.setBounds(415, 250, 150, 30);
		contentPane.add(lbTextoSilver);
		
		JLabel lbComentarioSilver = new JLabel("Comentario");
		lbComentarioSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbComentarioSilver.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbComentarioSilver.setBounds(624, 250, 150, 30);
		contentPane.add(lbComentarioSilver);
		
		
		TextArea textAreaSilver = new TextArea();
		textAreaSilver.setBounds(624, 286, 150, 228);
		contentPane.add(textAreaSilver);
		
	}
}
