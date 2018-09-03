public class SortDedup {
    public static void main(String[] args) {
	BST<String, Integer> st = new BST<String, Integer>();
	while (StdIn.hasNextLine())
	    st.put(StdIn.readLine(), 0);

	StdOut.println(st.contains("it was the winter of despair"));

	for (String s : st.keys())
	    StdOut.println(s);
    }
}
