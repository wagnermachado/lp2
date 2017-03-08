public class Quadrado extends FiguraGeometrica {
	private int l=10;
	public double calcularArea (double a){
		a=this.l*this.l;
		return a;
	}
	public double calcularPerimetro(double p){
		p=this.l*4;
		return p;
	}
}