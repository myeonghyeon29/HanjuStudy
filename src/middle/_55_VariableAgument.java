package middle;

public class _55_VariableAgument {
	public static void print(int ...mm) { //�������� �ƱԸ�Ʈ�� ����� �迭ó�� ��밡���ϴ� �������� �޼ҵ带 �����ʿ���� ��δ� ��°����ϴ�.
		for(int n:mm) {
			System.out.print(n+"\t");
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,56,23};
		print(arr);
		int a=0,b=16,c=36;
		print(a);
		print(a,b);
		print(a,b,c);
	}

}
