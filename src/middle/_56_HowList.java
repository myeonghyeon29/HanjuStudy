package middle;

import java.util.List;
import java.util.ArrayList;

public class _56_HowList {

	public static void main(String[] args) { //List�� �迭�� ����� ��Ȱ������ ũ�⸦ �Ҵ�����鼭 ���� �����Ҽ��ִ�.
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
