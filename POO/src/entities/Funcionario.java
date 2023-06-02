package entities;

import java.time.LocalDate;

public class Funcionario {
	
	private Integer id;
	private String name;
	private String setor;
	private String nivel;
	private LocalDate birthDate;
	
	public Funcionario(Integer id, String name, String setor, String nivel, LocalDate birthDate) {
		this.id = id;
		this.name = name;
		this.setor = setor;
		this.nivel = nivel;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public String visualizar() {
		return "Id: " + getId() + "\n" 
				+ "Nome: " + getName() + "\n" 
				+ "Setor: " + getSetor() + "\n" 
				+ "Nível: " + getNivel() + "\n" 
				+ "Data de nascimento: " + getBirthDate(); 
	}
	
	
	
}
