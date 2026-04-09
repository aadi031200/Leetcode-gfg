class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        StringBuilder sb= new StringBuilder(s);

        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='9'){
                sb.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}