package middle;

public class _55_VariableAgument {
	public static void print(int ...mm) { //가변인자 아규먼트가 몇개여도 배열처럼 사용가능하다 여러개의 메소드를 만들필요업이 모두다 출력가능하다.
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
