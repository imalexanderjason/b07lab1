public class Polynomial {
	double[] coefficients;

	public Polynomial() {
		coefficients = new double[] {0.0};
	}

	public Polynomial (double[] arg) {
		coefficients = arg;
	}
	
	public Polynomial add(Polynomial arg) {
		double[] result = new double[arg.coefficients.length];

		for (int i = 0; i < coefficients.length; i++) {
			result[i] += coefficients[i];
		}		
		
		for (int i = 0; i < arg.coefficients.length; i++) {
			result[i] += arg.coefficients[i];
		}
		
		return new Polynomial(result);
	}
	
	public double evaluate(double x) {
		double result = 0.0;
		double power = 1.0;
		
		for (int i = 0; i < coefficients.length; i++) {
			result += coefficients[i] * power;
			power *= x; 
		}
		
		return result;
	}

	public boolean hasRoot(double arg) {
		double result = evaluate(arg);
		return result == 0;	
	}
}