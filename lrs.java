/* Longest repeated substring in a string                   */
/* Execution: javac lrs <string>                            */

public class lrs {
    public static String lcp(String s, String t) {
	int N = Math.min(s.length(), t.length());

	for (int i = 0; i < N; i++) {
	    if (s.charAt(i) != t.charAt(i))
		return s.substring(0, i);
	}
	return s.substring(0, N);	
    }

    public static String lrs(String s) {
	int N = s.length();
	String lrs = "";

	for (int i =0; i < N; i++) {
	    for (int j = i + 1; j < N; j++) {
		String x = lcp(s.substring(i, N), s.substring(j, N));
		if (x.length() > lrs.length()) lrs = x;
	    }
	}
	return lrs;
    }

    public static String lrsSuffixString(String s) {
	int N = s.length();
	String[] suffixes = new String[N];
	String lrs = "";
	for (int i = 0; i < N; i++) 
	    suffixes[i] = s.substring(i, N);

	Merge.sort(suffixes);

	//	for (int i = 0; i < N; i++)
	//	    StdOut.println(suffixes[i]);

	for (int i = 0; i < N - 1; i++) {
	    String x  = lcp(suffixes[i], suffixes[i+1]);
	    if (x.length() > lrs.length()) lrs = x;
	}
	
	return lrs;
    }

    public static void main(String[] args) {
	while(!StdIn.isEmpty()) {
	    String s = StdIn.readString();
	    StdOut.println("String :" + s );
	    StdOut.println("longest substring thorugh brute force :" + lrs(s));
	    StdOut.println("longest substring through suffix string method : " + lrsSuffixString(s));
	}
    }
}
