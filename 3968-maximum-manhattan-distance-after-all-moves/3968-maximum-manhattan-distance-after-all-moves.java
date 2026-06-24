class Solution {
    public int maxDistance(String moves) {
        int dx=0;
        int dy=0;
        int blank=0;

        for(char c:moves.toCharArray()){
            switch(c){
                case 'R': dx++; break;
                case 'L': dx--; break;
                case 'U': dy++; break;
                case 'D': dy--; break;
                case '_': blank++; break;
            }
        }
        return Math.abs(dx)+Math.abs(dy)+blank;
    }
}