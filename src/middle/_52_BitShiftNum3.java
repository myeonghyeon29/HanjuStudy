package middle;

public class _52_BitShiftNum3 {
	public static String changeTwoNum(int num) {
		String a = "";
		int isOne = 1;
		for (int i = 0; i < 30; i++) {
			a = (isOne & num) + a;    //&�����ڷ� �ѱ��ھ� �б�
			num >>= 1;
		}
		return a.substring(a.indexOf('1'));  //indexOf �� �־������� ������ ��ġ�� ��ȯ�Ѵ�. substring�� �־��� ���� ������ ���ڸ� �����.
	}
		

	public static void main(String[] args) {
		int num1=9;
		int num2=-9;
		System.out.printf("%s\n", changeTwoNum(num1));
		System.out.printf("%s",changeTwoNum(num2));
	}
}
