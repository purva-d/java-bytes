import java.lang.Math;
import java.util.Scanner;
public class FIBEASY{
public static int calcAns(int num){
	int[] D = getFibonacci(num);
	double pos= Math.log(D.length)/Math.log(2);
	int position = (int) Math.floor(pos);
	return (D[position]);
	
}

public static int[] getFibonacci(int num){
	int fib[] = new int[num+1]; 
    	fib[0] = 0; 
    	fib[1] = 1; 
    	for (int i = 2; i <= num; i++) 
          {fib[i] = fib[i-1] + fib[i-2]; }
    	return fib; 

}
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int T = Integer.parseInt(scan.nextLine().trim());
	for(int i=0; i< T;i++)
		{
		String string_num = scan.nextLine().trim();
            	int Val = FIBEASY.calcAns(Integer.parseInt(string_num));
		System.out.println(Val);
            	}
}
}