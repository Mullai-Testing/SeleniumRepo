package week1.day3.homeactivity;

public class FindIntersection {

	public void compareGivenArrays() {
		 int a[]={3,2,11,4,6,7}; 
         int b[]={1,2,8,4,9,7}; 
         for (int i=0; i<a.length; i++) {
        	 for (int j=0; j<b.length; j++) {
        		 if(a[i]==b[j]) {
        			 System.out.println("the matched data in array: " + a[i]);
        		 }
        	 }
         }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindIntersection objCompare = new FindIntersection();
		objCompare.compareGivenArrays();
	}

}
