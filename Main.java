import java.rmi.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(System.in);
			Servico s = (Servico) Naming.lookup("//localhost/EdFService");

			float peso, altura;
			int idade;
			char sexo;

			int opcao = -1;
			
			while(opcao != 0){
				System.out.println("Escolha o que deseja fazer!");
				System.out.println("1 - Calcular IMC");
				System.out.println("2 - Calcular calorias para ganhar peso");
				System.out.println("3 - Calcular calorias para perder peso");
				System.out.println("4 - Calcular calorias para manter peso");
				System.out.println("0 - Para sair");

				opcao = entrada.nextInt();

				switch(opcao){
					case 1:

						System.out.println("Digite sua peso em kg: ");
						peso = entrada.nextFloat();
						
						System.out.println("Digite sua altura em cm: ");
						altura = entrada.nextFloat();

						System.out.println(s.calcularIMC(peso, altura));

						break;

					case 2:

						System.out.println("Digite idade: ");
						idade = entrada.nextInt();

						System.out.println("Digite sua peso em kg: ");
						peso = entrada.nextFloat();
						
						System.out.println("Digite sua altura em cm: ");
						altura = entrada.nextFloat();

						System.out.println("Digite seu sexo: m/f");
						sexo = entrada.next().charAt(0);

						System.out.println(s.calcularCaloriasGanharPeso(idade, peso, altura, sexo));

						break;
					
					case 3:

						System.out.println("Digite idade: ");
						idade = entrada.nextInt();

						System.out.println("Digite sua peso em kg: ");
						peso = entrada.nextFloat();
						
						System.out.println("Digite sua altura em cm: ");
						altura = entrada.nextFloat();

						System.out.println("Digite seu sexo: m/f ");
						sexo = entrada.next().charAt(0);

						System.out.println(s.calcularCaloriasPerderPeso(idade, peso, altura, sexo));

						break;

					case 4:
					
						System.out.println("Digite idade: ");
						idade = entrada.nextInt();

						System.out.println("Digite sua peso em kg: ");
						peso = entrada.nextFloat();
						
						System.out.println("Digite sua altura em cm: ");
						altura = entrada.nextFloat();

						System.out.println("Digite seu sexo: m/f ");
						sexo = entrada.next().charAt(0);

						System.out.println(s.calcularCaloriasManterPeso(idade, peso, altura, sexo));

						break;

					case 0:
						break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}