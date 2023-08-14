package Training;

import java.util.Scanner;

public class nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int oddsum=0,evensum=0;
		for(int i=a;i<=b;i++) {
			if(i%2!=0) {
				oddsum+=i;
			}
			else {
				evensum+=i;
			}
		}
		System.out.println(oddsum);
		System.out.println(evensum);

	}

}
