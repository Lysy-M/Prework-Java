package pl.coderslab.darrays;

public class Main07 {

	public static void main(String[] args) {

		double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};

		double[] tempsF = new double[temps.length];
		double sum = 0;

		for (int i = 0; i < temps.length; i++) {
			tempsF[i] = temps[i] * 1.8 + 32;
			sum += tempsF[i];
		}

		double avg = sum / tempsF.length;

		System.out.println("ŚREDNIA: " + String.format("%.2f", avg));
	}
}