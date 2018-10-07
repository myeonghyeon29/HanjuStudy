package middle;

public class _46_Random {

	public static void main(String[] args) {
		int a,b,c;
		while(true) {
			a=(int)(Math.random()*10+1);
			b=(int)(Math.random()*10+1);
			c=(int)(Math.random()*10+1);
			if(a!=b&&b!=c&&c!=a)
				break;
		}
		System.out.println(a+" "+b+" "+c+" ");
	}

}
