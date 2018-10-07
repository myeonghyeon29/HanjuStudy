package middle;

import java.util.Scanner;
public class _49_PrimMath {
	public static boolean isPrime(int n) {
		boolean isP=true;
		for(int i=2;i<(int)Math.sqrt(n);i++) { //�Ҽ��� ���ϴ� ������������ �������� ������ 2~����ٱ��� �������°��� Ȯ���ϸ� �ȴ�.
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
			System.out.println("�Ҽ��Դϴ�.");
		else
			System.out.println("�Ҽ��� �ƴմϴ�");
		scanner.close();
	}

}
