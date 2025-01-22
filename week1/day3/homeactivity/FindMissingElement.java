package week1.day3.homeactivity;

import java.util.Arrays;

public class FindMissingElement {

	
	//(Type main, ctrl+space & Enter). 
	
	public void findMissingNumber(int[] givenData) {
	
		
		Arrays.sort(givenData);
		//0,1,2,3,4,5,6
		//1,2,3,4,6,7,8 =>7
		
		for(int i=0; i<givenData.length; i++) {
			if(givenData[i]!=i+1) {
				int a=i+1;
				System.out.println("The Missing Number : "+ a);
				break;
			}
		}

	}
	
	
	public static void main(String[] args) {
		FindMissingElement missingNumber = new FindMissingElement();
		
		int givenData[] = {1, 4,3,2,8, 6, 7};
		missingNumber.findMissingNumber(givenData);
	}
}