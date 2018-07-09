public class lrs {
    public static String lcp(String s, String t) {
	int N = Math.min(s.length(), t.length());
	
	for (int i = 0; i < N; i++) {
	    if (s.charAt(i) != t.charAt(i))
		return s.substring(0, i);
	}
	return s.substring(0, N);	
    }

}
