
public class Egg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long s=0,n=1;
		System.out.println(n);
		for(int i=2;i<=38;i++) {
			
			s=(int) Math.pow(n,i);
			n+=s;
			System.out.println(n);
			
		}
		//System.out.println(n);

	}

}
