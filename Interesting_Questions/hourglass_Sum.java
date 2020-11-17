import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hourglass_Sum{

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int arrayLength_o = arr.length;
        int[][] result = new int[arrayLength_o - 2][arrayLength_o - 2];
        int i =0; int j=0; int sum,maxSum=0;
        for (i=1;i<arrayLength_o-1;i++){
            for (j=1;j<arrayLength_o-1;j++){
                sum = arr[i][j] + arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] +
                arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1]
                result[i-1][j-1] = sum;                
                if(sum > maxSum){
                    maxSum = sum                   
                }
            }              
        }
        return (maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
