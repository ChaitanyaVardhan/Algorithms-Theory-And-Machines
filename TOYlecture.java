public class TOYlecture
{
    public static void main(String[] args) {
	int pc = 0x10;          // program counter
	int[] R = new int[16];  // registers
	int[] M = new int[256]; // memory

	In in = new In(args[0]);
	for (int i = 0x10; i < 0xFF && !in.isEmpty(); i++)
	    M[i] = Integer.parseInt(in.readString(), 16);

	while (true)
	    {
		int ir = M[pc++];

		int op = (ir >> 12) & 0XF;    // opcode   (bits 12-15)
		int d  = (ir >>  8) & 0XF;    // dest d   (bits 8-11)
		int s  = (ir >>  4) & 0xF;    // source s (bits 4-7)
		int t  = (ir >>  0) & 0xF;    // source t (bit 0-3)
		int addr = (ir >> 0) &0xFF;   // address (bits 0-7)
		if (op == 0) break;           // halt

		switch(op)
		    {
		    case 1: R[d] = R[s] + R[t]; break;
		    }
	    }
    }
}
