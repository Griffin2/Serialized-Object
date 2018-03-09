package LAB9;

import java.io.Serializable;

//used an interface
public class TestScores implements Serializable {
	double[] testScoresArray;

	public TestScores(double[] score) {
		testScoresArray = new double[score.length];
		for (int i = 0; i < score.length; i++) {
			testScoresArray[i] = score[i];
			if (testScoresArray[i] < 0 || testScoresArray[i] > 100) {
				throw new IllegalArgumentException("Error... " + score[i] + " outside of range 0-100");
			}
		}
		System.out.printf("Average Grade: %.2f\n", calcAvg());
	}

	public double calcAvg() {
		double avg = 0;
		for (int i = 0; i < testScoresArray.length; i++) {
			avg += testScoresArray[i];
		}
		return avg /= testScoresArray.length;
	}
}
