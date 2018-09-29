package middle;

public class _39_Switchcard {

	public static int cardchar(char ch)
	{
		int result = 0;
		switch(ch)
		{
		case 'J':
			result=29;
		}
		return result;
	}
	public static void main(String[] args) {
		char card='J';
		int result=cardchar(card);
		System.out.printf("%c,%d\n",card,result);
	}

}
