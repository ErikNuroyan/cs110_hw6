import shapes.Square;
import shapes.Rectangle;
import utils.Math;

public class Driver {

	public static void main(String[] args) {
		double Arg=15.6;
		Square Sqr=new Square(100);
		Rectangle Rct=new Rectangle(80,50);
		System.out.println("Area Of The Square: "+Sqr.getArea()+" Area Of The Rectangle: "+Rct.getArea());
        System.out.println("Factorial With Recursion: "+Math.factorial((int)Arg)+" Factorial With Loop: "+Math.factorialLoop((int)Arg));
	}

}
