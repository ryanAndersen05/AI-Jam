package Model;

public abstract class State {
	private GameObject agent;
	
	public State (GameObject agent, Object[] args) {
		this.agent = agent;
		parseArgs(args);
		
	}
	
	public GameObject getAgent() {
		return agent;
	}
	
	public abstract void enter(State oldState);
	public abstract void update(float deltaTime);
	public abstract void exit();
	public abstract void parseArgs(Object[] args);
}
