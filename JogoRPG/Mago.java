package JogoRPG;

public class Mago extends Personagem{

	Mago(String nome){
		super(nome, TipoPersonagem.MAGO,100);
	}
	
	@Override
	boolean atacar(Personagem oponente) {
		int dano = 20;
		System.out.printf("%s (Mago) lançou magia causando %d de dano!\n",this.nome, dano);
		oponente.receberDano(dano);
		return true;
	}
}
