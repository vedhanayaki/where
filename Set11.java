package hunter;
import java.util.Scanner;
public class Set11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the no.of elements");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the elements");
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					System.out.println(a[i]);
				}}}
		}


	}


