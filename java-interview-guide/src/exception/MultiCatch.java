package exception;

import java.util.Scanner;

public class MultiCatch {
	public static void main(String args[]) { 
		System.out.println("Buddy enter valid number");
        Scanner scn = new Scanner(System.in); 
        try{ 
            int n = Integer.parseInt(scn.nextLine()); 
            if (99%n == 0) 
                System.out.println(n + " is a factor of 99"); 
        } 
        /*catch (ArithmeticException ex) { 
            System.out.println("Arithmetic " + ex); 
        } 
        catch (NumberFormatException ex) { 
            System.out.println("Number Format Exception " + ex); 
        } */
        catch(ArithmeticException | NumberFormatException ex) {
        	System.out.println("Exception encountered");
        	ex.printStackTrace();
        }
        scn.close();
    } 
}
