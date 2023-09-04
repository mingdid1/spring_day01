package com.care.di_test02;

public class OperClass {
	public int operation(int n1, int n2, String op) {
		System.out.println("operClass ½ÇÇà");
		int result = 0;
		if (op.equals("+")) {
			result = n1 + n2;
		}else if (op.equals("-")) {
			result = n1 -n2;
		}else if (op.equals("*")) {
			result = n1 * n2;
		}else {
			result = n1 / n2;
		}
		return result;
	}
}
