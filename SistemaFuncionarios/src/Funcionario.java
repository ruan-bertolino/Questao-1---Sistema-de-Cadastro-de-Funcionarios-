
public class Funcionario {
	//atributos privados 
	private String nome;
	private String cpf;
	private String cargo;
	private double salario;
	private boolean ativo; 
	
	//construtor parametrizado
	public Funcionario(String nome, String cpf, String cargo, double salario) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
		this.ativo= false;
	}
	//construtor default
	public Funcionario() {
		
		this.nome = "Indefinido";
		this.cpf = "000.000.000-00";
		this.cargo = "Indefinido";
		this.salario = 0.0;
		this.ativo = false;
	}

	//getters e setters criados pelo source (que metodo roubado)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	//metodos 
	
	public void alterarDados(String nome,String cpf, String cargo, double salario ) {
		this.nome = nome;
	    this.cpf = cpf;
	    this.cargo = cargo;
	    this.salario = salario;	
	}
	public void aplicarReajustePercentual(double percentual) {
	    if (percentual > 0) {
	        this.salario += this.salario * (percentual / 100);
	    }
	}
	public void demitir() {this.ativo = false;}
	
	public void reativar() {this.ativo = true;}
	
	public void exibirDados() {
	    System.out.println("Nome: " + this.nome);
	    System.out.println("CPF: " + this.cpf);
	    System.out.println("Cargo: " + this.cargo);
	    System.out.println("Salário: " + this.salario);
	    System.out.println("Status: " + (this.ativo ? "Ativo" : "Inativo"));
	}
}