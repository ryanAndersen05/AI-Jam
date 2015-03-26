package Util;

public interface State {
	public void enter(State oldState);
	public void execute(float deltaTime);
	public void exit();
}
