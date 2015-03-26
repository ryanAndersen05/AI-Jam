package Util;

/**
 * All methods that deal with time will be made here. Time is a useful tool if you want the game to play with the same no matter how
 * fast the game renders
 * @author Ryan
 *
 */
public class Time {
	private float lastTime = System.currentTimeMillis();
	private float deltaTime;
	
	/**
	 * This method should be called after every frame for keep all information up to date
	 */
	public void updateTime() {
		float currentTime = System.currentTimeMillis();
		deltaTime = currentTime - lastTime;
		lastTime = currentTime;
	}
	
	/**
	 * Returns the current time of the system clock. May possibly be useful if the game is has some
	 * componenet that relies on real time.
	 * @return
	 */
	public float getCuttentTime() {
		return System.currentTimeMillis();
	}
	
	/**
	 * Returns the time from the last frame that was updated
	 * @return
	 */
	public float getLastUpdateTime() {
		return lastTime;
	}
	
	/**
	 * Returns the time when the last frame first began to be rendered and the time that the current frame is now being drawn
	 * @return
	 */
	public float deltaTime() {
		return deltaTime;
	}
}
