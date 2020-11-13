package com.demo.Test.roots;

public class QuadraticEquation {
	public static Roots findRoots(double a, double b, double c) {
			double root1=0.0;double root2=0.0;
			double detResp = b * b - 4.0 * a * c;
			if (detResp > 0.0) {
	             root1 = (-b + Math.pow(detResp, 0.5)) / (2.0 * a);
	             root2 = (-b - Math.pow(detResp, 0.5)) / (2.0 * a);
	        } else if (detResp == 0.0) {
	             root1 = -b / (2.0 * a);
	        } 
			return new Roots(root1, root2);
		}

		public static void main(String[] args) {
			Roots roots = QuadraticEquation.findRoots(2, 10, 8);
			System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
		}
}


