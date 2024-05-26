package marioState;

public class MarioFogo implements MarioState {

	 public void pegarCogumelo(Mario mario) {
	        System.out.println("Mario já está no estado Fogo.");
	    }

	    public void pegarFlorDeFogo(Mario mario) {
	        System.out.println("Mario já está no estado Fogo.");
	    }

	    public void sofrerDano(Mario mario) {
	        System.out.println("Mario Fogo sofreu dano e agora está no estado Normal.");
	        mario.setEstado(new MarioNormal());
	    }

	    public void atingirTijolo(Mario mario) {
	        System.out.println("Mario quebrou o tijolo!");
	    }

}


