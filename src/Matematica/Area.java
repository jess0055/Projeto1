package Matematica;

public class Area {
	
	private Calculadora calc;
	
	public Area(Calculadora calc){
		this.calc  = calc;
	}
	
	public double Triangulo(double b, double h){
		return  calc.divisao(calc.multiplicacao(b,h), 2);		
	}
}
