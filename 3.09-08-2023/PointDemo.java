//POINT CLASS TO FIND DISTANCE AND MIDPOINT//
//--------------------------------------------//
import java.lang.Math;
class Point{
	double x,y;
	Point(double x,double y){
		this.x=x;
		this.y=y;
	}
	void distance(double x,double y){
		System.out.println("Distance="+Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y)));
	}
	void distance(Point p){
		System.out.println("Distance="+Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)));
	}
	Point midpoint(Point p2){
		return new Point(((this.x+p2.x)/2),((this.y+p2.y)/2));
	}
	public String toString(){
		return "\nx="+x+"\ny="+y;
	}		
}

class PointDemo{
	public static void main(String args[]){
		Point p1=new Point(11,7);
		Point p2=new Point(7,11);
		System.out.println("Point 1:"+p1+"\nPoint 2:"+p2);
		p1.distance(0,0); 			//to calculate distance of point 1 from origin
		p2.distance(0,0);			//to calculate distance of point 2 from origin
		p1.distance(p2);			//to calculate distance between point 1 and point 2cd
		p2.distance(p1);
		System.out.println("Mid Point is "+p1.midpoint(p2));
	}
}