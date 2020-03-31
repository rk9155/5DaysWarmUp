package Practice;

import java.util.Scanner;
//
//public class Intest {
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		long n = s.nextLong();
//		long k = s.nextLong();
//		long A[] = new long[(int) n];
//		for(int i = 0;i<n;i++) {
//			A[i] = s.nextLong();
//		}
//		int count = 0;
//		for(int i = 0;i<n;i++) {
//			if(A[i]%k==0) {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
//
//}
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Intest {
	public static void main(String[] args) {
		
		// System.in and System.out are input and output streams, respectively.
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);

		int n = in.nextInt();
		int k = in.nextInt();
		
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			
			if (x % k == 0) {
				ans++;
			}
		}

		System.out.println(ans);
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
				    tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
				    throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
