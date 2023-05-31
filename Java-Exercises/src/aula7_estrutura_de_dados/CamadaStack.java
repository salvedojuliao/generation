package aula7_estrutura_de_dados;

import java.util.Scanner;
import java.util.Stack;

public class CamadaStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<String> books = new Stack<String>();

		printMenu();

		System.out.print("\nEntre com a opção desejada: ");
		int choiceList = sc.nextInt();

		while (verifyOption(choiceList)) {
			switch (choiceList) {
			case 1:
				addBook(books);
				System.out.print("\nDeseja continuar o programa (s/n)? ");
				choiceList = verifyInput(sc.next().toLowerCase().charAt(0));
				break;
			case 2:
				listBooks(books);
				System.out.print("\nDeseja continuar o programa (s/n)? ");
				choiceList = verifyInput(sc.next().toLowerCase().charAt(0));
				break;
			case 3:
				removeBook(books);
				System.out.print("\nDeseja continuar o programa (s/n)? ");
				choiceList = verifyInput(sc.next().toLowerCase().charAt(0));
				break;
			}
		}
		System.out.println("\nPrograma Finalizado!");
		sc.close();
	}

	// Imprime o menu
	public static void printMenu() {
		for (int i = 0; i <= 50; i++)
			System.out.print("*");
		System.out.println("\n");
		System.out.println("\t 1 - Adicionar Livos na Pilha");
		System.out.println("\t 2 - Listar todos os Livros");
		System.out.println("\t 3 - Retirar livro da Pilha");
		System.out.println("\t 0 - Sair");
		System.out.println("");
		for (int i = 0; i <= 50; i++)
			System.out.print("*");
	}

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
			printMenu();
			System.out.print("\nEntre com a opção desejada: ");
			int choiceList = sc.nextInt();
			verifyOption(choiceList);
			return choiceList;
		}
	}

	// Adiciona um livro
	public static void addBook(Stack<String> books) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nDigite o nome: ");
		String bookName = sc.nextLine();
		books.push(bookName);
		System.out.println("\nPilha:");
		System.out.println("\n" + bookName);
		System.out.println("\nLivro adicionado!");
	}

	// Lista os livros:
	public static void listBooks(Stack<String> books) {
		if (books.isEmpty()) {
			System.out.println("\nA Pilha está vazia!");
		} else {
			System.out.println("\nA Pilha está vazia!");
			System.out.println();
			books.forEach(book -> System.out.println(book));
		}
	}

	// Remove cliente
	public static void removeBook(Stack<String> books) {
		if (!books.isEmpty()) {
			String removedBook = books.pop();
			System.out.println("\nFila:\n");
			books.forEach(book -> System.out.println(book));
			System.out.println("\nO livro " + removedBook + " foi retirado da pilha!");
		} else {
			System.out.println("\nA Pilha está vazia!");
			
		}
	}

}
