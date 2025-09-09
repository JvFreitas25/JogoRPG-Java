package JogoRPG;

public class Guerreiro extends Personagem{
	
	Guerreiro(String nome){
		super(nome, TipoPersonagem.GUERREIRO , 120);
	}
	
	@Override
	boolean atacar(Personagem oponente) {
		int dano = 10;
		System.out.printf("%s (Guerreiro) atacou causando %d de dano!\n",this.nome, dano);
		oponente.receberDano(dano);
		return true;
	}
}
