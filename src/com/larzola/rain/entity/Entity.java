package com.larzola.rain.entity;

import java.util.Random;

import com.larzola.rain.graphics.Screen;
import com.larzola.rain.level.Level;

public class Entity {
	
	public int x, y;
	public boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	public void update() {
		
	}
	
	public void render(Screen screen) {
		
	}
	
	public void remove() {
		//Remove entity from level
		removed = true;
	}
	
	public boolean isRemoved() {
		return removed;
	}
}
