//5) Write a Program To print sum of 1 to 50 Odd nos.
package whileloop;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum=0;
		while(i<=50) {
			if(i%2!=0) {
			sum+=i;
			}
			i++;
		}
		System.out.print(sum);


	}

}
