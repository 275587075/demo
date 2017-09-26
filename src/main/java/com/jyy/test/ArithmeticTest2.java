package com.jyy.test;

public class ArithmeticTest2 {
	/*判断101-200之间有多少个素数，并输出所有素数。
 	程序分析：
 	判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。*/
	public static void main(String[] args) {
		for(int i=101;i<=200;i++){
			if(prime(i)){
				System.out.println(i);
			}
		}
	}
	
	//方法体
	public static boolean prime(Integer c){
		for(int i=2;i<c;i++){
			int judge = c%i;
			if(judge==0){return false;}
		}
		return true;
	}
	
}
