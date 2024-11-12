package com.nit.sum;

public class DuplicateRemove {

	public static void removeElement(int temp[]) {
		
		//int temp[] = {1,2,3,1,5,2,1,2};
		for(int i=0; i<temp.length-1; i++) {
			int count = 0;
			if(temp[i] == -1) continue;
			for(int j=i; j<temp.length; j++) {
				if(temp[i] == temp[j]) {
					count++;
					temp[j] = -1;
				}
			}
			System.out.println("Number: " + temp[i] +  "  "+count + " times");
		}
		
		
	}
}
