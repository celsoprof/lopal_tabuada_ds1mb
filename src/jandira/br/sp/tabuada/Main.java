package jandira.br.sp.tabuada;

import jandira.br.sp.tabuada.gui.TelaTabuada;

public class Main {

	public static void main(String[] args) {
		
//		int valor = (int) 2.9;
//		System.out.println(valor);
//		
//	
//		double notas[] = new double[4];
//		notas[0] = 9.8;
//		notas[1] = 9.9;
//		notas[2] = 7.6;
//		notas[3] = 8.9;
//		
//		
//		int tamanho = notas.length;
//		
//		int contador = 0;
//		double total = 0.0;
//		while (contador < tamanho) {
//			System.out.println(notas[contador]);
//			total += notas[contador];
//			contador++;
//		}
//		
//		double media = total / tamanho;
//		System.out.println("Média Final: " + media);
//		
//		int i = 6;
//		String frutas[] = new String[i];
//		frutas[0] = "Maçã";
//		frutas[1] = "Banana";
//		frutas[2] = "Melão";
//		frutas[3] = "Uva";
//		frutas[4] = "Laranja";
//		frutas[5] = "Melancia";
//			
//		contador = 0;
//		while (contador < frutas.length) {
//			System.out.println(frutas[contador]);
//			contador++;
//		}
		
		TelaTabuada tela = new TelaTabuada();
		tela.criarTela();

	}

}
