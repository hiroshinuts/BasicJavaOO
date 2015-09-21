package teoria.oo;


/*
 * 
 * Em resumo é um metodo que chama ele mesmo. Até a chamada chegar em um problema com sua complexidade minima. 
 * 
 * 
 * ex:
 * 
 * Fatorial(5) = fatorial(5) * 4!
 * Fatorial(4) = fatorial(4) * 3!
 * Fatorial(3) = fatorial(3) * 2!
 * Fatorial(2) = fatorial(2) * 1!
 * Fatorial(1) = Fatorial(1) * 0!
 * Fatorial(0) = 1
 * 
 */

class Fatorial{
	
	int fat(int n) {
		
		if (n<=1)
			return 1;
		int r = fat(n-1)*n;
				return r;
		
	}
	
}


public class Recursividade {
	
	public static void main(String[] args) {
		
		System.out.println(new Fatorial().fat(6));
		
	}

}
