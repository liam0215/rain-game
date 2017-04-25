package com.larzola.rain.graphics;

import java.util.Random;

public class Screen {

	private int width, height;
	public int[] pixels;
	public final int MAP_SIZE = 64;
	public final int MAP_SIZE_MASK = MAP_SIZE - 1;
	public int[] tiles = new int[64 * 64];
	
	private Random random = new Random();
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	
		for (int i = 0; i < MAP_SIZE * MAP_SIZE; i++) {
			tiles[i] = random.nextInt(0xffffff);
		}
		
	}
	
	public void clear() {
		for(int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}
	
	public void render(int xOffset, int yOffset) {
		for (int y = 0; y < height; y++) {
			int dy = y + yOffset;
			//if(dy < 0 || dy >= height) break;
			for(int x = 0; x < width; x++) {
				int dx = x + xOffset;
				//if(dx < 0 || dx >= width) break;
				int tileIndex = ((dx >> 4) & MAP_SIZE_MASK) + ((dy >> 4) & MAP_SIZE_MASK) * MAP_SIZE;
				pixels[x + y * width] = tiles[tileIndex]; //0x is a prefix for hexadecimal
			}
		}
	}
}
