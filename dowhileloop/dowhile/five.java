package dowhileloop;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,count=0;
		do {
			if(i%2!=0) {
			count+=i;
			}
			i++;
			
		}
		while(i<=50);
		System.out.println(count);

	}

}
