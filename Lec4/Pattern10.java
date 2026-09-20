package Lec4;

import java.util.Scanner;

public class Pattern10 {
	
    public static void main(String[] args) {
    	
    	Scanner scn = new Scanner(System.in);
    	
    	int n = scn.nextInt();
    	
        for (int i = 0; i < n; i++) {
        	
            for (int j = 0; j < i; j++) {
            	
                System.out.print("  "); 
            }
            
            
            int stars = 2 * (n - i) - 1;
            
            for (int j = 0; j < stars; j++) {
            	
                System.out.print("* ");
            }
            
                    System.out.println();
        }
    }
}
