package teoria.oo;

/*
 * 
 * São responsaveis pela inicializacao do objeto quando utilizado (new) , Sempre deve ser com o mesmo nome da classe, Por default, se nao for especificado
 * sera invocado o construtor da super classe OBJECT
 * 
 * 
 */


class Janela {
	int largura, altura;
	Janela(int l, int a){    //construtor janela , nome da classe + ()
		largura = l;
		altura = a;
		
	}
	
	void imprimir() {
		System.out.println("Altura = " + altura + ", a largura = "+ largura );
	}
	
}


public class Construtores {
	
	public static void main(String[] args) {
		Janela j = new Janela(250, 300);
		j.imprimir();
	}

}
