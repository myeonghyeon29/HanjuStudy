package middle;

public class _45_ShowFor {
	public static void Showfor(int n) {
	int temp=n;
	for(;temp!=1;) //조건문만 채우면 while처럼 사용가능
	{
		if(temp%2==1)
			temp=temp*3+1;
		else
			temp/=2;
	System.out.print("["+temp+"]ZxZX");
	}
}

	public static void main(String[] args) {
		Showfor(122);
	}

}
