package marioState;

public class Mario {
	
	 private MarioState estadoAtual;
	 
	 public Mario() {
	        this.estadoAtual = new MarioPequeno();
	    }

	    public void setEstado(MarioState estado) {
	        this.estadoAtual = estado;
	    }

	    public void pegarCogumelo() {
	        estadoAtual.pegarCogumelo(this);
	    }

	    public void pegarFlorDeFogo() {
	        estadoAtual.pegarFlorDeFogo(this);
	    }

	    public void sofrerDano() {
	        estadoAtual.sofrerDano(this);
	    }

	    public void atingirTijolo() {
	        estadoAtual.atingirTijolo(this);
	    }
	

}

