package shapes;

public class Square {

	public Square(int l){
		length=l;
	}
	
	public int getArea(){
		return length*length;
	}
	
	private int length;
}
