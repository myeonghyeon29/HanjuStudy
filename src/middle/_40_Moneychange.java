
package middle;
import java.util.Scanner;
public class _40_Moneychange {
	public static double tomoney(String ch) {
		double exchange = 1000;
		switch (ch) {
		case "USD":
			exchange *= 1.2;
			break;
		case "JPA":
			exchange *= 1.1;
			break;
		case "CHA":
			exchange *= 0.8;
			break;
		default:
			System.out.println("���³���!!");
			break;
		}
		return exchange;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ch = scanner.next(); //scanner�� ���ڿ��Է¹޴´�
		System.out.printf("%.2f��\n",tomoney(ch));
		scanner.close();
	}
}
