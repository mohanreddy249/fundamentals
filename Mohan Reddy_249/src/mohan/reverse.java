package mohan;

public class reverse {

	public static void main(String[] args) {
		 int r=0,n=1234;
		 while(n!=0)
		 {
			int d=n%10;
			r=(r*10)+d;
			n=n/10;
		 }
		 
           System.out.println("Reversed number is:"+r);
	}

}
