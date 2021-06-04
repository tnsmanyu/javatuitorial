package com.manyu.loops;

public class IterationLoops {

	public static void main(String[] args) {

		//for loop - simple for loop, for each loop
		
		for(int i=0, k = 0; i< 5 && k <11; ++i, k++) {
//			System.out.println("printMe");
		}
		
		int j = 10;
		for( ;j>0;)
		{
//			System.out.println("printMe");
			 j -=1;
		}
		
		
		// very important to check for null
		String[] abc = null;
		
		if(abc!=null && abc.length>0) {
			for (String str : abc) {
				System.out.println(str);
			}
		}
		
		
		// while always plan an exit conditions
		int i = 5;
		while(i>0) {
			
			
//			data = conect.execut(ssql);
			i -=1;
//			
//			if(data!=null) break;
		}
		
		
		//execute atleast once
		
		
		 String[] empNames = null;
		do {
			empNames = Service.getDate();
			
			
		}while(empNames!=null);
		
		
	}

}
