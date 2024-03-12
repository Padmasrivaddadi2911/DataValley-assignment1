import java.io.*;
import java.util.*;

public class MathOperations{
    
    public int addition(int a,int b){
        return a+b;
    }
    
    public double addition(double a,double b,double c){
        return a+b+c;
    }
    
    public String addition(String a,String b){
        return a+b;
    }

	public static void main(String[] args) {
	    
	  MathOperations obj1=new MathOperations();
	  
	  int s1=obj1.addition(1,3);
	  double s2=obj1.addition(1.0,2.0,3.0);
	  String s3=obj1.addition("Data","Valley");
	  
	  System.out.println(s1);
	  System.out.println(s2);
	  System.out.println(s3);
	 
}
}
