package br.dev.sidney.tabuada.gui;

import java.awt.Dimension;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		
		//Definir o tamanho da tela 
		//Através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(400, 600);
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		//Criar um JLabel
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Valor do multiplicando: ");
		labelMultiplicando.setBounds(10, 10, 200, 30);
		tela.getContentPane().add(labelMultiplicando);
		
		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setBounds(300, 10, 200, 30);
		tela.getContentPane().add(textMultiplicando);
		
		JLabel labelMenorMultiplicador = new JLabel();
		labelMenorMultiplicador.setText("Valor do menor multiplicador: ");
		labelMenorMultiplicador.setBounds(10, 40, 200, 30);
		tela.getContentPane().add(labelMenorMultiplicador);
		
		JTextField textMenorMultiplicador = new JTextField();
		textMenorMultiplicador.setBounds(300, 40, 200, 30);
		tela.getContentPane().add(textMenorMultiplicador);
		
		JLabel labelMaiorMultiplicador = new JLabel();
		labelMaiorMultiplicador.setText("Valor do maior multiplicador: ");
		labelMaiorMultiplicador.setBounds(10, 70, 200, 30);
		tela.getContentPane().add(labelMaiorMultiplicador);
		
		JTextField textMaiorMultiplicador = new JTextField();
		textMaiorMultiplicador.setBounds(300, 70, 200, 30);
		tela.getContentPane().add(textMaiorMultiplicador);
		
		tela.setVisible(true);
		
		
	}

}
