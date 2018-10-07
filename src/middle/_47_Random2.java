package middle;

public class _47_Random2 {

	public static void main(String[] args) {
		int a=0,b=0,c=0;
		while(a==b||b==c||c==a)
		{
			a=(int)(Math.random()*10+1);
			b=(int)(Math.random()*10+1);
			c=(int)(Math.random()*10+1);
		}
		System.out.println(a+" "+b+" "+c+" ");
	}

}
