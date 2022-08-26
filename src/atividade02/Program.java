package atividade02;
import java.util.Locale;
import java.util.Scanner;
import atividade02.Funcio;
public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sca = new Scanner(System.in);
		Funcio func1 = new Funcio();
		
		System.out.println("Nome do funcionario:");
		func1.nome=sca.nextLine();
		
		System.out.println("salario bruto:");
        func1.salarioBruto = sca.nextDouble();
              
        System.out.println("Imposto:");
        func1.imposto = sca.nextDouble();
             
        System.out.printf("\nEmpregado: " + func1.nome+"," + "R$%.2f",func1.SalarioLiquido());
        System.out.println("\nQual porcentual para o aumento do  salario: \n");
        func1.porcentagem = sca.nextDouble();
        func1.AumentoSalario();
        
        System.out.println("Dados atualizados: " + func1.AumentoSalario());
	
        sca.close();
	}

}
