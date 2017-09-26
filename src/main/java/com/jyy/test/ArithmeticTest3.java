package com.jyy.test;

public class ArithmeticTest3 {
	/* 打印出所有的 水仙花数 ，所谓 水仙花数 是指一个三位数，其各位数字立方和等于该数本身。
	 * 例如：153是一个 水仙花数 ，因为153=1的三次方＋5的三次方＋3的三次方。
	 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。*/
	public static void main(String[] args) {
		for(int i=100;i<=999;i++){
			if(daffodil(i)){
				System.out.println(i);
			}
		}
	}
	
	public static boolean daffodil(Integer c){
		//获取百位数上的数
		Integer bw = c/100;
		
		//获取十位数上的数
		Integer sw = c%100/10;
		
		//获取个位数上的数
		Integer gw = c%10;
		
		//     判断是否为水仙花数  返回结果类型 boolean
		return ( 
				(int)Math.pow(bw , 3) + 
				(int)Math.pow(sw , 3) + 
				(int)Math.pow(gw , 3) 
			   ) == c;
	}
	
}
