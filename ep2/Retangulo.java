public class Retangulo extends FiguraGeometrica {
	private int l1=10, l2=20;
	public double calcularArea (double a){
		a=this.l1*this.l2;
		return a;
	}
	public double calcularPerimetro(double p){
		p=this.l1*2+this.l2*2;
		return p;
	}
}