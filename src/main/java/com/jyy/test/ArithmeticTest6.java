package com.jyy.test;

import java.util.Scanner;

public class ArithmeticTest6 {

	/* ��Ŀ����������������m��n���������Լ������С��������
	 * �������������շ������*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������������m��");
		int m = in.nextInt();
		System.out.println("������������n��");
		int n = in.nextInt();
		int a = maxCommonMeasure(m,n);
		System.out.println("���Լ��Ϊ��" + a);
		System.out.println("��С������Ϊ��" + (m*n)/a);
	}
	
	//�����Լ��
	public static int maxCommonMeasure(int m,int n){
		int a = 1;
		for(int i=2;i<=m;i++){
			if(m%i==0&&n%i==0){
				if(a<i){ a=i; }
			}
		}
		return a;
	}
}
