package Model;

import java.util.ArrayList;
import Util.Time;

public class Game {
	public static final int FRAME_RATE = 60;
	
	private Camera camera;
	private ArrayList<GameObject> objects;
	private Time time;
	
	public void update() {
		draw();
		time.updateTime();
		
	}
	
	
	private void draw() {
		for (GameObject obj: objects) {
			obj.update();
			
		}
	}

}
