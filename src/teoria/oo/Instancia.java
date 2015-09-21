package teoria.oo;

/*
 * 
 * Toda vez q tentar acessar atributo ou metodo de uma classe nao instanciada, gerara uma Excessao NullPointerException
 * 
 * A palavra chave "new"  - invoca o construtor da classe alocando memoria para o mesmo objeto, apontando para a classe , new instancia uma classe
 * 
 * 
 * 
 */


public class Instancia {
	
	public static void main(String[] args) {
		
		Retangulo r1 = null;
		if (r1 !=null)
		r1.isQuadrado();
		
		Retangulo r = new Retangulo();
		Retangulo rum;
		
		int i1 = 10;
		int i2 = i1; // variaveis primitivas nao apontam para o mesmo lugar da memoria
		
		i2 = 20;
		
		
		System.out.println(i1);
		System.out.println(i2);
		
		rum = r; // aponta para o mesmo objeto na memoria , nao copia os valores
		r.width = 1000;
		
		System.out.println(r.width);
		System.out.println(rum.width);
		
		
	}

}
