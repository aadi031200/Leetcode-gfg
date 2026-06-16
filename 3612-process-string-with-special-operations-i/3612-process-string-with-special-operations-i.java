class Solution {
    public String processStr(String s) {
       StringBuilder sb= new StringBuilder();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        int ascii=(int)ch;
        if(ascii>=97 && ascii<=122){
            sb.append(ch);
        }
        else if(s.charAt(i)=='*' && sb.length()!=0){
           sb.setLength(sb.length() - 1);
        }
        else if(s.charAt(i)=='%'){
            sb.reverse();
        }
        else{
            sb.append(sb);
        }
      }
      return sb.toString();  
    }
}