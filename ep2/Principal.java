public class Principal {
	public static void main (String args[]){
		FiguraGeometrica[] Figura = new FiguraGeometrica()[5];
		Figura[1] = Quadrado;
		Figura[2] = Retangulo;
		Figura[3] = Triangulo;
		Figura[4] = Circunferencia;
		Figura[5] = Trapezio;
		System.out.println (Figura[1].calcularArea());
		System.out.println (Figura[2].calcularArea());
		System.out.println (Figura[3].calcularArea());
		System.out.println (Figura[4].calcularArea());
		System.out.println (Figura[5].calcularArea());
		System.out.println (Figura[1].calcularPerimetro());
		System.out.println (Figura[2].calcularPerimetro());
		System.out.println (Figura[3].calcularPerimetro());
		System.out.println (Figura[4].calcularPerimetro());
		System.out.println (Figura[5].calcularPerimetro());	
	}
}