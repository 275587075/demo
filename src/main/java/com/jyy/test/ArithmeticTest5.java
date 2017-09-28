package com.jyy.test;

import java.util.Scanner;

public class ArithmeticTest5 {

	/* 题目：利用条件运算符的嵌套来完成此题：
	 * 学习成绩90分以上（包括90分）的同学用A表示，60-89分之间的用B表示，60分以下（不包括60分）的用C表示。
	 * 程序分析：(a>b)?a:b这是条件运算符的基本例子。*/
	public static void main(String[] args) {
		System.out.println("请输入N的值：");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println((N>=90)?"A":((N<60)?"C":"B"));
	}
}
