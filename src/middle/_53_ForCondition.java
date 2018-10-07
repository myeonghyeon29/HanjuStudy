package middle;

public class _53_ForCondition {

	public static void main(String[] args) {
		int total=0;
		for(int i=1;i<=100;i++) {
			total+=i;
		}
		System.out.println(total);
		total=0;
		for(int i=1;i<=100;i+=2) {
			total+=i;
		}
		System.out.println(total);
	}

}
