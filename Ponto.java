public class Ponto
{
    private double x,y;
    public void setX(double x)
    {
        this.x = x;
    }
    public double  getX()
    {
        return x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public double getY()
    {
        return y;
    }
    public Ponto ()
    {
        System.out.println ("Construtor 1 - " + this);
    }
    public Ponto ( double x, double y)
    {
        System.out.println ( "Construtor 2" );
        this.x = x;
        this.y = y;
    }
    public static void main (String [] args)
    {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        p1.setX(30);
        p1.getX();
        p1.setY(20);
        p1.getY();
        p2.setY(50);
        p2.getY();
        p2.setX(70);
        p2.getX();
        double distY = p1.getY() - p2.getX();
        double distX = p1.getX() - p2.getY();
        distX = Math.pow(distX, 2);
        distY = Math.pow(distY, 2);
        double p = distX+distY;
        System.out.println (Math.sqrt(p));
        Ponto p4 = new Ponto (4.00, 5.0);
        Reta r1 = new Reta();
        r1.setP1(p1);
        r1.setP2(p2);
       	p1.setX(30);
	p1.setY(15);
        r1.getP2().setY(20);
        r1.getP2().setY(40);
	System.out.println(r1.getP1().getX());
	System.out.println(r1.getP1().getY());	
	System.out.println(r1.getP2().getX());
	System.out.println(r1.getP2().getY());       
	}
}
