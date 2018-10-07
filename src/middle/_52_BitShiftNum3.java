package middle;

public class _52_BitShiftNum3 {
	public static String changeTwoNum(int num) {
		String a = "";
		int isOne = 1;
		for (int i = 0; i < 30; i++) {
			a = (isOne & num) + a;    //&연산자로 한글자씩 읽기
			num >>= 1;
		}
		return a.substring(a.indexOf('1'));  //indexOf 는 주어진값이 나오는 위치를 반환한다. substring은 주어진 숫자 전까지 문자를 지운다.
	}
		

	public static void main(String[] args) {
		int num1=9;
		int num2=-9;
		System.out.printf("%s\n", changeTwoNum(num1));
		System.out.printf("%s",changeTwoNum(num2));
	}
}
