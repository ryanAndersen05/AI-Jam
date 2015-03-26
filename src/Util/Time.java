package Util;

public class Time {
	private float lastTime = System.currentTimeMillis();
	private float deltaTime;
	
	
	public void updateTime() {
		float currentTime = System.currentTimeMillis();
		deltaTime = currentTime - lastTime;
		lastTime = currentTime;
	}
	
	
	public float getCuttentTime() {
		return System.currentTimeMillis();
	}
	
	public float getLastUpdateTime() {
		return lastTime;
	}
	
	public float deltaTime() {
		return deltaTime;
	}
}
