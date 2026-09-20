package Lec2;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int nst = 5;
     int n = 5;
     for (int row = 0; row < n; row++) {
    	 for (int cst = 0; cst < nst; cst++) {
    		 System.out.print("* ");
    	 }
    	 System.out.println();
    	 nst--;
    	 
     }
	}

}
