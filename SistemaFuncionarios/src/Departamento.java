
public class Departamento {
	private String nomeDepartamento;
	private Funcionario[] funcionarios;
	private int contador; //controla o numero de funcionarios 
	
	//construtor 
	public Departamento(String nomeDepartamento) {
		
		this.nomeDepartamento = nomeDepartamento;
		this.funcionarios =new Funcionario[5] ;
		this.contador = 0;
	}
	//adicionando funcionarios 
	public void adicionarFuncionario(Funcionario f) {
        if (contador < funcionarios.length) {
            funcionarios[contador] = f;
            contador++;
        } else {
            System.out.println("Departamento lotado! .");
    }
    }
	// Listar funcionários
    public void listarFuncionarios() {
        System.out.println("Departamento: " + nomeDepartamento);
        for (int i = 0; i < contador; i++) {
            funcionarios[i].exibirDados(); // chama o método da classe Funcionario
            System.out.println("-------------------");
    }
    }
    // calculo da folha salarial 
    public double calcularFolhaSalarial() {
    	double total = 0.0;
    	for (int i = 0 ; i < contador ; i++) {
    		if (funcionarios[i].isAtivo()) { 
    			total += funcionarios[i].getSalario();
    		}
    	}
    	return total;	
    	}
    	    
    }

