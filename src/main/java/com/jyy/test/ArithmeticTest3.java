package com.jyy.test;

public class ArithmeticTest3 {
	/* ��ӡ�����е� ˮ�ɻ��� ����ν ˮ�ɻ��� ��ָһ����λ�������λ���������͵��ڸ�������
	 * ���磺153��һ�� ˮ�ɻ��� ����Ϊ153=1�����η���5�����η���3�����η���
	 * �������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��*/
	public static void main(String[] args) {
		for(int i=100;i<=999;i++){
			if(daffodil(i)){
				System.out.println(i);
			}
		}
	}
	
	public static boolean daffodil(Integer c){
		//��ȡ��λ���ϵ���
		Integer bw = c/100;
		
		//��ȡʮλ���ϵ���
		Integer sw = c%100/10;
		
		//��ȡ��λ���ϵ���
		Integer gw = c%10;
		
		//     �ж��Ƿ�Ϊˮ�ɻ���  ���ؽ������ boolean
		return ( 
				(int)Math.pow(bw , 3) + 
				(int)Math.pow(sw , 3) + 
				(int)Math.pow(gw , 3) 
			   ) == c;
	}
	
}
