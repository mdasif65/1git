/*5)Define a method to return the average of digits
156
ans=(1+5+6)/3
 */
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int x=extractNumber(n);
		n=n/10;
		int y=extractNumber(n);
		n=n/10;
		int z=extractNumber(n);
		int l=average(x,y,z);
		System.out.println("average="+l);
	}
	static int average(int a, int b, int c) {
		int avg=(a+b+c)/3;
		return avg;
	}
	static int extractNumber(int x) {
		int r;
		while(x!=0)
		{	
			int sum=0;
			r=x%10;
			sum=sum+r;
			return sum;
		}
		return 0;
	}
}
