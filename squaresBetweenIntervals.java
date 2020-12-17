import java.io.*;
import java.util.ArrayList; 
/*
This code calculates perfect squares between 0 to specified limit.
n = integer interval
upperlimit = integer upperlimit
Math.sqrt  and Math.ceil returns answers in double format 
hence double is used for the calculation
*/
class squaresBetweenIntervals{
    public static void calcSquares (int n,int upperLimit) {
		int lowerSquare = 0;
		ArrayList<Double> result = new ArrayList<>();
		double upperSquare =Math.ceil(Math.sqrt(upperLimit));
		System.out.print(upperSquare);
		for (double i= n;i<=upperSquare;i +=n)
		{
		    result.add(i*i);
		}
		for (Double x:result)
        	{ 
		    if(x <= upperLimit)
			{System.out.println(x);}
        	}
	}
	public static void main (String[] args) {
		squareAtIntervals obj =new squareAtIntervals();
		obj.calcSquares(3,300);
	}
}