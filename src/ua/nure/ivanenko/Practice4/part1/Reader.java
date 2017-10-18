package ua.nure.ivanenko.Practice4.part1;

/* Class for read data from file. */

import java.io.*;

public class Reader {
	public static String read(String name) {
		StringBuilder sb = new StringBuilder();
		try {
			File file = new File(name);
			if (file.exists()) {
				boolean flag = false;
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "Cp1251"));
				String result;
				while ((result = reader.readLine()) != null) {
					if (flag) {
						sb.append(System.lineSeparator()).append(result);
					} else {
						sb.append(result);
						flag = true;
					}
				}
				flag = false;
				reader.close();
			}

		} catch (IOException e) {
			System.out.println(e);
		}
		return sb.toString();
	}
}
