package tuyo.designpatterns;

public class Person { //Classe que representa uma pessoa que precisa de movimentar: correndo ou andando num trajeto.

	private String name; //Atributo name: ela terá um nome.
	
	public Person(String name) {
		this.name = name;
	} // Construtor com parâmetro name que é copiado para o atributo name.
	
	public void move(Movement movement, int distance) { // Método movel. Estou afirmando que ela vai executar um movimento. E não está em questão o objeto na memória que vai executar a movimentação: andar ou correr.
		System.out.println(name + " iniciou o movimento"); // Mostrar o nome da pessoa e que ela iniciou o movimento.
		movement.move(distance); // Para ela se movimentar basta apenas chamar o método move e passar a distância como parâmetro.
		System.out.println(name + " terminou o trajeto"); // Aqui fala que a pessoa terminou o trajeto.
	}
}
