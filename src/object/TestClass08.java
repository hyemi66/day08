package object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestClass08 {
	public String[] inputName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 이름입력 : ");
		String name1 = sc.next();
		System.out.print("두번째 이름입력 : ");
		String name2 = sc.next();
		System.out.print("세번째 이름입력 : ");
		String name3 = sc.next();
		String[] name = {name1, name2, name3};
		return name;
	}
	
	public ArrayList<String> inputName2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 이름입력 : ");
		String name1 = sc.next();
		System.out.print("두번째 이름입력 : ");
		String name2 = sc.next();
		System.out.print("세번째 이름입력 : ");
		String name3 = sc.next();
		ArrayList<String> arr = new ArrayList<>();
		arr.add(name1); arr.add(name2); arr.add(name3);
		return arr;
	}
	
	public HashMap<Integer, String> inputName3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 이름입력 : ");
		String name1 = sc.next();
		System.out.print("두번째 이름입력 : ");
		String name2 = sc.next();
		System.out.print("세번째 이름입력 : ");
		String name3 = sc.next();
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(0, name1); hMap.put(1, name2); hMap.put(2, name3);
		return hMap;
	}
	
	public void syso(String[] name) {
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
	}
	
	public void syso1(ArrayList<String> name) {
		for(int i=0; i<name.size(); i++) {
			System.out.println(name.get(i));
		}
	}
	
	public void syso2(HashMap<Integer, String> name) {
		for(int i=0; i<name.size(); i++) {
			System.out.println(name.get(i));
		}
	}
	
	public int[] inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int n1 = sc.nextInt();
		int[] num = {n1};
		return num;
		
	}
	
	public String oaFunc(int num) {
		String s;
		if(num%2==0) { s = "짝수"; }
		else { s = "홀수"; }
		return s;
	}
	
	public void print(int num, String s) {
		if(s.equals("짝수")) {
			System.out.println(num + " : 짝수");
		} else {
			System.out.println(num + " : 홀수");
		}
	}
	
	public String funC(int num) {
		String s;
		if (num%3==0) { s = "3의배수"; }
		else { s = "3의배수아님"; }
		return s;
	}
	
	public void print2(int num, String s) {
		if(s.equals("3의배수")) {
			System.out.println(num+" : "+s);
		} else {
			System.out.println(num+" : "+s);
		}
	}
	
	public double inputN() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		double dNum = sc.nextDouble();
		return dNum;
	}
	
	public String funfun(double dNum) {
		String s;
		if(dNum%1!=0) { s = "실수"; }
		else { s = "실수아님"; }
		return s;
	}
	
	public void print03(String s, double dNum) {
		if(s.equals("실수")) {
			System.out.println(dNum+" : "+s);
		} else {
			System.out.println(dNum+" : "+s);
		}
	}
	
	public int iN() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public int fC(int num) {
		int n;
		if(num>0) { n=num; }
		else { n=-num; }
		return n;
	}
	
	public void print05(int num, int n) {
		System.out.println(num + "의 절대값 : "+n);
	}
	
}
