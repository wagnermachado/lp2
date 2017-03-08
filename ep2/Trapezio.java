public class Trapezio extends FiguraGeometrica {
	private int base=10, h1=40, h2=20;
	public double calcularArea (double a){
		 a=this.base*(this.h1+this.h2)/2;
		 return a;
	}
	public double calcularPerimetro(double p){
		int h=(this.h1+this.h2)/2;
		p = this.base*2+h*2;
		return p;
	}
}