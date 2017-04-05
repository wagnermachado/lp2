public class FabricaDeCarro{
	public static FabricaDeCarro instancia;
	private FabricaDeCarro(){
	}
	public static FabricaDeCarro getInstancia(){
		if(instancia == null)
			instancia = new FabricaDeCarro();
		return instancia;
	}
}
