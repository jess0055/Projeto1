package Matematica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora calc = new Calculadora();
		Cubo cubo = new Cubo();
		double area = new Area(calc).Triangulo(10, 9);
		
		System.out.println("Resultado = " +  calc.soma(5,5));  
		System.out.println("Resultado = " +  cubo.valorCubo(3)); 
		System.out.println("Resultado = " +  area); 

	}

}
