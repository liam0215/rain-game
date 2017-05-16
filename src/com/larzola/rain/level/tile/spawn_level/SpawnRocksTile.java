package com.larzola.rain.level.tile.spawn_level;

import com.larzola.rain.graphics.Screen;
import com.larzola.rain.graphics.Sprite;
import com.larzola.rain.level.tile.Tile;

public class SpawnRocksTile extends Tile {

	public SpawnRocksTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
	
	public boolean solid() {
		return true;
	}
}
