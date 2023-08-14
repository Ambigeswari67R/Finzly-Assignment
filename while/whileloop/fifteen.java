//15) Write a Program To print count of odd No 1 to 25 no.   
package whileloop;

public class fifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,count=0;
		while(i<=25) {
			if(i%2!=0) {
				count++;
			}
			
			i++;
		}
		System.out.println(count);

	}

}
