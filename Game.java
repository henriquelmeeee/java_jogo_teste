package classes;

public class Game {
	
	public static void main(String[] args) {
		
		jogador player = new jogador();
		Inimigo inimigo = new Inimigo();
		ElfInimigo elf = new ElfInimigo();
		
		if(player.nome == "Guilhermee") {
		
		player.perdervida();
		player.perdervida();
		
		System.out.println(player.vida);
		}else {
			
			
			player.vida = player.vida - elf.dano;
			
		}
		
		player.ganharvida();
		
		System.out.println(player.vida);
		
	}

}

