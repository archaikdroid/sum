package com.pcr.test.sum;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.DoubleAdder;

/**
 * Sums
 *
 */
public class App {

	public double sum1(List<Double> tab) {

		double sum = 0;
		for (int i = 0; i < tab.size(); i++) {
			sum += tab.get(i);
		}
		return sum;

	}

	public double sum2(List<Double> tab) {

		double sum = 0;
		for (double d : tab) {
			sum += d;
		}
		return sum;

	}

	public double sum3(List<Double> tab) {
		return tab.stream().mapToDouble(Double::doubleValue).sum();
	}

	public double sum4(List<Double> tab) {
		double sum = 0;
		for (Iterator<Double> iterator = tab.iterator(); iterator.hasNext();) {
			sum += iterator.next();

		}

		return sum;

	}

	public double sum5(List<Double> tab) {

		if (tab.isEmpty()) {
			return 0;
		} else {
			return tab.get(0) + sum5(tab.subList(1, tab.size()));
		}
	}

	public double sum6(List<Double> tab) {

		double sum = 0;
		for (int i = tab.size()-1; i >= 0; i--) {
			sum += tab.get(i);
		}
		return sum;

	}

	public double sum7(List<Double> tab) {

		return tab.stream().reduce(Double::sum).get();

	}
	
	public double sum8(List<Double> tab) {

		return tab.stream().reduce((a,b)-> a+b).get();

	}
	
	public double sum9(List<Double> tab) {

		 DoubleAdder accu = new DoubleAdder();
		 tab.stream().forEach(x->accu.add(x));
		 return accu.sum();	 

	}
	
	public double sum10(List<Double> tab) {

		for (int i = 1; i < tab.size(); i++) {
			tab.set(i, tab.get(i-1)+tab.get(i));
		}
		return tab.get(tab.size()-1);

	}


}
