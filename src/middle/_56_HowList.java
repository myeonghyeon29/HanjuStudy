package middle;

import java.util.List;
import java.util.ArrayList;

public class _56_HowList {

	public static void main(String[] args) { //List는 배열과 비슷한 역활이지만 크기를 할당받으면서 값을 저장할수있다.
		List<Integer> ilist = new ArrayList<>();
		for(int i=0; i<10; i++) {
			ilist.add(i);
		}
		for(int i=0;i<ilist.size();i++)
		{
			int m=ilist.get(i);
			System.out.print(m+"\t");
		}
	}

}
