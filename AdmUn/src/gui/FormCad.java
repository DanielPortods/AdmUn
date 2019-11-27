package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FormCad extends JFrame {
	
	private JButton btnl;
	
	public FormCad () {
		
		setSize(800, 600);
		setLocationRelativeTo(null);
		setTitle("Gerenciador de universidades");
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		btnl = new JButton("Cadastrar Instituição");
		btnl.addActionListener(new ActionListenerBtnCadastrar());
		add(btnl);
		
		setVisible(true);
	}
}