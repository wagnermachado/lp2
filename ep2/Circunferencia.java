public class Circunferencia extends FiguraGeometrica {
	private int r=10;
	public double calcularArea (double a){
		a= Math.PI*this.r*this.r;
		return a;
	}
	public double calcularPerimetro(double p){
		p= 2*Math.PI*this.r;
		return p;
	}
}