/* This class generates a fixed number N of strings
of length L from a given alphabet
Run command: java Generator N L 'abcd' (java Generator 10000 5 'abcdefghijklmnopqrstuvwxyz')
The above run command would generate 10000 strings of length 5 from the alphabet a-z
*/

public class Generator {
    public static String randomString(int L, String alpha) {
	char[] a = new char[L];
	for (int i = 0; i < L; i++) {
	    int t = StdRandom.uniform(alpha.length());
	    a[i] = alpha.charAt(t);
	}
	return new String(a);
    }

    public static void main(String[] args) {
	int N = Integer.parseInt(args[0]);
	int L = Integer.parseInt(args[1]);
	String alpha = args[2];
	for (int i=0; i < N; i++)
	    StdOut.println(randomString(L, alpha));
    }
}
