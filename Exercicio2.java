package com.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM=5;
		int y ;
		int x;
		int media[] = new int [TAM];
		int vet[][] = new int[TAM][TAM];
		int soma[] = new int[TAM];
		for ( x=0; x<TAM;x++) {
			soma[x]=0;
		
			for (y=0; y<TAM;y++) {
				
			vet[x][y] = entrada.nextInt();
			
			if(x==0) {
				soma[x] = soma[x]+vet[x][y];
		}
			if(x==2) {
				soma[x] = soma[x]+vet[x][y];
		}
			if(x==3) {
				soma[x] = soma[x]+vet[x][y];
		}
			if(x==1) {
				soma[x] = soma[x]+vet[x][y];
		}
			if(x==4) {
				soma[x] = soma[x]+vet[x][y];
		}
			if(y==0) {
				media[x] = media[x]+vet[x][y];
		}
			if(y==1) {
				media[x] = media[x]+vet[x][y];
		}
			if(y==2) {
				media[x] = media[x]+vet[x][y];
		}
			if(y==3) {
				media[x] = media[x]+vet[x][y];
		}
			if(y==4) {
				media[x] = media[x]+vet[x][y];
		}}}
		for ( x=0;x<TAM;x++) {
			for ( y=0; y<TAM;y++) {
				System.out.println("Supermercado " + x + " , valor do produto " +y +" : " + vet[x][y] );
			}}
		for ( x=0;x<TAM;x++) {
				System.out.println("Média do produto " + x + " = " + media[x]);
			}
		for ( x=0;x<TAM;x++) {
			
	System.out.println(soma[x] + " = total");
		}
entrada.close();

	}

}
