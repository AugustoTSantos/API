package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import java.awt.Checkbox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSilver extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSilver frame = new TelaSilver();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaSilver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		String[] tiposArquivo = {"PDF", "Video", "Audio", "PNG", "Word", "Excel", "Power Point"};
		
		JComboBox comboBox = new JComboBox(tiposArquivo);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				while(comboBox.getSelectedItem() == "PDF") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".pdf");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
					break;
				}
				
				while(comboBox.getSelectedItem() == "Video") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".avi");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
					break;
				}
				
				while(comboBox.getSelectedItem() == "Audio") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".mp3");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
					break;
				}
				
				while(comboBox.getSelectedItem() == "PNG") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".png");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
					break;
				}
				
				while(comboBox.getSelectedItem() == "Word") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".docx");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
					break;
				}
				
				while(comboBox.getSelectedItem() == "Excel") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".xlsx");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
					break;
				}
				
				while(comboBox.getSelectedItem() == "Power Point") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".ppt");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
					break;
				}
				
				/*if(comboBox.getSelectedItem() == "PDF") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".pdf");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
				} else if(comboBox.getSelectedItem() == "Video") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".avi");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
				} else if(comboBox.getSelectedItem() == "Audio") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".mp3");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
				} else if(comboBox.getSelectedItem() == "PNG") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".png");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
				} else if(comboBox.getSelectedItem() == "Word") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".docx");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
				} else if(comboBox.getSelectedItem() == "Excel") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".xlsx");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
				} else if(comboBox.getSelectedItem() == "Power Point") {
					JCheckBox chckbxNewCheckBox = new JCheckBox(".ppt");
					contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
				}*/
			}
		});
		
		comboBox.setSelectedIndex(0);
		
		contentPane.add(comboBox, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Proxima Etapa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}
}
