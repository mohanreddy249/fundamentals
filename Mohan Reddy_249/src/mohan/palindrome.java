package mohan;

public class palindrome {

	public static void main(String[] args) {
		int r,sum=0,temp;
		int n=1235;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
	    }
       if(temp==sum)
    	   System.out.println("It is not a palindrome");
       else
    	   System.out.println("it's a palindrome");
     }
}
