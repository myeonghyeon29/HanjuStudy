package middle;

public class _61_UseStringCharTwoNum {
	public static final int isP=1;
	public  String changeNum(int num) {
		char val[]=new char[32];
		for(int i=31;i>=0;i--) {
			if((num&isP)==1)
				val[i]='1';
			else
				val[i]='0';
			num>>>=1;
		}
		return new String(val);
	}
	public static void main(String[] args) {
		int num1=9;
		int num2=-9;
		_61_UseStringCharTwoNum a=new _61_UseStringCharTwoNum();
		String val1=a.changeNum(num1);
		String val2=a.changeNum(num2);
		System.out.printf("%s\n",val1);
		System.out.printf("%s",val2);
	}

}
