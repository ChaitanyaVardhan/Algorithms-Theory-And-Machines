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
	for (int i = 0; i < N; i++) 
	    suffixes[i] = s.substring(i, N);

	for (int i = 0; i < N; i++)
	    StdOut.println(suffixes[i]);

	return s;
    }

    public static void main(String[] args) {
	String s = args[0];
	StdOut.println(lrs(s));
	lrsSuffixString(s);
    }
}