package whileloopseries;

public class eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1,third=0,i=2;
		System.out.print(first+" "+second+" ");
		while(i<=10) {
			third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
			i++;
			
		}

	}

}
