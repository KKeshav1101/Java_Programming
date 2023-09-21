class Box{
	double length,width,height;
	void setBox(double length,double width,double height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	void getBox(){
		System.out.println("Length ="+length+"\tWidth="+width+"\tHeight="+height);
	}
}
class BoxDemo{
 	public static void main(String args[]){
		Box mybox=new Box();
		mybox.setBox(10.0,11.11,56.7);
		mybox.getBox();
	}
}