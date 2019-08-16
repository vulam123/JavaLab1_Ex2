import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input size of arr: ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("arr["+i+"]: ");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Min :"+arr[0]);
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				sum += arr[i];
			}
		}
		System.out.println("Sum of numbers which % 3 == 0 is: "+sum);
	}
}
