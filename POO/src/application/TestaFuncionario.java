package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Funcionario f1 = new Funcionario(1, "Diego", "Operações", "Júnior", LocalDate.parse("10/08/2000", fmt));
		Funcionario f2 = new Funcionario(2, "Geovana", "Developer", "Pleno", LocalDate.parse("25/09/1997", fmt));

		System.out.println(f1.visualizar());
		System.out.println();
		System.out.println(f2.visualizar());
	}

}
