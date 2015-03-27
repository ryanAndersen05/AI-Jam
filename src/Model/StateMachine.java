package Model;

import java.util.ArrayList;

import Util.State;

/**
 * 
 * @author Ryan
 *
 */
public class StateMachine {
	ArrayList<String> states;
	public 
	
	public StateMachine() {
		this.states = new ArrayList<String>();
	}
	
	public void changeState(String state) {
		boolean validState = false;
		for (String s: states) {
			if (state.equalsIgnoreCase(s)) {
				validState = true;
				break;
				
			}
		}
		if (!validState) return;
		
		
	}

}
