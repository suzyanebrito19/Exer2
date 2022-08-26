package atividade02;

public class Funcio {
	public String nome;
	public double salarioBruto;
	public double imposto;
	public double porcentagem;
	
	public double SalarioLiquido() {
	return salarioBruto - imposto;
	
	}
	
	public double AumentoSalario() {
	double Aumento = (salarioBruto-imposto)+(salarioBruto*porcentagem/100);
	return Aumento;

	}

}
