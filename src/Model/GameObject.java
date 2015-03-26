package Model;

import Util.Vector2;

public abstract class GameObject {
	private String tag;
	private int layer;
	private Vector2 localPosition;
	private Vector2 velocity;
	private float rotation;
	private Vector2 scale;
	
	/**
	 * This method will be called once every frame
	 */
	public void update() {
		
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	/**
	 * Returns the tag that is associated with this game object
	 * @return
	 */
	public String getTag() {
		return tag;
	}
	
	/**
	 * This method will be called once per frame before calculating physics updates
	 */
	public void fixedUpdate() {
		
	}
	
	/**
	 * Sets the layer for the gameobject. This is used for drawing purposes.
	 * @param layer
	 */
	public void setLayer(int layer) {
		this.layer = layer;
	}
	
	
	/**
	 * Returns the layer of the gameobject. This is primarily used for drawing purposes.
	 * @return
	 */
	public int getLayer() {
		return layer;
	}
	
	
	public Vector2 getVelocity() {
		return velocity;
	}
	
	public Vector2 getLocalPosition() {
		return localPosition;
	}
	
	public Vector2 getScale() {
		return scale;
	}
	
	public float getRotation() {
		return rotation;
	}
	
	public void setVelocity(Vector2 velocity) {
		this.velocity.x = velocity.x;
		this.velocity.y = velocity.y;
	}
	
	public void setRotation(float rotation) {
		this.rotation = rotation;
	}
	
	public void setLocalPosition(Vector2 localPosition) {
		this.localPosition.x = localPosition.x;
		this.localPosition.y = localPosition.y;
	}
	
	public void setScale(Vector2 scale) {
		this.scale.x = scale.x;
		this.scale.y = scale.y;
		
	}
	
	public GameObject(Vector2 localPosition, float rotation, Vector2 scale) {
		this.localPosition = localPosition;
		this.rotation = rotation;
		this.scale = scale;
		
		this.velocity = new Vector2(0f, 0f);
		
		this.tag = "Default";
		this.layer = 0;
	}

}
