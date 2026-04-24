class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count = 0;
        int l = 0;
        int r = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L')
                l++;
            else if (moves.charAt(i) == 'R')
                r++;
        }
        if (l > r) {
            for (int i = 0; i < moves.length(); i++) {
                if (moves.charAt(i) == 'L' || moves.charAt(i) == '_') {
                    count--;
                } else { //moves.charAt(i)=='R'
                    count++;
                }
            }
        } else {
            for (int i = 0; i < moves.length(); i++) {
                if (moves.charAt(i) == 'R' || moves.charAt(i) == '_') {
                    count++;
                } else { //moves.charAt(i)=='L'
                    count--;
                }
            }
        }
        return Math.abs(count);
    }
}