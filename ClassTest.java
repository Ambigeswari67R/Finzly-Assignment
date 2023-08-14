//sum of even and odd numbers
import java.util.Scanner;
public class SumofEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int evensum=0,oddsum=0;
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				evensum+=i;
			}
			else {
				oddsum+=i;
			}
		}
		System.out.println("sum of even numbers "+evensum);
		System.out.println("sum of odd numbers "+oddsum);
				

	}

}
