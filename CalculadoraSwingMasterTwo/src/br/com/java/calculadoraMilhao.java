package br.com.java;

import java.util.Scanner;

public class calculadoraMilhao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Informe o valor do seu capital inicial:");
		double capital = entrada.nextDouble();

		System.out.printf("Informe o valor do seu Aporte Mensal:");
		double aporte = entrada.nextDouble();

		System.out.printf("Informe a taxa de Juros:");
		double juros = entrada.nextDouble();

		double milhao;

		double calculo;

		calculo = (juros * capital)/100;

		milhao = capital + calculo;

		double meses=0;

		meses ++;

		while(milhao < 1000000.00){

		milhao = aporte+milhao;
		calculo = (juros * milhao)/100;
		milhao = calculo + milhao;

		meses ++;
		}

		System.out.printf("Parabens após %.2f anos e %.2f meses você chegou ao seu primeiro " + " milhão, você acumulou %.2f reais\n\n", meses/12, meses %12, milhao);

		}
}
