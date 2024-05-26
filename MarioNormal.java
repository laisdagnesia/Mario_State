package marioState;

public class MarioNormal implements MarioState {

	public void pegarCogumelo(Mario mario) {
		System.out.println("Mario já está no estado normal");

	}

	public void pegarFlorDeFogo(Mario mario) {
		 System.out.println("Mario pegou uma Flor de Fogo e agora está no estado Mario Fogo.");
	     	mario.setEstado(new MarioFogo());
	}

	public void sofrerDano(Mario mario) {
		System.out.println("Mario Normal sofreu dano e agora está no estado Pequeno");
			mario.setEstado(new MarioPequeno());
	}


	public void atingirTijolo(Mario mario) {
		System.out.println("Mario quebrou o tijolo!");

	}

}


