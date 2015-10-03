package childpackage;
//package parentpackage;

import parentpackage.Parent;

public class Child extends Parent{
	
	public int getProtectedValue()
	{
		return super.protectedValue;
	}
	
	public int getAnotherProtectedValue()
	{
		return super.anotherProtectedValue;
	}
}
