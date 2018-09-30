package middle;

public class _43_ShowWhile {
	public static void Showwhile(int n) {
		int temp=n;
		while(temp!=1) {
			if(temp%2==1)
				temp=temp*3+1;
			else
				temp/=2;
		System.out.print("["+temp+"]");
		}
	}

	public static void main(String[] args) {
		Showwhile(122);
	}

}
