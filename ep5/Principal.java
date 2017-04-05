public class Principal{
	public static void main(String args []){
		FabricaDeCarro f1 = FabricaDeCarro.getInstancia();
		FabricaDeCarro f2 = FabricaDeCarro.getInstancia();
		FabricaDeCarro f3 = FabricaDeCarro.getInstancia();
		FabricaDeCarro f4 = FabricaDeCarro.getInstancia();
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
	}
}
