package middle;
import java.util.Scanner;
public class _48_Contraction {
	public static int numEach(int n) {
		int total =0;
		while (n!=0) {
			total+=(n%10);
			n/=10;
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int tot=numEach(n);
		System.out.println(tot);
		scanner.close();
	}

}
