package com.pcr.test.sum;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest

{
	
	private static List<Double> tab;
	private static final Double SUM = 344.32;
	private App app = new App();

	@BeforeClass
	public static void init(){
		tab = new ArrayList<Double>();
		tab.add(new Double(10));
		tab.add(new Double(9.0));
		tab.add(new Double(7));
		tab.add(new Double(6));
		tab.add(new Double(42));
		tab.add(new Double(23.2));
		tab.add(new Double(47.9));
		tab.add(new Double(142.9));
		tab.add(new Double(47.59));
		tab.add(new Double(8.73));
		
		
	   
	}
	
	@Test
	public void test() {
		
		assertEquals(SUM,app.sum1(tab),0.001);
		assertEquals(SUM,app.sum2(tab),0.001);
		assertEquals(SUM,app.sum3(tab),0.001);
		assertEquals(SUM,app.sum4(tab),0.001);
		assertEquals(SUM,app.sum5(tab),0.001);
		assertEquals(SUM,app.sum6(tab),0.001);
		assertEquals(SUM,app.sum7(tab),0.001);
		assertEquals(SUM,app.sum8(tab),0.001);
		assertEquals(SUM,app.sum9(tab),0.001);
		assertEquals(SUM,app.sum10(tab),0.001);

	}
}
