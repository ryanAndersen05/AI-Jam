package Util;

/**
 * States will be very helpful for Ai and possibly some animation as well
 * @author Ryan
 *
 */
public interface State {
	public void enter(State oldState);
	public void execute(float deltaTime);
	public void exit();
}
