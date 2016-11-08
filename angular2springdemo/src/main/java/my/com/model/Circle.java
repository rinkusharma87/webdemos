package my.com.model;

import org.springframework.beans.factory.annotation.Autowired;


public class Circle implements Shape{

	Point pointA;


	public Point getPointA() {
		return pointA;
	}
	
	@Autowired
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public void draw() {
		System.out.println(" Point A (x ="+getPointA().getX()+",y ="+getPointA().getY()+")");
		
	}
	
}
