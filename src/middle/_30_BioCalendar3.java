package middle;

public class _30_BioCalendar3 {

	public static final int PHYSICAL = 23;

	public double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}

	public static void main(String[] args) {
		int days = 1200;
		_30_BioCalendar3 bio = new _30_BioCalendar3(); // static 안썻기 때문에 갹체 선언
        double phyval=bio.getBioRhythm(days,PHYSICAL,100); //bio에서 참조해서 메소드 선언
        System.out.printf("나의 신체지수는 %1$.2f입니다",phyval);
	}

}
