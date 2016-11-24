package shapes;

public class Rectangle {

	public Rectangle(int h,int w){
		height=h;
		width=w;
	}
	public int getArea(){
		return height*width;
	}
	private int height,width;
}
