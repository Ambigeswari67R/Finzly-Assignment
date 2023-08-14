package dowhileloop;

import java.util.Scanner;

public class ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i=a;
		do{
			if(i%2==0) {
				System.out.print(i+" ");
				
			}
			i++;
		}while(i<=b);
		System.out.println();
		i=a;
		do{
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			i++;
		}while(i<=b);

	}

}
