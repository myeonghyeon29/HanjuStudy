package middle;

public class _50_BitShiftNum {
	public static String changeTwo(int num) {
		String s="";
		for(int i=0;i<30;i++) {
			int aa=num%2;
			s=(aa>=0)?aa+s:(-aa)+s; //bit�������� �ű�°����� �����ؾ��Ѵ� ���������� �����ϸ� �ȵȴ�.
			num>>=1;
	}
		return s;
	}
	public static void main(String[] args) {
		int num1=9;
		int num2=-9;
		System.out.printf("%s\n",changeTwo(num1));
		System.out.printf("%s",changeTwo(num2));
		}
	}

