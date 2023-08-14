package forloopseries;

public class eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1,result=0;
		System.out.print(first+" "+second+" ");
		for(int i=2;i<10;i++) {
			result=first+second;
			
			System.out.print(result+" ");
			first=second;
			second=result;
			
			
		}

	}

}
