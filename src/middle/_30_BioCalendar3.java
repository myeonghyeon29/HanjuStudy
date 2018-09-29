package middle;

public class _30_BioCalendar3 {

	public static final int PHYSICAL = 23;

	public double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}

	public static void main(String[] args) {
		int days = 1200;
		_30_BioCalendar3 bio = new _30_BioCalendar3(); // static �ț��� ������ ��ü ����
        double phyval=bio.getBioRhythm(days,PHYSICAL,100); //bio���� �����ؼ� �޼ҵ� ����
        System.out.printf("���� ��ü������ %1$.2f�Դϴ�",phyval);
	}

}
