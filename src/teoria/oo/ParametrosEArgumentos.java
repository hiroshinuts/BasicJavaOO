package teoria.oo;

/*
 * 
 * Parametros E Argumentos
 * 
 * tipo nome (parametro1 ; tipo parametro2) {
 * 			//corpo
 * }
 * 
 * nome (argumento1 , argumento2);
 * 
 * 
 */



 class ParametrosEArgumentos { 
	 
	 //nome do video calculo
	 
class Calculo {	 
	 
	 void soma (int num1 ,int num2) {
		 
		 System.out.println(num1 + num2);
		 
	 }
	 
}

	

	public void main(String[] args) {
		
		Calculo cal = new Calculo();
		cal.soma(5, 25);
				
		
		
	}

}

