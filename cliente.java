package ExercicioClasse;

public class cliente {

	 String nome, endere�o, produto;
	 int idade;
	 int rg;
	 int cpf;
	 int dinheiro;
	
	//m�todos
	void comprar(int comprar) {
		comprar -= dinheiro;
	}
	void devolver(int devolver) {
		devolver = dinheiro;
	}
	 
	 
}
