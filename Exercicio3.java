package com.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int TAM;
		int y ;
		int x;
		 int mediaturma=0;
		System.out.println("Quantos alunos?");
		 TAM = entrada.nextInt();
		 String nome[] = new String [TAM];
		 int vet[][] = new int[TAM][TAM];
			int soma[][] = new int[TAM][TAM];
			int media[] = new int [TAM];
			int maior[] = new int [TAM];
			int menor[] = new int [TAM];
		 for ( x=0; x<TAM;x++) {
			System.out.println("Nome");
			nome[x] = entrada.next();
			for (y=0; y<2;y++) {
				System.out.println("Nota");
				vet[x][y] = entrada.nextInt();
				soma[x][y] = vet[x][y];
				media[x] = media[x]+soma[x][y];
				if (y==0) {
					maior[x] = vet[x][y];
					menor [x] = vet[x][y];
				} 
				if (vet[x][y]> maior[x]) {
					maior[x] = vet[x][y];
				}
				if (vet[x][y]< menor[x]) {
					menor [x] = vet[x][y];
				}}}
		for ( x=0; x<TAM;x++) {
			media[x] = media[x]/2;
		mediaturma = mediaturma + media[x];
		}
		mediaturma = mediaturma/TAM;
				for ( x=0; x<TAM;x++) {
					System.out.println(nome[x] +  " sua maior nota é " + maior[x] + " e a menor nota é " + menor[x] + " , tendo média de " + media[x]);
					}
				System.out.println("Média da turma : " + mediaturma);
				for ( x=0; x<TAM;x++) {
					if (media[x]> mediaturma) {
						System.out.println(nome[x] + " está acima da média da turma");
					}
					if (media[x]== mediaturma) {
						System.out.println(nome[x] + " está igual da média da turma");
					}
					if (media[x]< mediaturma) {
						System.out.println(nome[x] + " está abaixo da média da turma");
					}}
				entrada.close();
				}

	}

