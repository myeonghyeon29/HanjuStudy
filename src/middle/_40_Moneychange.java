
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
			System.out.println("없는나라!!");
			break;
		}
		return exchange;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ch = scanner.next(); //scanner로 문자열입력받는다
		System.out.printf("%.2f원\n",tomoney(ch));
		scanner.close();
	}
}
