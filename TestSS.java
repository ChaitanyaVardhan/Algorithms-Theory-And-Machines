/* this class estimates the time required to
complete 10N searches in a whitelist of N strings
Run command: java Generator 10 5 'abcdefghijklmnopqrstuvwxyz' | java TestSS
*/

public class TestSS {
    public static int search(String key, String[] a) {
	for (int i = 0; i < a.length; i++)
	    if (a[i].compareTo(key) == 0) return i;
	return -1;
    }

    public static void main(String[] args) {
	String[] words = StdIn.readAllStrings();
	int N = words.length;
	double start = System.currentTimeMillis()/1000;
	StdOut.println("N = " + N + " t0 = " + start);
	for (int i = 0; i < 10*N; i++) {
	    String key = words[StdRandom.uniform(N)];
	    if (search(key, words) == -1)
		StdOut.println(key);
	}
	double now = System.currentTimeMillis()/1000;
	StdOut.println("Time taken = " + Math.round(now - start) + "seconds");
    }
}
