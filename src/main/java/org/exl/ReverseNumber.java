package org.exl;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=123;
		int i=0,j=0;
		int a;
		a=n;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println(j);
		if(j==n) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
