package middle;

public class _51_BitShiftNum2 {
	public static String changeTwoNum(int num) {
		String a = "";
		int isOne = 1;
		for (int i = 0; i < 30; i++) {
			a = (isOne & num) + a;    //&연산자로 한글자씩 읽기
			num >>= 1;
		}
		return a;
	}

	public static void main(String[] args) {
		int num1= 9;
		int num2=-9;
		System.out.printf("%s\n",changeTwoNum(num1));
		System.out.printf("%s",changeTwoNum(num2));

	}

}
