package net.kiranatos.snake;

//import com.sun.javafx.scene.traversal.Direction;
import javafx.geometry.Point2D;

public class MovingGameObject extends GameObject {
	private Direction direction;

	public MovingGameObject() {
	}

	public MovingGameObject(double width, double height) {
		super(width, height);
	}

	public MovingGameObject(Point2D position) {
		super(position);
	}

	public MovingGameObject(Point2D position, double width, double height) {
		super(position, width, height);
	}

	public MovingGameObject(Point2D position, double bodySize) {
		super(position, bodySize);
	}

	public MovingGameObject(Point2D position, double bodySize, Direction direction) {
		super(position, bodySize);
		this.direction = direction;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
}