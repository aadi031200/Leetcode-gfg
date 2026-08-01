class Solution {
    public int calPoints(String[] opr) {
        Stack<Integer> st= new Stack<>();

        for(String op:opr){
            switch(op){
            case "+":
                int fir=st.pop();
                int sc=st.peek();
                st.push(fir);
                st.push(fir+sc);
                break;
            case "D":
                st.push(st.peek()*2);
                break;
            case "C":
                st.pop();
                break;
            default :
                st.push(Integer.parseInt(op));
        }
        }

        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
         

        return ans;

    }
}