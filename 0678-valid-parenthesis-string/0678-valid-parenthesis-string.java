class Solution {
    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                min++;
                max++;
            } else if (s.charAt(i) == ')') {
                min--;
                max--;
            } else {
                min--;
                max++;
            }

            if (min < 0)
                min = 0;
            if (max < 0)
                return false;
        }
        return min==0;
    }
}

// class Solution {
//     public boolean checkValidString(String s) {
//          int idx=0;
//         int count=0;
//        return  isvalid(s,idx,count);
//     }
//     public boolean isvalid(String s,int idx,int count){
//         if(idx==s.length()){
//             return count==0;
//         }
//         if(count<0) return false;

//         if(s.charAt(idx)=='(') return isvalid(s, idx+1,count+1);
//         else if(s.charAt(idx)==')') return isvalid(s, idx+1, count-1);
//         return  isvalid(s,idx+1,count+1) || isvalid(s,idx+1, count-1) || 
//         isvalid(s,idx+1,count)  ;
//     }

// }