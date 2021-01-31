class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        //The idea is that we use DP to see if previous words can make the string 
        //match up to that point.
        HashSet<String> dict = new HashSet<String>(wordDict);
        boolean[] legal = new boolean[s.length()+1];
        //Have to set intitial case to true since empty string is legal
        legal[0] = true;
        
        //Iterate through each character
        for(int i = 1; i <= s.length(); i++){
            
            //iterate through each character before this character
            for (int j = 0; j < i; j++){
                if (legal[j] && dict.contains(s.substring(j,i))){
                    legal[i] = true;
                }
            }
        }
        return legal[s.length()];
        
    }
}
