package ua.nure.ivanenko.Practice4.part2;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Arrays;

import org.junit.Test;

import ua.nure.ivanenko.Practice4.part1.Part2;

public class Part2Test {
	private static final String[] ARG = {};
	
	int[] arr = { 3, 5, 1, -1, 8 };
	String name = "part2test.txt";
	File file = new File(name);

	@Test
	public void writeRandomNumber() {
		Part2.writeRandomNumber(name, 10);
		assertTrue(file.exists());
		
		Part2.writeRandomNumber(name, -1);
		assertTrue(file.exists());
		
		String name2 = "part2testException";
		File f = new File(name2);
		f.mkdirs();
		Part2.writeRandomNumber(name2, 10);
	}
	
	@Test
	public void writeArray() {
		String name2 = "part2testException";
		File f = new File(name2);
		f.mkdirs();
		Part2.writeArray(arr, name2);
		
		Part2.writeArray(arr, name);
		assertTrue(file.exists());
		
		arr = new int[] {};
		Part2.writeArray(arr, name);
		assertTrue(file.exists());
	}

	@Test
	public void readArray() {
		Part2.writeArray(arr, name);
		int[] actual = Part2.readArray(name, arr.length);
		assertTrue(Arrays.equals(actual, arr));
		
		actual = Part2.readArray(name, 10);
		int[] expected = Arrays.copyOf(arr, 10);
		assertTrue(Arrays.equals(actual, expected));
		
		actual = Part2.readArray(name, 2);
		expected = Arrays.copyOf(arr, 2);
		assertTrue(Arrays.equals(actual, expected));
	}

	@Test
	public void quickSort() {
		int[] actual = Part2.quickSort(arr, 0, arr.length - 1);
		int[] expected = arr.clone();
		Arrays.sort(expected);

		assertTrue(Arrays.equals(actual, expected));
	}

	@Test
	public void constructor() {
		Part2 part2 = new Part2();
	}

	@Test
	public void main() {
		Part2.main(ARG);
	}
}
