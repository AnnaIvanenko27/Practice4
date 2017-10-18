package ua.nure.ivanenko.Practice4.part1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo {
	private static final String ENCODING = "Cp1251";
	private static final String[] ARGS = {};

	public static void main(String[] args) throws IOException {
		System.out.println("========= PART1");
		Part1.main(ARGS);

		System.out.println("========= PART2");
		Part2.main(ARGS);

		System.out.println("========= PART3");
		// set the mock input
		System.setIn(new ByteArrayInputStream("char\nString\nint\ndouble\naaa\nstop".getBytes(ENCODING)));
		Part3.main(ARGS);

		System.out.println("========= PART4");
		Part4.main(ARGS);

		System.out.println("========= PART5");
		System.setIn(new ByteArrayInputStream("table ru\ntable en\napple ru\naaa\nstop".getBytes(ENCODING)));
		Part5.main(ARGS);
	}
}





