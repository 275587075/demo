package com.jyy.test;

public class ArithmeticTest2 {
	/*�ж�101-200֮���ж��ٸ����������������������
 	���������
 	�ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ����������������������������֮��������*/
	public static void main(String[] args) {
		for(int i=101;i<=200;i++){
			if(prime(i)){
				System.out.println(i);
			}
		}
	}
	
	//������
	public static boolean prime(Integer c){
		for(int i=2;i<c;i++){
			int judge = c%i;
			if(judge==0){return false;}
		}
		return true;
	}
	
}
