package middle;

public class _31_FruitMain {

	public static void main(String[] args) {
	_31_FRUIT pear = _31_FRUIT.APPLE; //enum은 어떠한 변수를 문자로 나타낼때 지정하지않아도 알아서 값을 입력해준다.
	_31_FRUIT pear2 = _31_FRUIT.MANGO; //enum을 참조해서 선언
	System.out.println(pear);
	System.out.println(pear.name()); //열거형의 이름을 반환하는 메소드
	System.out.println(pear.ordinal()); //열겨형이 어디있는지 알려주는 메소드
	System.out.println(pear2.ordinal());
	_31_FRUIT[] fruits=_31_FRUIT.values(); //성분들을 몯 반환해서 배열로 만드는 매소드
	System.out.println(fruits[0]+" "+fruits[1]+" "+fruits[2]);
	_31_FRUIT pear3 = _31_FRUIT.valueOf("APPLE");
	System.out.println(pear3);
	}
}
