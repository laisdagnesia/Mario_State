package marioState;

public class MarioPequeno implements MarioState {

	
	public void pegarCogumelo(Mario mario) {
        System.out.println("Mario cresceu e agora está no estado Normal.");
        mario.setEstado(new MarioNormal());
    }

    public void pegarFlorDeFogo(Mario mario) {
        System.out.println("Mario pegou uma Flor de Fogo e agora está no estado Mario Fogo.");
        mario.setEstado(new MarioFogo());
    }

    public void sofrerDano(Mario mario) {
        System.out.println("Mario pequeno sofreu dano e agora está morto.");
        mario.setEstado(new MarioMorto());
    }

    public void atingirTijolo(Mario mario) {
        System.out.println("Mario pequeno atingiu um tijolo, mas não conseguiu quebrá-lo.");
    }

}



