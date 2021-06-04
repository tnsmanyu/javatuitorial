package com.manyu;

public class Operators {

	public static void main(String[] args) {
		
		int i = 10;
		
		System.out.println(i++);
		
		
		System.out.println(i);
		
		int j = 11;
		
		System.out.println(--j);
		
		
		int a = 10 + 12;
		
		System.out.println(a);
		
		a = (10+12) * (10+12);
		
		System.out.println(a);
		
		a = 10*10 + 12*12 + (2*10*12);
		
		System.out.println(a);
		
		//BODMAS
		
		i = 1005;
		
		i = i << 1;
		
		System.out.println(i);
		
//		Organization -> client, partner, service provider
		
//		org instanceof client
		
//		if(org instanceof partner) {
			
		String abc = "abc";
		
		if(abc instanceof String) {
			System.out.println(true);
		}
		
		if(13 <= 12 ) {
			System.out.println(true);
		}else 
			System.out.println(false);
		
		
		String xyz = "xyz";
		
		if(xyz == abc) {
			System.out.println(true);
		}
		
		int k = 5;
		
		int l = 6;
		
		l = k ^ l;
		
		System.out.println(l);
		
		
		boolean bool = true;
		
		boolean bool1 = false;
		
		if(bool || bool1) {
			System.out.println(bool && bool1);
		}
		
		
		String abcd = (k>l || 12 < 14)?"abc":"pqr";
		
		System.out.println(abcd);
		
		
		int pqr = 10;
		
		pqr = pqr + 10;
		
		pqr += 10;
		
		pqr -= 10;
		
		
		pqr %= 10;
		
		
	}
	
	

}


