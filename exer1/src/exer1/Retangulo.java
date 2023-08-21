package exer1;

public class Retangulo {
	
	public double largura;
	public double altura;



public double calcArea() {
	double area = this.altura * this.largura;
	return area;

		}
public double calcPerimetro() {
	double perimetro = 2 * (largura + altura);
	return perimetro;
	}

public double calcDiagonal() {
	double diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	return diagonal;
}

}

