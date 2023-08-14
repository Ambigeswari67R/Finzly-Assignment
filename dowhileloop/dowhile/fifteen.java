package dowhileloop;

public class fifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,count=0;
		do {
			if(i%2!=0) {
				count+=1;
			
			}
			i++;
			
		}
		while(i<=25);
		System.out.println(count);

	}

}
