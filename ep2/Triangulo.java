public class Triangulo extends FiguraGeometrica {
	private int l1=10, l2=20, base=30, h=15;
	public double calcularArea (int a){
		a=this.base*this.h/2;
		return a;
	}
	public double calcularPerimetro(int p){
		 p=this.l1+this.l2+this.base;
		 return p;
	}
}