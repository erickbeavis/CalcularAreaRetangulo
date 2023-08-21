package exer1;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Insira a Largura do Retangulo: ");
		System.out.print("Largura: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.print("Altura: ");
		retangulo.altura = sc.nextDouble();
		
		double area = retangulo.calcArea();
		double perimetro = retangulo.calcPerimetro();
		double diagonal = retangulo.calcDiagonal();
		
		System.out.println();
		System.out.println("A área do retangulo é: " + area);
		System.out.println("O perímetro do retangulo é: " + perimetro);
		System.out.println("O perímetro do retangulo é: " + diagonal);

		
		
		sc.close();
	}

}
