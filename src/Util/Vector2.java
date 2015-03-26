package Util;

public class Vector2 {
	public float x;
	public float y;
	
	
	public Vector2 (float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public static Vector2 getNormal(Vector2 vect) {
		float mag = Vector2.getMagnitude(vect);
		return new Vector2(vect.x / mag, vect.y / mag);
	}
	
	public static Vector2 addVectors(Vector2 v1, Vector2 v2) {
		return new Vector2(v1.x + v2.x, v1.y + v2.y);
	}
	
	public static Vector2 multVector(float c, Vector2 vect) {
		return new Vector2(c * vect.x, c * vect.y);
	}
	
	public static Vector2 subtractVectors(Vector2 v1, Vector2 v2) {
		 return Vector2.addVectors(v1, Vector2.multVector(-1f, v2));
	}
	
	public static float getMagnitude(Vector2 vect) {
		float x = vect.x;
		float y = vect.y;
		return (float)Math.sqrt(x * x + y * y);
	}
	
}
