package LAB9;

import java.io.*;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		double[] scores1 = { 1, 2, 3, 4, 5, 6, 7 };
		double[] scores2 = { 11, 12, 13, 14, 15, 16, 17 };
		double[] scores3 = { 11, 21, 31, 41, 51, 61, 71 };
		double[] scores4 = { 21, 22, 23, 24, 25, 26, 27 };
		double[] scores5 = { 12, 22, 32, 42, 52, 62, 72 };

		TestScores test1 = new TestScores(scores1);
		TestScores test2 = new TestScores(scores2);
		TestScores test3 = new TestScores(scores3);
		TestScores test4 = new TestScores(scores4);
		TestScores test5 = new TestScores(scores5);

		// Serialize
		FileOutputStream fileout = new FileOutputStream("src\\LAB9\\SchoolSerialized.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(test1);
		out.writeObject(test2);
		out.writeObject(test3);
		out.writeObject(test4);
		out.writeObject(test5);

		fileout.close();
		out.close();

		// De-Serialize
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("src\\LAB9\\SchoolSerialized.txt"));
		TestScores redtest1 = (TestScores) in.readObject();
		TestScores redtest2 = (TestScores) in.readObject();
		TestScores redtest3 = (TestScores) in.readObject();
		TestScores redtest4 = (TestScores) in.readObject();
		TestScores redtest5 = (TestScores) in.readObject();
		System.out.println(redtest1.calcAvg());
		System.out.println(redtest2.calcAvg());
		System.out.println(redtest3.calcAvg());
		System.out.println(redtest4.calcAvg());
		System.out.println(redtest5.calcAvg());

		in.close();
	}
}
