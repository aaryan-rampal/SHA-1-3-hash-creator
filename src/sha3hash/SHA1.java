package sha3hash;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.io.*;

public class SHA1 {

//	static PrintWriter pw;
//
//	static {
//		try {
//			pw = new PrintWriter("hash.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//	}

	private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner scan = new Scanner(System.in);
		String originalString = scan.nextLine();
		while (!originalString.equals("q")) {
				final MessageDigest digest = MessageDigest.getInstance("SHA1");
				final byte[] hashbytes = digest.digest(
				originalString.getBytes(StandardCharsets.UTF_8));
				String sha3Hex = bytesToHex(hashbytes);
				System.out.println(sha3Hex);
			//	pw.println(sha3Hex);
				originalString = scan.nextLine();
		}
	//	pw.close();
	}

	public static String bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = HEX_ARRAY[v >>> 4];
			hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
		}
		return new String(hexChars);
	}

}

