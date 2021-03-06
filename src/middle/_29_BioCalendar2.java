package middle;

public class _29_BioCalendar2 {
	public static final int PHYSICAL = 23;

	public static double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);//static 메서드는 객체없이 호출가능
	}

	public static void main(String[] args) {
		int days = 1200;
		double phyval=getBioRhythm(days,PHYSICAL,100);
		System.out.printf("나의 신체지수 %1$.2f입니다",phyval);
	}
}
