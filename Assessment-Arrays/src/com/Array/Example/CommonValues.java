package com.Array.Example;

public class CommonValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6};
		int[] b= {0,9,8,7,6,5};
		commomValue(a,b);

	}
	static void commomValue(int[] c, int[] d) {
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<d.length;j++) {
				if(c[i]==d[j]) {
					System.out.println(d[j]+" ");
				}
			}
		}
	}

}
