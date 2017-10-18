package ua.nure.ivanenko.Practice4.part3;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

import ua.nure.ivanenko.Practice4.part1.Part3;

public class Part3Test {
	private static final String ENCODING = "UTF-8";
	private static final String[] ARG = {};

	@Test
	public void types() {
		String text = "a bcd 43.43 432 и л фвыа 89 .98";

		String expected = "char : a, и, л";
		assertEquals(expected, Part3.types(text, "char"));

		expected = "double : 43.43, .98";
		assertEquals(expected, Part3.types(text, "double"));

		expected = "String : bcd, фвыа";
		assertEquals(expected, Part3.types(text, "String"));

		expected = "int : 432, 89";
		assertEquals(expected, Part3.types(text, "int"));

		expected = "";
		assertEquals(expected, Part3.types(text, ""));

		expected = "";
		assertEquals(expected, Part3.types(text, "   "));

		assertEquals(expected, Part3.types(text, "a"));
	}

	@Test
	public void constructor() {
		Part3 part3 = new Part3();
	}

	@Test
	public void main() {
		try {
			System.setIn(new ByteArrayInputStream("char\nString\nint\ndouble\naa\n\nstop".getBytes(ENCODING)));
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getStackTrace());
		}
		try {
			Part3.main(ARG);
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}

	}

}
