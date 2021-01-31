public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        //Simple solution is to iterate through each bit
        //Take the far right/least significant bit from N and add it to your answer
        //Then shift N to the right to prep the next bit while shifting answer to the left
        //Note ans += n&1 cant be used probably bc of overflow turning integers positive
        //Also n%2 cannot be used bc 2's complement will break evens/positives?
        int ans = 0;
        for (int i = 0; i < 32; i++){
            ans <<= 1;
            ans |= n&1;
            n >>= 1;
        }
        return ans;
    }
}
