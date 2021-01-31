public class Solution {
    // you need to treat n as an unsigned value
    //we just start with 1 and check to see if that matches with an AND operation
    //shift 1 to the left for every bit, then check to see if its negative for 2's complement
   public int hammingWeight(int n) {
        int mask = 1;
        int bits=0;
        for (int i = 0; i < 32; i++){
            if ((n & mask) != 0) bits++;
            mask <<= 1;
        }
        return bits;
    }
}
