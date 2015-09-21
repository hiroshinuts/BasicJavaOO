package teoria.oo;

public class RetanguloMain  {
	
	public static void main(String[] args) {
		
		Retangulo quadrado = new Retangulo();
		quadrado.width = 100;
		quadrado.height = 120;
		
		System.out.println(quadrado.areaTotal());
		
	}

}
