package calculadera;

import java.util.Scanner;

//import java.io.*;

import calculadera.BasicOperations;

public class RodandoCalc {

	public static void main(String[] args) {
		
		int i = 0;
		int n = 10;
		
		double resultadoF = 0;
		
		String zezinho = null;
		String cafezinho = "t";
		
		
		double[] numbers = new double[n];
		String[] operations = new String[n-1];
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem vindo ao software de calculadora:");
		
		System.out.println("Digite os números seguidos das operações.");
		
		System.out.println("Para impressão do resultado final digite \"t\".");
		
		//entrada de dados
		
		for(i = 0; i < numbers.length;i++) {
			
			System.out.println("Digite um número:");
			
			zezinho = scan.next();
			
			numbers[i] = Double.parseDouble(zezinho);
			
			//System.out.println(numbers[i]);
			
			if(i == numbers.length) {
				break;
			}
			
			if(i != 0) {
				System.out.println("Digite uma operação ou t:");
			}else System.out.println("Digite uma operação:");
				
			operations[i] = scan.next();
			
			if(operations[i].equals(cafezinho)){
				break;
			}
			

			
		}
		
		//calcular
		// /*
		for(i=0; i<operations.length;i++) {
			
			//System.out.println("i antes dos if's " + i);
			
			if(operations[i].equals("+")) {
				if(i!=0) {
					//System.out.println("entrou no laco1");
					resultadoF = resultadoF + numbers[i+1];
				}else resultadoF = numbers[i]+numbers[i+1];
				
				System.out.println(resultadoF+" "+i);
				
			}else if(operations[i].equals("-")) {
				if(i!=0) {
					//System.out.println("entrou no laco2");
					resultadoF = resultadoF - numbers[i+1];
				}else resultadoF = numbers[i]-numbers[i+1];
				
				//System.out.println(resultadoF+" "+i);
				
			}
			
			if(operations[i].equals("t")) break;
		}
		
		//saida
		
		System.out.print("O resultado de ");
		
		for(i=0;i<operations.length;i++) {
			
			System.out.print(numbers[i] + " ");
			if(operations[i].equals("t")) { break;}
			System.out.print(operations[i] + " ");
		}
		
		System.out.print("= " + resultadoF+".");
		
		scan.close();
		
		//funcoes
		

		
		}
	


}
