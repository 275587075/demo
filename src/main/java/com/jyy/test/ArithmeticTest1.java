package com.jyy.test;

public class ArithmeticTest1 {
	
	/* 第一题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
	 * 小兔子长到第四个月后每个月又生一对兔子，
	 * 假如兔子都不死，问每个月的兔子总数为多少？
	 * 程序分析：兔子的规律为数列1,1,2,3,5,8,13,21....*/
	public static void main(String[] args) {
		//方法一
		for(int i=1;i<=10;i++){
			System.out.println(count(i));
		}
	}
	
	/*
	1 : 1==>1							1
    1 : 2==>1							2
    1+1=2 : 3-1=2==>1   3-2=1==>1		3
	2+1=3 : 4-1=3==>2   4-2=2==>1		4
	3+2=5 : 5-1=4==>3   5-2=3==>2  		5	
	5+3=8 : 6-1=5==>5   6-2=4==>3		6
	8+5=13 : 7-1=6==>8   7-2=5==>5		7
	
	1  1				1
	2  1				1
	3  2				2
	4  3				3
	5  4 1				5
	6  5 1+2			8
	7  6 3+3  1			13
	8  7 6+4  1+3 		21
	9  8 10+5 4+6 1  	34
	11 9 15+6 10+10 1+4 55
	12 
	*/
	public static int count(int c){
		if(c==1||c==2){
			return 1;
		}else{			
			return count(c-1)+count(c-2);
		}
		
	}
	
}
