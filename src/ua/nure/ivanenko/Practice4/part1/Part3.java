package ua.nure.ivanenko.Practice4.part1;

/* The file contains symbols, words, integers and 
 * floating-point numbers (separated by spaces).
 *  
 * Write a class that has the following functionality: 
 * in the loop, the user enters the data type from the console 
 * (one of char, String, int, double), 
 * in response, the application prints to the console all 
 * the values ​​of the relevant types that exist in the file. 
 * 
 * The task is solved using regular expressions.
 * 
 */

import java.util.regex.*;
import java.io.*;

public class Part3 {
	public static String types(String text, String type) {
		StringBuilder sb = new StringBuilder();
		Pattern pattern = null;
		if (type.equals("char")) {
			pattern = Pattern.compile("(?iU)(^\\p{L}(?=\\s))|((?<=\\s)\\p{L}(?=\\s))");
		} else {
			if (type.equals("int")) {
				pattern = Pattern.compile("(^d+(?=\\s))|((?<=\\s)\\d+(?=\\s))");
			} else {
				if (type.equals("double")) {
					pattern = Pattern.compile("\\d*\\.\\d*");
				} else {
					if (type.equals("String")) {
						pattern = Pattern.compile("(?iU)(^(\\p{L}{2,})(?=\\s))|(?<=\\s)?(\\p{L}{2,})(?=\\s)");
					} else {
						return sb.toString();
					}
				}
			}
		}
		Matcher matcher = pattern.matcher(text);
		boolean flag = false;
		while (matcher.find()) {
			if (flag) {
				sb.append(" ").append(matcher.group());
			} else {
				sb.append(matcher.group());
				flag = true;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));
		String text = Reader.read("part3.txt");
		String variable;
		do {
			variable = reader.readLine();
			if (variable == null) {
				continue;
			}
			if (variable.equalsIgnoreCase("stop")) {
				break;
			}
			System.out.println(types(text, variable));
		} while (true);
	}

}
