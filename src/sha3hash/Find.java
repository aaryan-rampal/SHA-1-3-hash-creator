package sha3hash;

import java.io.*;
import java.util.*;

public class Find {

	static BufferedReader br;
	static BufferedReader bro;
	static PrintWriter pw;
	static {
		try {
			br = new BufferedReader(new FileReader("output.txt"));
			pw = new PrintWriter(new FileWriter("results.txt"));
			bro = new BufferedReader(new FileReader("input.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 13; i++) {
			String line = bro.readLine().substring(5);

			String result;
			while ((result = br.readLine()) != null) {
				if (result.substring(0, 36).equals(line)) {
					pw.print("#" + i + ":" + result.substring(37));
				}
			}
		}
	}

}
