package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int escolaridade, experiencia;
		char viajar, habilitacao;
		
		int esc = 0, exp = 0;
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-Graduação");
		System.out.print("Digite uma opção: ");
		escolaridade = sc.nextInt();
		
		System.out.print("Você tem quantos anos de experiência profissional? ");
		experiencia = sc.nextInt();
		System.out.print("Você tem disponibilidade para viajar (S/N)? ");
		viajar = sc.next().charAt(0);
		System.out.print("Você tem habilitação de motorista (S/N)? ");
		habilitacao = sc.next().charAt(0);
		
		if (escolaridade == 1) {
			esc = 10;
		}
		else if (escolaridade == 2) {
			esc = 20;
		}
		else if (escolaridade == 3) {
			esc = 30;
		}
		else if (escolaridade == 4){
			esc = 40;
		}
		
		
		if (experiencia == 0) {
			exp = 0;
		}
		else if (experiencia > 0 && experiencia <= 2) {
			exp = 10;
		}
		else if (experiencia > 2 && experiencia <= 5) {
			exp = 20;
		}
		else if (experiencia > 5) {
			exp = 40;
		}
		
		System.out.println("Pontos por escolaridade: " + esc);
		System.out.println("Pontos por experiência: " + exp);
		sc.close();
	}

}
