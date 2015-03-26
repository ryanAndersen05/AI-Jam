package Util;

import javafx.scene.image.Image;
import Model.Game;

public class AnimationList {
	private Node head;
	private Node tail;
	private Node current;

	private int size;
	
	
	
	private int frameStep; //This is the frames per second that this particular animation will run at
	private int frameStepCounter;

	public AnimationList(int frameStep) {
		this.frameStep = Game.FRAME_RATE / frameStep;
		this.frameStepCounter = 0;
	}
	
	public AnimationList() {
		this(12);
	}

	
	public Image getImage() {
		frameStepCounter++;
		if (frameStepCounter > frameStep) {
			this.current = this.current.getNext();
		}
		if (current == null) {
			return null;
		}
		if (current.getData() == null) {
			return null;
		}
		return this.current.getData();
		
		
	}
	
	/**
	 * Returns the size of the AnimationList
	 * @return
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Add a new frame to the animation list
	 * @param im The image that is to be added to the AnimationList
	 */
	public void addImage(Image im) {
		if (im.isError()) {
			return;
		}
		Node newNode = new Node(im);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			current = newNode;
		}

		else{
			tail.setNext(newNode);
			tail = newNode;
		}
		tail.setNext(head);

		size++;
	}
	
	
	/**
	 * Checks to see if the AnimationList is empty
	 * @return
	 */
	public boolean isEmpty() {
		return head == null;
	}

	
	
	private class Node {
		private Image data;
		private Node next;
		private Node prev;
		
		public Node(Image data) {
			this.data = data;
			
		}

		public Node getNext() {
			return next;
		}		

		public Node getPrev() {
			return prev;
		}

		public Image getData() {
			return data;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public void setData(Image data) {
			this.data = data;
		}
	}

}
