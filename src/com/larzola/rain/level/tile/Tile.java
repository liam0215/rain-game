package com.larzola.rain.level.tile;

import com.larzola.rain.graphics.Screen;
import com.larzola.rain.graphics.Sprite;
import com.larzola.rain.level.tile.spawn_level.SpawnFlowerTile;
import com.larzola.rain.level.tile.spawn_level.SpawnGrassTile;
import com.larzola.rain.level.tile.spawn_level.SpawnRocksTile;

public class Tile {

	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	public static Tile flower = new FlowerTile(Sprite.flower);
	public static Tile rock = new RockTile(Sprite.rock);
	
	public static Tile spawn_grass_tile = new SpawnGrassTile(Sprite.spawn_grass);
	public static Tile spawn_flowers_tile = new SpawnFlowerTile(Sprite.spawn_flowers);
	public static Tile spawn_rocks_tile = new SpawnRocksTile(Sprite.spawn_rocks);

	public final static int COL_SPAWN_GRASS = 0xff00ff00;
	public final static int COL_SPAWN_ROCK = 0xff8e8e8e;
	public final static int COL_SPAWN_FLOWER = 0xfffffa00;


	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}

	public void render(int x, int y, Screen screen) {
		
	}
	
	public boolean solid() {
		return false;
	}
}
