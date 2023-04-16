package com.bharath.newInterface;

public class AbstractClassImpl extends AbstractClass
{
	@Override
	void danceMore() {
		System.out.println("I am dancing more");
	}
	
	public static void main(String[] args) 
	{
		AbstractClassImpl impl = new AbstractClassImpl();
		
		AbstractClass.dance();
		
		impl.danceMore();
	}

}
