package com.csi.CoreJunitApplication;

import org.junit.Assert;
import org.junit.Test;

public class ArithmaticApplicationTestImpl {
 
	ArithmaticApplication a1 = new ArithmaticApplication();
	@Test
	public void testSum(){	
		Assert.assertEquals(9, a1.sum(4, 5));
	}
	public void testMultiplication(){	
		Assert.assertEquals(600, a1.multiplication(20, 30));
	}
}
