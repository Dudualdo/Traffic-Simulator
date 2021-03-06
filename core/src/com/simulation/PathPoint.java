package com.simulation;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class PathPoint extends Entity {
	private float x, y, width, height;
	private ArrayList<Path> startingPathList; //this is the path list in which this point belongs to and it's the start point
	private ArrayList<Path> endingPathList; //this is the path list in which this point belongs to and it's the end point
	int mode = 0;
	float spawnTimer;
	float currentTimer = 0f;
	
	//mode = 1: curve
	//mode = 2: spawner
	//mode = 3: despawner 
	
	public PathPoint(float x, float y) {
		super(x, y, 30, 30);
		this.x = x;
		this.y = y;
		width = 30;
		height = 30;
		startingPathList = new ArrayList<Path>();
		endingPathList = new ArrayList<Path>();
	}
	
	
	public void update() {
		currentTimer += Gdx.graphics.getDeltaTime();
	}
	
	public void draw(ShapeRenderer shapeRenderer) {
		shapeRenderer.setColor(0.1f, 0.6f, 0.9f, 1);
		shapeRenderer.rect(x, y, width, height);
	}
	
	public float getCurrentTimer() {
		return currentTimer;
	}

	public void setCurrentTimer(float currentTimer) {
		this.currentTimer = currentTimer;
	}

	public float getSpawnTimer() {
		return spawnTimer;
	}

	public void setSpawnTimer(float spawnTimer) {
		this.spawnTimer = spawnTimer;
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}
	
	public ArrayList<Path> getStartingPathList() {
		return startingPathList;
	}

	public void setStartingPathList(ArrayList<Path> startingPathList) {
		this.startingPathList = startingPathList;
	}

	public ArrayList<Path> getEndingPathList() {
		return endingPathList;
	}

	public void setEndingPathList(ArrayList<Path> endingPathList) {
		this.endingPathList = endingPathList;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}


}
