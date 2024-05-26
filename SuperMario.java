package marioState;

public class SuperMario {
	  public static void main(String[] args) {
	        Mario mario = new Mario();

	        mario.pegarCogumelo();    
	        mario.sofrerDano();
	        mario.pegarCogumelo();    
	        mario.pegarFlorDeFogo();
	        mario.atingirTijolo();
	    }
}







//public class SuperMario {
//	  public static void main(String[] args) {
//	        Mario mario = new Mario();
//
//	        mario.pegarCogumelo();    // Mario cresce para estado Normal
////	        mario.atingirTijolo();    // Mario quebra o tijolo
////	        mario.sofrerDano();       // Mario fica pequeno
////	        mario.sofrerDano();       // Mario pequeno sofre dano e morre
////	        mario.pegarCogumelo();    // Mario morto não pode pegar cogumelos
//	    }
//
//}
