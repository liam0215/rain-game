package com.larzola.rain.level;

import com.larzola.rain.graphics.Screen;
import com.larzola.rain.level.tile.Tile;

public class Level {

	protected int width, height;
	protected int[] tilesInt;
	protected int[] tiles;
	public static Level spawn = new SpawnLevel("/levels/spawn.png");
	
	public Level(int width, int height) {
		this.width = width;
		this.height = height;
		tilesInt = new int[width*height];
		generateLevel();
	}
	
	public Level(String path) {
		loadLevel(path);
		generateLevel();
	}
	
	protected void generateLevel() {
		
	}
	
	protected void loadLevel(String path) {
		
	}
	
	public void update() {
		
	}
	
	private void time() {
		
	}
	
	public void render(int xScroll, int yScroll, Screen screen) {
		screen.setOffset(xScroll, yScroll);
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width + 16) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height + 16) >> 4;
		
		for (int y = y0; y < y1; y++) {
			for (int x = x0; x < x1; x++) {
				getTile(x, y).render(x, y, screen);
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		if(x < 0 || y < 0 || x >= width || y >= height)  return Tile.voidTile;
		if(tiles[x + y * width] == Tile.COL_SPAWN_GRASS) return Tile.spawn_grass_tile;
		if(tiles[x + y * width] == Tile.COL_SPAWN_FLOWER) return Tile.spawn_flowers_tile;
		if(tiles[x + y * width] == Tile.COL_SPAWN_ROCK) return Tile.spawn_rocks_tile;
		return Tile.voidTile;
	}
}
