package tuyo.designpatterns;

public class WalkMovement implements Movement { // Classe do "movimento de andar" que implementa a interface Movement.

	@Override
	public void move(int distance) { // Sou obrigado a implementar o método move uma vez que estou implementando de Movement.
		int currentDistance = 0; // Variável que calcula o começo do que ela já andou. OU seja, começa em 0.
		
		while (currentDistance < distance) { // loop.
			currentDistance++; // incrememnto em 1 a distância da pessoa.
			
			try {
				Thread.sleep(300); // Para que o código não fique muito rápido, eu vou chamar o método Thread.sleep para atrasar a execução.
			} catch (InterruptedException e) { // tratamento da exceção
			}
			
			if (currentDistance % 20 == 0) { // a cada 20m a pessoa dá uma parada para descansar. Ou seja, divido o currentDistance por 20 e o resto dessa divisão for 0, significa que a minha distância é divisível por 20.
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
				}
				
				System.out.println("Parada para descanso");
			}
			
			System.out.println("Distância percorrida: " + currentDistance + "m");
		}
	}
}
