public class DFA {
    private ST<Character, Integer>[] next;



    public DFA(String filename) {
	
    }

    public static void main(String[] args) {
	DFA dfa = new DFA(args[0]);
    }
}
