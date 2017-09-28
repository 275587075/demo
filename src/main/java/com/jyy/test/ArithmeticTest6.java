package com.jyy.test;

import java.util.Scanner;

public class ArithmeticTest6 {

	/* 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
	 * 程序分析：利用辗除法。*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入正整数m：");
		int m = in.nextInt();
		System.out.println("请输入正整数n：");
		int n = in.nextInt();
		int a = maxCommonMeasure(m,n);
		System.out.println("最大公约数为：" + a);
		System.out.println("最小公倍数为：" + (m*n)/a);
	}
	
	//求最大公约数
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
