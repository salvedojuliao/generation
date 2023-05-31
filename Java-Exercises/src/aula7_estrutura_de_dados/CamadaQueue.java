package aula7_estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CamadaQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<String> fila = new LinkedList<>();

		printMenu();

		System.out.print("\nEntre com a opção desejada: ");
		int choiceList = sc.nextInt();

		while (verifyOption(choiceList)) {
			switch (choiceList) {
			case 1:
				addClient(fila);
				System.out.print("\nDeseja continuar o programa (s/n)? ");
				choiceList = verifyInput(sc.next().toLowerCase().charAt(0));
				break;
			case 2:
				listClients(fila);
				System.out.print("\nDeseja continuar o programa (s/n)? ");
				choiceList = verifyInput(sc.next().toLowerCase().charAt(0));
				break;
			case 3:
				removeClients(fila);
				System.out.print("\nDeseja continuar o programa (s/n)? ");
				choiceList = verifyInput(sc.next().toLowerCase().charAt(0));
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			}
		}
		System.out.println("\nPrograma Finalizado!");
		sc.close();
	}

	public static void printMenu() {
		for (int i = 0; i <= 50; i++)
		System.out.print("*");
		System.out.println("\n");
		System.out.println("\t 1 - Adicionar Cliente na Fila");
		System.out.println("\t 2 - Listar todos os Clientes");
		System.out.println("\t 3 - Retirar Cliente da Fila");
		System.out.println("\t 0 - Sair");
		System.out.println("");
		for (int i = 0; i <= 50; i++)
		System.out.print("*");
	}

	// Verifica a opção escolhida
	public static boolean verifyOption(int inputOption) {
		int option = inputOption;
		Scanner sc = new Scanner(System.in);
		while (!(option <= 3) || !(option > -1)) {
			System.out.print("\nOpção inválida! \nDigite novamente: ");
			option = sc.nextInt();
		}
		return (option != 0) ? true : false;
	}

	// Verifica se o user deseja continuar
	public static int verifyInput(char response) {
		char input = response;
		Scanner sc = new Scanner(System.in);
		while (input != 'n' && input != 's') {
			System.out.print("\nOpção inválida! \nDigite novamente: ");
			input = sc.next().toLowerCase().charAt(0);
		}
		if (input == 'n') {
			System.out.println("\nPrograma Finalizado!");
			return 0;
		} else {
			clearScreen();
			printMenu();
			System.out.print("\nEntre com a opção desejada: ");
			int choiceList = sc.nextInt();
			verifyOption(choiceList);
			return choiceList;
		}
	}

	// Adicionar cliente na fila
	public static void addClient(Queue<String> fila) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nDigite o nome: ");
		String nameInput = sc.nextLine();
		fila.add(nameInput);
		System.out.println("\nFila:");
		System.out.println("\n" + nameInput);
		System.out.println("\nCliente adicionado!");
	}

	// Lista nomes:
	public static void listClients(Queue<String> fila) {
		if (fila.size() == 0) {
			System.out.println("\nA lista está vazia!");
		} else {
			System.out.println("\nLista de Clientes na Fila:");
			System.out.println();
			fila.forEach(name -> System.out.println(name));
		}
	}

	// Remove cliente
	public static void removeClients(Queue<String> fila) {
		if (!fila.isEmpty()) {
			String calledClient = fila.peek();
			System.out.println("\nFila:\n");
			fila.poll();
			fila.forEach(n -> System.out.println(n));
			System.out.println("\nO Cliente " + calledClient + " foi Chamado!");
		}else {
			System.out.println("\nLista de Clientes na Fila:");
		}
	}
	
	// Clear screen - Funcioan apenas no terminal do git
		public static void clearScreen() {  
		    System.out.print("\033[H\033[2J");  
		    System.out.flush();  
		}  

}
