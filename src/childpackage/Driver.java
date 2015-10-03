/*
 * Frederick Small
 * CISC 3150
 * HW 2
 * 
 */
package childpackage;
import adopted.Adopted;
import adopted.Sibling;

public class Driver {
	public static void main (String[] args)
	{
			Child child = new Child();
			Adopted adopted = new Adopted();
			Sibling sibling = new Sibling();
			child.publicValue = 6;

			//child.getAnotherProtectedValue2();
			
			System.out.printf("Parent Value from child=%s\n",child.getProtectedValue());
			System.out.printf("Parent Value from adopted=%s\n",adopted.getAnotherProtectedValue());
			sibling.adoption();
			
			adopted = null;
			sibling = null;
			child = null;
			
	}
}
