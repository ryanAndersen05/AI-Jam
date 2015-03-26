package Model;

import java.util.ArrayList;
import Util.Time;

public class Game {
	private Camera camera;
	private ArrayList<GameObject> objects;
	private Time time;
	
	public void update() {
		draw();
		time.updateTime();
		
	}
	
	
	private void draw() {
		
	}

}
