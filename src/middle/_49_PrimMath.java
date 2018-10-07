package middle;

import java.util.Scanner;
public class _49_PrimMath {
	public static boolean isPrime(int n) {
		boolean isP=true;
		for(int i=2;i<(int)Math.sqrt(n);i++) { //소수룰 구하는 가장빠른방법은 제곱근을 구한후 2~재곱근까지 나눠지는가를 확인하면 된다.
			if(n%i==0) {
				isP=false;
				break;
			}
		}
		return isP;
	}

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		if(isPrime(n))
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다");
		scanner.close();
	}

}
