package br.dev.sidney.tabuada.model;

import java.util.Scanner;

public class Tabuada {

	private double maiorMultiplicador;
	private double menorMultiplicador;
	private double multiplicando;
	Scanner leitor = new Scanner(System.in);

	public double getMaiorMultiplicador() {
		return maiorMultiplicador;
	}

	public void setMaiorMultiplicador(double maiorMultiplicador) {
		this.maiorMultiplicador = maiorMultiplicador;
	}

	public double getMenorMultiplicador() {
		return menorMultiplicador;
	}

	public void setMenorMultiplicador(double menorMultiplicador) {
		this.menorMultiplicador = menorMultiplicador;
	}

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public void exibirTabuada() {

		if (menorMultiplicador > maiorMultiplicador) {
			double temp = maiorMultiplicador;
			maiorMultiplicador = menorMultiplicador;
			menorMultiplicador = temp;

		}
		int tamanhoVetor = maiorMultiplicador-menorMultiplicador+1;
		String tabuada[] = new String[];
		while (menorMultiplicador <= maiorMultiplicador) {

			double produto = multiplicando * menorMultiplicador;

			System.out.printf("%s X %s = %s\n", multiplicando, menorMultiplicador, produto);
			
			menorMultiplicador++;
		}
	}

}
