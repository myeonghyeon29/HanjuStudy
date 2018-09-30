package middle;

public class _36_BioSwitch {

	public static String textInfor(int index, double value)
	{
		String result="";
		switch(index)
		{
		case 23:
			result = "신체지수";
		}
		return result+"\t"+(value*100);
	}
	public static void main(String[] args) {
		int index=23;
		double value=0.97;
		
		String st=textInfor(index,value); 
		System.out.println(st);
	}

}
