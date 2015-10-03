/*
 * Frederick Small
 * CISC 3150
 * HW 2
 * 
 */
package childpackage;

public class Driver {
	public static void main (String[] args)
	{
			Child child = new Child();
			child.publicValue = 6;
			
			//System.out.printf("Parent Value=%s",child.);
			child = null;
			
	}
}
