/***********************************************************/
/* Sort the strings from StdIn using BST                   */
/* Execution: java Sort < input.txt                        */

public class Sort {
    public static void main(String[] args){
	BST<String, Integer> st = new BST<String, Integer>();
	while (!StdIn.hasNextLine())
	    st.put(StdIn.readLine(), 0);

	for (String s : st.keys())
	    StdOut.println(s);
    }
}
