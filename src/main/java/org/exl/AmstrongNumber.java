package org.exl;

public class AmstrongNumber {

	public static void main(String[] args) {
		int n=153;
		int i=0,j=0;
		int a;
		a=n;
				while(a>0) {
					i=a%10;
					j=j+(i*i*i);
					a=a/10;
				}
		System.out.println(j);

	}

}
