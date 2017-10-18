package ua.nure.ivanenko.Practice4.reader;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

import ua.nure.ivanenko.Practice4.part1.Reader;

public class ReaderTest {
	private static final String[] ARG = {};
	private static String text = "Там, где присутствует милосердие, — там воспитание." + System.lineSeparator()
			+ "Там, где милосердие отсутствует, — там дрессировка.";
	String fileName = write();

	public static String write() {
		String name = "part4test.txt";
		try {
			FileWriter fw = new FileWriter(name);
			fw.write(text);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
		return name;
	}

	@Test
	public void read() {
		String actual = Reader.read(fileName);

		assertEquals(text, actual);

		actual = Reader.read("abc.txt");

		assertEquals("", actual);

		String fileName = "directory";
		File f = new File(fileName);
		f.mkdir();
		Reader.read(fileName);
	}

	@Test
	public void constructor() {
		Reader reader = new Reader();
	}

}
