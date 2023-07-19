package org.exl;

public class Assendingorder {

	public static void main(String[] args) {
		int a[]= {30,67,12,65,43};
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;i++) {
			int temp;
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[i]=temp;
			}
			}
		}
		for(int i:a) {
			System.out.println(i);
		}
	}

}
