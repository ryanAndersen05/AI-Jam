package Util;

public class Vector3 {
	public float x;
	public float y;
	public float z;
	
	public Vector3 (float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getZ() {
		return z;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public void setZ(float z) {
		this.z = z;
	}
	
	public static Vector3 getNormal(Vector3 vect) {
		float mag = Vector3.getMagnitude(vect);
		return  new Vector3(vect.x / mag, vect.y / mag, vect.z / mag);
	}
	
	/**
	 * Adds two vectors together
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static Vector3 addVectors(Vector3 v1, Vector3 v2) {
		return new Vector3(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
	}
	
	/**
	 * Subtract Vector v2 from v1. v3 = v1 - v2;
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static Vector3 subtractVectors(Vector3 v1, Vector3 v2) {
		return Vector3.addVectors(v1, multVector(-1f, v2));
	}
	
	/**
	 * Multiplies a vector by some constant float c;
	 * @param c
	 * @param vect
	 * @return
	 */
	public static Vector3 multVector(float c, Vector3 vect) {
		return new Vector3(vect.x * c, vect.y * c, vect.z * c);
	}
	
	public static float getMagnitude(Vector3 vect) {
		float x = vect.x;
		float y = vect.y;
		float z = vect.z;
		
		return (float) Math.sqrt(x * x + y * y + z * z);
	}

}
