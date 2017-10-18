package ua.nure.ivanenko.Practice4.part5;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

import ua.nure.ivanenko.Practice4.part1.Part5;

public class Part5Test {
	private static final String ENCODING = "UTF-8";
	private static final String[] ARG = {};

	@Test
	public void writeProperties() {
		String expected = "стол";
		String actual = Part5.writeProperties("table ru");

		assertEquals(expected, actual);

		expected = "table";
		actual = Part5.writeProperties("table en");

		assertEquals(expected, actual);

		expected = "book";
		actual = Part5.writeProperties("book en");

		assertEquals(expected, actual);

		expected = "";
		actual = Part5.writeProperties("");

		assertEquals(expected, actual);

		actual = Part5.writeProperties("table fr");
		expected = "стол";

		assertEquals(expected, actual);
	}

	@Test
	public void constructor() {
		Part5 part5 = new Part5();
	}

	@Test
	public void main() {
		try {
			System.setIn(new ByteArrayInputStream("table ru\ntable en\napple ru\naaa\nstop".getBytes(ENCODING)));
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getStackTrace());
		}
		try {
			Part5.main(ARG);
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
	}
}
