
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  
	    Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	int  count=0;
	   int o=0;
	   int e=0;
	    while(n!=0)
	    {
	        int rem=n%10;
	        if(rem%2==0)
	        e+=rem;
	      else
	        o+=rem;
	        n=n/10;
	    }
	       System.out.println("sum of even"+e);
	       System.out.println("sum of odd"+o);
	    }
	  

}
