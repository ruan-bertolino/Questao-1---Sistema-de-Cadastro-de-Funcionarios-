
public class TesteSistema {
	public static void main(String[]args) {
		
		Departamento departamento1 = new Departamento("TecnologiaDaInformação");
		
		//funcionarios parametrizados
		Funcionario funcionario1 = new Funcionario("Ruan","170.180.120-43", "Diretor de TI",40000 );
        Funcionario funcionario2 = new Funcionario("João", "120.330.140-57", "Gestor de TI", 10000);	
		Funcionario funcionario3 = new Funcionario("Pedro", "120.789.430-29", "Analista de TI", 5000);
		
		//funcionario default
		Funcionario funcionario4 = new Funcionario();
		
		//mostrando candidatos e seus cargos
		//o motivo de colocar demitir a frente de exibir dados
		//e porque eles ainda não foram adicionados ao departamento por isso devem a
		//parecer como inativos
		System.out.println("Relatorio de Candidatos antes da sua admissão ao Departamento de Informações");
		funcionario1.exibirDados(); 
		System.out.println("==============");
		funcionario2.exibirDados(); 
		System.out.println("==============");
		funcionario3.exibirDados(); 
		System.out.println("==============");
		funcionario4.exibirDados(); 
		
		System.out.println("\n o cargo 4 foi definido de ultima hora ");
		
		funcionario4.alterarDados("Roberto", "178,149,123-80","Estagiario de Ti" , 1700); funcionario4.demitir();
		System.out.println("\n");
		funcionario4.exibirDados();
		System.out.println("\n");
		
		//se eu exibir o departamento agora não vai me retorna apenas o nome do departamento porque
		//ainda não foi adicionado funcionarios 
		
		//adicionando
		departamento1.adicionarFuncionario(funcionario1); funcionario1.reativar();  
		departamento1.adicionarFuncionario(funcionario2); funcionario2.reativar();
		departamento1.adicionarFuncionario(funcionario3); funcionario3.reativar();
		departamento1.adicionarFuncionario(funcionario4); funcionario4.reativar();

		System.out.println("Departamento logo aposo estagio de admissão ser concluido \n");
	    //exibindo departamento
		departamento1.listarFuncionarios();
		
		//funcionario 1 recebe uma promoção de 15% assim tendo um reajuste salarial 
		funcionario1.aplicarReajustePercentual(15);
		System.out.println("====ReajustePercentual=====");
		System.out.println("O Diretor de TI recebe um reajuste de 15% \n");
		funcionario1.exibirDados();
		
		//funcionario 3 não apresenta um bom desempenho e recebe um encerramento de contrato 
		//resetantondo os dados do funcionario 3 usando set 
		funcionario3.demitir();
		
		funcionario3.setNome("Indefinido");
		funcionario3.setCpf("000.000.000-00");
		funcionario3.setCargo("Indefinido");
		funcionario3.setSalario(0.0);
		//n usei nem um  set tive a sensação de serem apenas lixo
		System.out.println("\n");
		System.out.println("Espaço do funcionario 3 logo apos sua demissão\n");
		funcionario3.exibirDados();
		System.out.println("\nListagem do departamento atualmente \n");
		departamento1.listarFuncionarios();
		
		System.out.println("\nCalculo da folha salarial \n");
		System.out.println("funcionario1 " + funcionario1.getSalario());
		System.out.println("funcionario2 " + funcionario2.getSalario());
		System.out.println("funcionario3 " + funcionario3.getSalario());
		System.out.println("funcionario4 " + funcionario4.getSalario());
		System.out.println("\nTotal da folha: " + departamento1.calcularFolhaSalarial());
	} 
}
