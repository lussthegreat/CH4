public class Multadd {
	
	public static double multadd(double a, double b, double c) {
		return a * b + c;
	}
	public static void main(String[] args) {
		double testResult = multadd(1.0, 2.0, 3.0);
		System.out.println("multadd(1.0, 2.0, 3.0) = " + testResult);
		double exp1 = multadd(Math.cos(Math.PI / 4), 0.5, Math.sin(Math.PI / 4));
		System.out.println("Expression 1 result: " + exp1);
		double exp2 = multadd(1.0, Math.log(10), Math.log(20));
		System.out.println("Expression 2 result: " + exp2);
	}
	





}

