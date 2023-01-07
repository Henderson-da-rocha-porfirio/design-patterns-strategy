package tuyo.designpatterns;

public class App { // Método Main. Método de entrada da aplicação.

	public static void main(String[] args) {
		
		Person p = new Person("José");
		p.move(new RunMovement(), 50); // Pedir para ela se movimentar. Se quiser que josé ande, é só mudar o objeto e passar no parâmetro do método move o objeto WalkMovement.
	}											// Aplicação do método Strategy para o algoritmo que for conveniente.
}													// Exemplo do uso do algoritmo modificado na movimentação apenas passando objetos diferentes: RunMovement ou WalkMovement.
														// Exemplo da utilização do padrão Strategy para provocar a mudança de algoritmo quando for conveniente.
