class Solution {
    public int maxDepth(String s) {
        Stack<Character> st= new Stack<>();
        int op=0;
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(ch);
                op++;
                max=Math.max(max,op);
            }else if(ch==')'){
                 if(!st.isEmpty()){
                    char  top=st.pop();
                 op--;
                }
               
            }
        }
        return max;
    }
}