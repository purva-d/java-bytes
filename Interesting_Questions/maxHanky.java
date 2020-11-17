/*
Given Length and Breadth of the cloth. Find maximum number of 
square hankerchiefs can be made from it
*/
import java.util.Scanner;
public class maxHanky{

public static int getMaxSize(int num1,int num2){
	int temp;   
	while(num2 != 0)  
	{  
		temp = num2;  
		num2 = num1 % num2;  
		num1 = temp;  
	} 
	return num1;
}
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int T = Integer.parseInt(scan.nextLine().trim());
	for(int i=0; i< T;i++)
		{
		String[] string_arr = scan.nextLine().split(" ");
            	int maxHankerchiefs = maxHanky.getMaxSize(
						Integer.parseInt(string_arr[0]),
						Integer.parseInt(string_arr[1])
					);
		System.out.println(maxHankerchiefs);
            	}
}
}
	
