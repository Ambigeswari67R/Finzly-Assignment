package Training;
import java.util.Scanner;
public class checkvowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		str=str.toLowerCase();
		int count=0,j=0;
		char[] arr=str.toCharArray();
		int l=arr.length;
		int[] temp=new int[l];
		if(l>1) {
			for(int i=0;i<l-1;i++) {
				if(arr[i]!=arr[i+1]) {
					temp[j++]=arr[i];
				}
			}
		}
		temp[j++]=arr[l-1];
		for(int i=0;i<temp.length;i++) {
			if(temp[i]=='a' || temp[i]=='e'|| temp[i]=='i'|| temp[i]=='o'|| temp[i]=='u') {
				count++;
			}
		}
		if(count>=5) {
			System.out.print("all the vowels are present in "+str);
		}
		else {
			System.out.print("not all the vowels are present in "+str);
		}
	}
}
