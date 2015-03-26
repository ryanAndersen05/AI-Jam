package Controller;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;

public class InputController implements EventHandler<KeyEvent>{
	//If there are any actions that will be needed as input from the user, they can be place here
	public static int UP = 0;
	public static int DOWN = 1;
	public static int LEFT = 2;
	public static int RIGHT = 3;
	public static int JUMP = 4;
	public static int FIRE = 5;
	
	private KeyCode[] keyCodes;
	private boolean[] keysDown;//KeyDown will call true in the frame that it was used. False otherwise
	private boolean[] keysDownNow;//KeyDownNow will check if the key is down at any frame.
	private int inputSize = 6;//This is the number of inputs that can be used
	
	
	public InputController() {
		keyCodes = new KeyCode[inputSize];
		setUpKeyCodes();
		keysDown = new boolean[inputSize];
		keysDownNow = new boolean[inputSize];


	}



	public void keyPressed(KeyEvent e) {
		for (int i = 0; i < inputSize; i++) {
			if (e.getCode() == keyCodes[i]) {
				if (!keysDownNow[i]) {
					keysDown[i] = true;
				}
				keysDownNow[i] = true;
				return;
			}
		}
	}


	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < inputSize; i++) {
			if (e.getCode() == keyCodes[i]) {
				keysDown[i] = false;
				keysDownNow[i] = false;
				return;
			}
		}
	}

	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	public boolean getKeyDown(int action) {
		if (action < 0 || action >= inputSize) {
			return false;
		}
		else {
			return keysDown[action]; 
		}
	}

	/**
	*This should be called at the end of every frame in the game. This will take care of any clean up that needs to be done.
	*/
	public void finishFrame() {
		for (int i = 0; i < inputSize; i++) {
			keysDown[i] = false;
		}
	}

	public boolean getKeyDownNow(int action) {
		if (action < 0 || action >= inputSize) {
			return false;
		}
		else {
			return keysDownNow[action];
		}
	}

	/**
	*Sets up all the keycodes necessary for the game.
	*/
	private void setUpKeyCodes() {
	}


	@Override
	public void handle(KeyEvent e) {
		if (e.getEventType() == KeyEvent.KEY_PRESSED) {
			keyPressed(e);
					
		}
		if (e.getEventType() == KeyEvent.KEY_RELEASED) {
			keyReleased(e);
			
		}
		
		if (e.getEventType() == KeyEvent.KEY_TYPED) {
			keyTyped(e);
			
		}
		
	}

}