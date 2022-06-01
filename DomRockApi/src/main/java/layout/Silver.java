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
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		String[] tiposArquivo = {"Selecione uma Opção", "PDF", "Video", "Audio", "Imagem", "Texto", "Planilha"};
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(5, 26, 574, 308);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Label lbPdf = new Label("PDF");
		lbPdf.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbPdf.setBounds(10, 10, 53, 22);
		panel.add(lbPdf);
		
		JLabel lbPPddf = new JLabel(".pdf");
		lbPPddf.setBounds(10, 38, 46, 14);
		panel.add(lbPPddf);
		
		Label lbVideo = new Label("Video");
		lbVideo.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbVideo.setBounds(254, 10, 53, 22);
		panel.add(lbVideo);
		
		Label lbAudio = new Label("Audio");
		lbAudio.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbAudio.setBounds(511, 10, 53, 22);
		panel.add(lbAudio);
		
		Label lbImagem = new Label("Imagem");
		lbImagem.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbImagem.setBounds(10, 123, 77, 32);
		panel.add(lbImagem);
		
		Label lbTexto = new Label("Texto");
		lbTexto.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbTexto.setBounds(254, 133, 53, 22);
		panel.add(lbTexto);
		
		Label lbPlanilha = new Label("Planilha");
		lbPlanilha.setFont(new Font("Dialog", Font.PLAIN, 20));
		lbPlanilha.setBounds(494, 133, 70, 22);
		panel.add(lbPlanilha);
		
		JLabel lbVE = new JLabel(".extensão certa");
		lbVE.setBounds(246, 38, 77, 14);
		panel.add(lbVE);
		
		JLabel lbP20 = new JLabel("20 mega ou menos");
		lbP20.setBounds(10, 63, 90, 14);
		panel.add(lbP20);
		
		JLabel lbPS = new JLabel("sem charactere especial");
		lbPS.setBounds(10, 88, 115, 14);
		panel.add(lbPS);
		
		JLabel lbVS = new JLabel("sem charactere especial");
		lbVS.setBounds(233, 88, 115, 14);
		panel.add(lbVS);
		
		JLabel lbV20 = new JLabel("20 mega ou menos");
		lbV20.setBounds(246, 63, 90, 14);
		panel.add(lbV20);
		
		JLabel lbAS = new JLabel("sem charactere especial");
		lbAS.setBounds(449, 88, 115, 14);
		panel.add(lbAS);
		
		JLabel lbA20 = new JLabel("20 mega ou menos");
		lbA20.setBounds(474, 63, 90, 14);
		panel.add(lbA20);
		
		JLabel lbPlS = new JLabel("sem charactere especial");
		lbPlS.setBounds(449, 211, 115, 14);
		panel.add(lbPlS);
		
		JLabel lbPl20 = new JLabel("20 mega ou menos");
		lbPl20.setBounds(474, 186, 90, 14);
		panel.add(lbPl20);
		
		JLabel lbTS = new JLabel("sem charactere especial");
		lbTS.setBounds(233, 211, 115, 14);
		panel.add(lbTS);
		
		JLabel lbT20 = new JLabel("20 mega ou menos");
		lbT20.setBounds(246, 186, 90, 14);
		panel.add(lbT20);
		
		JLabel lbIS = new JLabel("sem charactere especial");
		lbIS.setBounds(10, 211, 115, 14);
		panel.add(lbIS);
		
		JLabel lbI20 = new JLabel("20 mega ou menos");
		lbI20.setBounds(10, 186, 90, 14);
		panel.add(lbI20);
		
		JLabel lbAE = new JLabel(".extensão certa");
		lbAE.setBounds(487, 38, 77, 14);
		panel.add(lbAE);
		
		JLabel lbPlE = new JLabel(".extensão certa");
		lbPlE.setBounds(487, 161, 77, 14);
		panel.add(lbPlE);
		
		JLabel lbIE = new JLabel(".extensão certa");
		lbIE.setBounds(10, 161, 77, 14);
		panel.add(lbIE);
		
		JLabel lbTE = new JLabel(".extensão certa");
		lbTE.setBounds(246, 161, 77, 14);
		panel.add(lbTE);
		
		
		JComboBox comboBox = new JComboBox(tiposArquivo);
		comboBox.setBounds(5, 5, 574, 20);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedItem() == "PDF") {
					
				}
			}
		});
		
		contentPane.add(comboBox);
		
		JButton btnProximaEtapaSilver = new JButton("Proxima Etapa");
		btnProximaEtapaSilver.setBounds(394, 333, 185, 23);
		btnProximaEtapaSilver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		contentPane.add(btnProximaEtapaSilver);
		
		JButton btnRetornarSilver = new JButton("Retornar");
		btnRetornarSilver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*EventQueue.invokeLater(new Runnable() {										
					public void run() {
						
						try {

							//aqui setamos qual dela vai ser aberta
							Menu window = new Menu();
							//aqui setamos a nova tela como visivel
							window.frmBronze.setVisible(true);
							//e para n縊 ficar com duas telas abertas, ordenamos a atual a ficar invisivel
							frmSilver.setVisible(false);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});*/
			}
		});
		btnRetornarSilver.setBounds(0, 333, 185, 23);
		contentPane.add(btnRetornarSilver);
	}
}
