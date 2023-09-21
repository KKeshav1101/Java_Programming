class Box{
	double width,height,length;
	Box(double width,double height,double length){
		System.out.println("Box constructor....");
		this.width=width;
		this.height=height;
		this.length=length;
	}
	public String toString(){
		return "length="+length+"\nwidth="+width+"\nheight="+height;
	}

}
class BoxWeight extends Box{
	double weight;
	BoxWeight(double width,double height,double length,double weight){
		super(width,height,length);
		System.out.println("Box weight constructor....");
		this.weight=weight;
	}
	public String toString(){
		return "Weighted Box :"+length+","+width+","+height+","+","+weight;
	}
}

class BoxWeightDemo{
	public static void main(String args[]){
		BoxWeight bw=new BoxWeight(10.0,20.0,30.0,40.0);
		System.out.println("Weighted Box "+bw);	
	}
}