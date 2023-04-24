package object;

public class TestClass07 {
	// private : 정보 은닉
	private void test() {}
	
	public void test1(int num) {
		if(num==1) {
			System.out.println(111);
			return;
		}
		System.out.println("다음문장실행");
	}
	
	public int test2(int n) {
		if(n==1) {
			System.out.println("test2 111");
			return 100;
		} else if(n==1) {
			System.out.println("test2 222");
			return 200;
		} else { 
			System.out.println("다음문장실행");
			return 0;
		}
	}
	
	public boolean test3() {
		return true;
	}
	
	public int test4() {
		int num=1;
		if(num==1) { return num; }
		return 0;
	}
	
	public String test5() {
		String s = "aa";
		if(s.equals("aa")) { return s; }
		return null;
	}
}
