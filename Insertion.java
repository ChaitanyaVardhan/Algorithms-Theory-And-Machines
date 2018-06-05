public class Insertion {
    public static void sort(String[] a) {
	StdOut.println("Number of strings =" + a.length);
	int N = a.length;
	for (int i = 1; i < N; i++) {
	    for (int j = i; j > 0; j--) {
		if (a[j-1].compareTo(a[j]) > 0)
		    exch(a, j-1, j);
		else break;
	    }
	}
    }
    
    public static void exch(String[] a, int i, int j) {
	String temp = a[i];
	a[i] = a[j];
	a[j] = temp;
    }

    public static boolean isSorted(String[] a) {
	for (int i = 0; i < a.length - 1; i++)
	    if(a[i].compareTo(a[i+1]) > 0)
	       return false;
	return true;
    }

    public static void main(String[] args) {
	String[] a = StdIn.readAllStrings();
	double start = System.currentTimeMillis()/1000.0;
	sort(a);
	double now = System.currentTimeMillis()/1000.0;
	StdOut.println("Time taken " + Math.round(now-start) + " seconds");
	StdOut.println("Array is sorted :" + isSorted(a));
	/*
	(int i = 0; i < a.length; i++)
	    StdOut.println(a[i]);
	*/
    }
}
