package meu_projeto;
import java.util.Scanner;

public class rede_hoteis {
	public static void main(String[] args) {

		//Importamos o Scanner, para pegar os dados digitados no console...
				Scanner entrada = new Scanner(System.in);
				
				String lakewood = "Lakewood";
				String bridgewood = "Bridgewood";
				String ridgewood = "Ridgewood";
				
				System.out.println("Qual o tipo de cliente regular ou reward: ");
				String cliente = entrada.next();
				
		
				//Pegar dia, m�s e ano
				System.out.println("Digite o dia: ");
				int dia = entrada.nextInt();
				
				System.out.println("Digite o m�s: ");
				int mes = entrada.nextInt();
				
				System.out.println("Digite o ano: ");
				int ano = entrada.nextInt();
				
				//Criamos uma variavel para a coleta dos dados, do dia da semana...
				System.out.println("Para agendar sua reserva digite 1 para dia de semana ou 2 para final de semana? ");
				int diaSemana = entrada.nextInt();
				
								
				
				
				if(diaSemana == 1 && cliente.equalsIgnoreCase("regular")) {
					System.out.println("Dia da reserva: " + dia + "/" + mes + "/" + ano);
					System.out.println("Valor da reserva � R$ 110.00 o tipo de cliente �: " + cliente);
					System.out.println("o Hotel mais barato � o:" + lakewood);
				
				}else if (diaSemana == 1 && cliente.equalsIgnoreCase("reward")) {
					System.out.println("Dia da reserva: " + dia + "/" + mes + "/" + ano);
					System.out.println("Valor da reserva � R$ 80.00 o tipo de cliente �: " + cliente);
					System.out.println("o Hotel  mais barato � o: " + lakewood);
				}
				
				else if (diaSemana == 2 && cliente.equalsIgnoreCase("regular")) {
					System.out.println("Dia da reserva: " + dia + "/" + mes + "/" + ano);
					System.out.println("Valor da reserva � R$ 60.00 o tipo de cliente �: " + cliente);
					System.out.println("o Hotel  mais barato � o: " + bridgewood);
				}
				
				else if (diaSemana == 2 && cliente.equalsIgnoreCase("reward")) {
					System.out.println("Dia da reserva: " + dia + "/" + mes + "/" + ano);
					System.out.println("Valor da reserva � R$ 40.00 o tipo de cliente �: " + cliente);
					System.out.println("o Hotel  mais barato � o: " + ridgewood);

				}else {
					System.out.println("Escolha o dia de reserva DIA DE SEMANA OU DE FINAL DE SEMANA.");
				}
				
				//fechando o Scanner, caso n�o use o "entrada.close(); " ainda continuar� rodando no console..		
				entrada.close();
				

	}
}
