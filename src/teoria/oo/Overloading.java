package teoria.oo;

/*
 * Overloading ou sobre-carga de metodos , declarar varios metodos do mesmo nome da mesma classe
 * 
 * O identificador do java utiliza a combinacao da função com a lista de parametros . Para sobreescrever ,exige que a combinacao do tipo de dados junto
 * com a quantidade de parametros sejam diferentes
 * 
 * 
 * Ex :
 * 
 * int meuMetodo (int num1) [
 * }
 * 
 * int meuMetodo(float fnum){
 * }
 * 
 * int meuMetodo (int num1 , int num2){
 * }
 * 
 * Podemos tambem em vez de mudar o nome , apenas identificar a variavel
 * 
 * EX: 
 * 
 * int meuMetodo(int){
 * }
 * 
 * int meuMetodo(float){
 * }
 * 
 * int meuMetodo (int , int){
 * }
 * 
 * 
 * 
 */


class Sobrecarga {
	
	void imprime(String s) {
		System.out.println(s);
	}
	
	void imprime (String s1,String s2) {
		System.out.println(s1 + " - " + s2);
	}
	
	void imprime (String s1 , int i1) {
		System.out.println(s1 + " - " + i1);
	}
	
}


public class Overloading {
	
	public static void main(String[] args) {
		
		
		new Sobrecarga().imprime("Um parametro do tipo String");
		new Sobrecarga().imprime("Primeiro Parametro", "Segundo Parametro");
		new Sobrecarga().imprime("A idade é de " , 25);
		
	}

}
