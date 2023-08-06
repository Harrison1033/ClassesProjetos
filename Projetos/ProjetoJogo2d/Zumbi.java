package jogo;

import jplay.URL;

public class Zumbi extends Ator {

	private double ataque = 1;
	public Zumbi(int x, int y) {
		super(URL.sprite("Zumbi 03.png"), 16);//o 16 � o n�mero de frames
		this.x = x;
		this.y = y;
		this.setTotalDuration(2000);
		this.velocidade = 0.05;
	}
	public void perseguir(double x, double y) {
		if(this.x > x && this.y <= y + 50 && this.y >= y -50) {
			moveTo(x, y, velocidade);
			if(direcao != 1) {
				setSequence(5, 8);
				direcao = 1;//dire��o que o zumbi est� se dirigindo
			}
			movendo = true;
		}
		else if (this.x < x && this.y <= y +50 && this.y >= y - 50) {
			moveTo(x, y, velocidade);
			if(direcao != 2) {
				setSequence(9, 12);//frames referente a dire��o que o zumbi tem que estar
				direcao = 2;
			}
			movendo = true;
		}
		else if(this.y > y) {
			moveTo(x, y, velocidade);
			if(direcao != 4) {
				setSequence(13, 16);
				direcao = 4;
			}
			movendo = true;
		}
		else if(this.y < y) {
			moveTo(x, y, velocidade);
			if(direcao != 5) {
				setSequence(1, 4);
				direcao = 5;
			}
			movendo = true;
		}
		if(movendo) {
			update();
			movendo = false;
		}
	}
	public void morrer() {
		if(this.energia <= 0) {
			this.velocidade = 0;
			this.ataque = 0;
			this.direcao = 0;
			this.movendo = false;
			this.x = 10_000;//posi��o do zumbi ap�s a morte
		}
	}
	public void ataque(Jogador jogador) {//m�todo para zumbi atacar jogador
		if(this.collided(jogador)) {//caso zumbi colida com o jogador
			Jogador.energia -= this.ataque ;//jogador perde energia
		}
		if (Jogador.energia <= 0) {
			System.exit(0);//TALVEZ UMA URL NO LUGAR DO ZERO
		}
	}
}
