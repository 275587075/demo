package com.jyy.test;

import java.util.Scanner;

public class ArithmeticTest4 {

	/*��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5�� 
	�����������n���зֽ���������Ӧ���ҵ�һ����С������i��Ȼ������������ɣ� 
	(1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�
	(2)���n > i����n�ܱ�i��������Ӧ��ӡ��i��ֵ������n����i����,��Ϊ�µ���������,�ظ�ִ�е�һ����
	(3)���n���ܱ�i����������i+1��Ϊi��ֵ,�ظ�ִ�е�һ����*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������N��ֵ��");
		int N = in.nextInt();
		System.out.print("�ֽ���������"+ N + "=");
		new ArithmeticTest4().decompose(N);
	}
	
	public void decompose(Integer n){
		for(int i=2;i<=n;i++){
			if(n%i==0){
				System.out.print(i);
				if(n!=i){
					System.out.print("*");
				}
				decompose(n/i);
			}
		}
		System.exit(0);//�˳�����
	}
	
	public ArithmeticTest4(){
		super();
	}
}
