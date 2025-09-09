package JogoRPG;

public class Arqueiro extends Personagem{

	Arqueiro(String nome){
		super(nome, TipoPersonagem.ARQUEIRO ,100);
	}
	
	@Override
	boolean atacar(Personagem oponente) {
		int dano = 15;
		System.out.printf("%s (Arqueiro) disparou uma flecha causando %d de dano!\n",this.nome, dano);
		oponente.receberDano(dano);
		return true;
	}
}
