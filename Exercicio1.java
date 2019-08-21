package com.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        
        int soma = 0, maior = 0, menor = 0, qtdp = 0, qtdi = 0, dp = 0, ds = 0;
        double media = 0;
        
        System.out.println("Insira um número ímpar entre 3 e 11:");
        int qtd = entrada.nextInt();
        
         while((qtd<0)&&(qtd>13)&&(qtd%2==0)){
                    System.out.print("Insira um número válido: ");
                    qtd = entrada.nextInt();
                }
        
        int matriz[][] = new int[qtd][qtd];   
        
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = entrada.nextInt();
                    
                    soma += matriz[i][j];
                    if((i == 1) && (j == 1)){
                        maior = matriz[i][j];
                        menor = matriz[i][j];
                    }
                    else if(matriz[i][j] > maior){
                        maior = matriz[i][j];
                    }
                    else if(matriz[i][j] < menor){
                        menor = matriz[i][j];
                    }
                    
                    if(matriz[i][j] % 2 == 0){
                        qtdp++;
                    }
                    else{
                        qtdi++;
                    }
                    
                    if(i==j)
                      dp += matriz[i][j];
                    
                    if((i+j) == (qtd+1))
                      ds += matriz[i][j];
                }     
                
            }
           media = soma/(qtd*qtd);
           System.out.println("Soma dos elementos: "+soma);
           System.out.println("Média dos elementos: "+media);
           System.out.println("Maior valor: "+maior);
           System.out.println("Menor valor: "+menor);
           System.out.println("Quantidade de pares: "+qtdp);
           System.out.println("Quantidade de Ímpares: "+qtdi);
           System.out.println("Soma da diagonal principal: "+dp);
           System.out.println("Soma da diagonal secundária: "+ds);
           
            for (int i = 0; i < qtd; i++) {
                for (int j = 0; j < qtd; j++) {
                   System.out.print(matriz[i][j]+"|");
                }
                System.out.print("\n");
            }
            entrada.close();

	}

}
