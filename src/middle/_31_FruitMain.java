package middle;

public class _31_FruitMain {

	public static void main(String[] args) {
	_31_FRUIT pear = _31_FRUIT.APPLE; //enum�� ��� ������ ���ڷ� ��Ÿ���� ���������ʾƵ� �˾Ƽ� ���� �Է����ش�.
	_31_FRUIT pear2 = _31_FRUIT.MANGO; //enum�� �����ؼ� ����
	System.out.println(pear);
	System.out.println(pear.name()); //�������� �̸��� ��ȯ�ϴ� �޼ҵ�
	System.out.println(pear.ordinal()); //�������� ����ִ��� �˷��ִ� �޼ҵ�
	System.out.println(pear2.ordinal());
	_31_FRUIT[] fruits=_31_FRUIT.values(); //���е��� �� ��ȯ�ؼ� �迭�� ����� �żҵ�
	System.out.println(fruits[0]+" "+fruits[1]+" "+fruits[2]);
	_31_FRUIT pear3 = _31_FRUIT.valueOf("APPLE");
	System.out.println(pear3);
	}
}
