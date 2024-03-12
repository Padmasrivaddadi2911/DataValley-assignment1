import java.io.*;
import java.util.*;

public class Count_occurences
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		int a=sc.nextInt();
		int c=0;
		for(int i=0;i<n;i++){
		    if(ar[i]==a){
		        c+=1;
		    }
		}
		System.out.println(c);
		
	}
}
