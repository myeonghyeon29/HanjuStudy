package middle;

public class _28_BIoCalendar {
	public static final int PHYSICAL = 23;

	public static void main(String[] args) {
		int index = PHYSICAL;
		int days=1200;
		double phyval=100*Math.sin((days%index)*2*Math.PI/index);
		System.out.printf("나의 신체지수 %1$.2f입니다\n",phyval); //$앞에 숫자는 인자번호 f앞의 숫자는 소숫점 몇자리까지 표햔할지
		System.out.println(phyval);  // dsadsad
	}
}
