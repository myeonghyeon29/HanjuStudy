package middle;

import java.util.List;
import java.util.ArrayList;

public class _58_ForIfOddSum {

	public static void main(String[] args) {
		int sum=0;
		List<Integer> ilist=new ArrayList<>();    //List 선언
		for(int i=1;i<=10;i++) {
			ilist.add(i);
		}
		for(int m:ilist) {    //List도 향상된 for문 사용가능
			if(m%2==1)
				sum+=m*m;
		}
		System.out.println(sum);
	}

}
