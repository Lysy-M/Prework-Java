package pl.coderslab.cflowcontrol;

public class Main05 {

	public static void main(String[] args) {
		// pętla for
		int resultFor = 0;
		for (int i = 1; i <= 10; i++) {
			resultFor += i;
		}
		System.out.println( + resultFor);

		// pętla while
		int resultWhile = 0;
		int j = 1;
		while (j <= 10) {
			resultWhile += j;
			j++;
		}
		System.out.println( + resultWhile);



	}

}
