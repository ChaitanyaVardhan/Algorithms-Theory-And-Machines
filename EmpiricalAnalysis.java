public class EmpiricalAnalysis {
    public static void main(String[] args) {
	String inputString = StdIn.readAll();
	double start = System.currentTimeMillis()/1000.0;
	lrs.lrsSuffixString(inputString);
	double finish = System.currentTimeMillis()/1000.0;
	StdOut.println("N: " + inputString.length() + " T(N): " + (finish - start));
    }
}
