package data;

import org.newdawn.slick.opengl.Texture;

public class Tile {
	
	private float x, y, width, height;
	private Texture texture;
	
	public Tile(float x, float y, float width, float height, Texture texture) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
		setTexture(texture);
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}

	
	
}	
