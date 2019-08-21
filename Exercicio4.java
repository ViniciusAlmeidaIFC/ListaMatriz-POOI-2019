package com.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        
	        float  maiorMedia = 0, menorMedia = 0;
	        
	        
	        
	        System.out.println("Insira o número de alunos:");
	        int alunos = entrada.nextInt();
	                
	        float matriz[][] = new float[alunos][5];  
	        float soma[] = new float[alunos];
	        
	            for (int i = 0; i < alunos; i++) {
	                System.out.println("Informe os saltos do aluno "+(i+1));
	               
	                for (int j = 0; j < 5; j++) {
	                    System.out.println("Salto "+(j+1)+": ");
	                    matriz[i][j] = entrada.nextFloat();
	                    
	                    soma[i] += matriz[i][j];
	                    
	                }
	                if((i == 1)){
	                    maiorMedia = soma[i]/5;
	                    menorMedia = soma[i]/5;

	                }
	                else if((soma[i]/5) > maiorMedia)
	                    maiorMedia = (soma[i]/5);

	                
	                else if((soma[i]/5) < menorMedia)
	                    menorMedia = (soma[i]/5);		               
	                
	            }
	            
	           for (int i = 0; i < alunos; i++) {
	               System.out.println("Aluno "+(i+1));
	                for (int j = 0; j < 5; j++) {
	                   System.out.println("Salto "+(j+1)+": "+matriz[i][j]);
	                }
	               System.out.println("Média: "+soma[i]/5);
	     
	                   
	           }

	           System.out.println("A maior média de saltos foi : "+maiorMedia);
	           System.out.println("A menor média de saltos foi : "+menorMedia);
	          
	           entrada.close();
	}

}
