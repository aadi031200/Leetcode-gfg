class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int distance=Integer.MAX_VALUE;
        int n=words.length;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                int diff=Math.abs(i-startIndex);
                int circular=Math.min(diff,n-diff);
                distance=Math.min(distance,circular);
            }
        }
        return distance==Integer.MAX_VALUE?-1:distance;
    }
}