package tuyo.designpatterns;

public class RunMovement implements Movement {

	@Override
	public void move(int distance) {
		int currentDistance = 0;
		
		while (currentDistance < distance) {
			currentDistance++;
			
			try {
				Thread.sleep(150); //diminuído o tempo de espera em comparação com WalkMovement
			} catch (InterruptedException e) {
			}
			
			System.out.println("Distância percorrida: " + currentDistance + "m");
		}
	}
}
 // Onde está o padrão strategy aqui? Está no fato de eu estar encapsulando esses algoritmos.
// Eu tenho uma família de algoritmos que são esses algoritmos de movimentação e estou encapsulando eles em classes próprias. E todas elas implementam uma interface em comum: a interface movement.
// Se eu quiser ter outros tipos de movimentação fica fácil. Basta eu criar outras classes que implementem a interface Movement. Consequentemente eu terei outros tipos de movimentação.