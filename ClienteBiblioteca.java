package prjModuloBloco1;

import java.util.Scanner;

public class ClienteBiblioteca  {
	
	// atributos da minha classe ClienteBiblioteca
	private String nome;
	private String sexo;
	private String cpf;
	private String dtnasc;
	private int telefone; 
	private String endereco;
	private String email;
	private int id;
	
	private Scanner leia = new Scanner(System.in);
	
	public ClienteBiblioteca (String x, String sexo, String cpf,String dtnasc, int telefone, String endereco, String email)
	{
		this.nome = x;
		this.sexo = sexo;
		this.cpf = cpf;
		this.dtnasc =dtnasc;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.id = id;
	
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDtnasc() {
		return dtnasc;
	}

	public void setDtnasc(String dtnasc) {
		this.dtnasc = dtnasc;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	
	
}