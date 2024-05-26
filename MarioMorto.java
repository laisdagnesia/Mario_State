package marioState;

public class MarioMorto implements MarioState {

	public void pegarCogumelo(Mario mario) {
        System.out.println("Mario está morto e não pode pegar um cogumelo.");
    }

    public void pegarFlorDeFogo(Mario mario) {
        System.out.println("Mario está morto e não pode pegar uma Flor de Fogo.");
    }

    public void sofrerDano(Mario mario) {
        System.out.println("Mario já está morto.");
    }

    public void atingirTijolo(Mario mario) {
        System.out.println("Mario está morto e não pode atingir tijolos.");
    }
}

