package adopted;

import childpackage.Child;

public class Sibling extends Adopted {

	public void adoption()
	{
		System.out.printf("Sibling Value from child=%s\n",this.protectedValue);
		System.out.printf("Sibling Value from adopted=%s\n",this.getAnotherProtectedValue());
	}

}
