package com.larzola.rain.level.tile.spawn_level;

import com.larzola.rain.graphics.Screen;
import com.larzola.rain.graphics.Sprite;
import com.larzola.rain.level.tile.Tile;

public class SpawnFlowerTile extends Tile {

	public SpawnFlowerTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
}
