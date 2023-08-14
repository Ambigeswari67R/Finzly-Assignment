package dowhileloop;

import java.util.Scanner;

public class nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int oddsum=0,evensum=0;
		do {
			if(a%2!=0) {
				oddsum+=a;
			}
			else {
				evensum+=a;
			}
			a++;
		}while(a<=b);
		System.out.println(oddsum);
		System.out.println(evensum);

	}

}
