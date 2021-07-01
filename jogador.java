package classes;

public class jogador {
	
	public String nome = "Guilherme";
	public int vida = 100;
	Inimigo inimigo = new Inimigo();
	
	public void perdervida() {
		
		vida = vida - inimigo.dano;
	}
	
	public void ganharvida() {
		
		vida++;
		
	}

}
