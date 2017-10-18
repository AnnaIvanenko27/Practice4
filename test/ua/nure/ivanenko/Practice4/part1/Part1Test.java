package ua.nure.ivanenko.Practice4.part1;

import static org.junit.Assert.*;
import org.junit.Test;

import ua.nure.ivanenko.Practice4.part1.Part1;

public class Part1Test {
	private static final String[] ARG = {};

	@Test
	public void convertTestString() {
		String actual = Part1
				.convert("Никто никогда не бывает виноват только сам. Такими, какими мы становимся, нас делают люди.");
		String expected = "НИКТО НИКОГДА не БЫВАЕТ ВИНОВАТ ТОЛЬКО сам. ТАКИМИ, КАКИМИ мы СТАНОВИМСЯ, нас ДЕЛАЮТ ЛЮДИ.";
		assertEquals(expected, actual);

		assertEquals("", Part1.convert(""));

		assertEquals(null, Part1.convert(null));
	}

	@Test
	public void constructor() {
		Part1 part1 = new Part1();
	}

	@Test
	public void main() {
		Part1.main(ARG);
	}
}
