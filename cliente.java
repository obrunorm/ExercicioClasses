package ExercicioClasse;

public class cliente {

	 String nome, endereço, produto;
	 int idade;
	 int rg;
	 int cpf;
	 int dinheiro;
	
	//métodos
	void comprar(int comprar) {
		comprar -= dinheiro;
	}
	void devolver(int devolver) {
		devolver = dinheiro;
	}
	 
	 
}
