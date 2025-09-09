package JogoRPG;

abstract class Personagem {
	
	protected int vida;
	TipoPersonagem  tipoPersonagem;
	String nome;
	
	Personagem(String nome, TipoPersonagem tipo, int vida){
		this.nome = nome;
		this.tipoPersonagem = tipo;
		this.vida = vida;
	}
	
	abstract boolean atacar(Personagem oponente);
	
	void receberDano(int dano) {
		this.vida -= dano;
		if(vida < 0) {
			vida = 0;
		}
		System.out.println(this.nome + " sofreu " + dano + " de dano. Vida restante: " + this.vida + "\n\n");
	}
	
	void mostrarStatus() {
		System.out.printf("Nome: %s%nTipo: " + this.tipoPersonagem +"%nVida: %d\n\n",this.nome,this.vida);
	}
	
}
