package JogoRPG;

public class JogoRPG {
	public static void main(String[] args) {
		Personagem player1 = new Guerreiro("Thor");
		Personagem player2 = new Mago("Lohan");
		Personagem player3 = new Arqueiro("Robin Hood");
		
		System.out.println("===== BATALHA =====");
		
		player1.mostrarStatus();
		player2.mostrarStatus();
		player3.mostrarStatus();
		
		player1.atacar(player2);
		player3.atacar(player1);
		player2.atacar(player3);
		
		player1.atacar(player1);
		player3.atacar(player2);
		player2.atacar(player3);
		
		player1.atacar(player3);
		player3.atacar(player2);
		player2.atacar(player1);
		
		player1.mostrarStatus();
		player2.mostrarStatus();
		player3.mostrarStatus();
	}
}
