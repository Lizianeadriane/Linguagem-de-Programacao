package lizianeaula3;

import java.util.Scanner;

import java.util.Scanner;
public class desafio1 {

	public static void main (String[] args) {
		
		Scanner imput = new Scanner(System.in);
				
				System.out.print(" Digite o nome da pessoa:");
		String nome = imput.nextLine();
		
		System.out.print(" Digite o signo de " + nome + ":");
				String signo = imput.nextLine();
				
				System.out.print(" Digite a idade de " + nome + ":");
						int idade = imput.nextInt();
						
				
				System.out.println(" A " + nome + " tem " + idade + "anos, e seu signo é " + signo);
						
						imput.close();
				
