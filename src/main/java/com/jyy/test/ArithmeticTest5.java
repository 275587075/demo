package com.jyy.test;

import java.util.Scanner;

public class ArithmeticTest5 {

	/* ��Ŀ�����������������Ƕ������ɴ��⣺
	 * ѧϰ�ɼ�90�����ϣ�����90�֣���ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����£�������60�֣�����C��ʾ��
	 * ���������(a>b)?a:b��������������Ļ������ӡ�*/
	public static void main(String[] args) {
		System.out.println("������N��ֵ��");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println((N>=90)?"A":((N<60)?"C":"B"));
	}
}
