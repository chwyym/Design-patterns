package decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest {
	public static void main(String[] args) {
		int c;
		try {
			InputStream in = 
					new LowerCaseInputStream(
							new BufferedInputStream(
									new FileInputStream("./src/decorator/test.txt")));
			while((c = in.read()) >= 0 ) {
				System.out.print((char)c);
			}
			
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
