package jogo;
import java.awt.Point;
import java.util.Vector;

import jplay.GameObject;
import jplay.Scene;
import jplay.TileInfo;

public abstract class Cenario {//não pode ser instanciada direto por isso é abstract
	protected boolean tileCollision(int value, Jogador jogador, Scene cena) {
		Point min = new Point((int)jogador.x, (int)jogador.y);//verifica ponto mínimo e máximo do jogador
		Point max = new Point((int)(jogador.x + jogador.width), (int)(jogador.y + jogador.height));
		Vector<?> tiles = cena.getTilesFromPosition(min, max);
		for( int i = 0; i < tiles.size(); i++) {//verifica onde está colidindo
			TileInfo tile = (TileInfo) tiles.elementAt(i);
			if(tileCollision(jogador, tile, value) == true) {
				return true;//retorna true no caso dos tiles percorríveis
			}
		}
		return false;
	}
		private boolean tileCollision(GameObject object, TileInfo tile, int value) {
			if ((tile.id == value) && object.collided(tile)) {
				return true;
			}
			return false;
		}
	

}
