public class Ponto{
	private double x,y;
	public void setX(double x){
		this.x = x;
}
	public double  getX(){ 
        	 return x;
}
        public void setY(double y){
                this.y = y;
}
        public double getY(){ 
                 return y;
}





	public static void main (String [] args){
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		p1.setX(10.0);
		p1.getX();
		p1.setY(20.0);
                p1.getY();
		p2.setY(20.0);
		p2.getY();
		p2.setX(10.0);
                p2.getX();
		System.out.println (p1.x + ", " +  p1.y);
		System.out.println (p2.x + ", " + p2.y);
		Ponto p3 = new Ponto();
		p3 = p1;
		Ponto p4 = p3;
		System.out.println (p3.x + ", " +  p3.y);
     		System.out.println (p4.x + ", " +  p4.y);       


}





}

