class Solution {
    public boolean asteroidsDestroyed(int mass, int[] ast) {
        Arrays.sort(ast);
        long ms=mass;
        for(int i=0;i<ast.length;i++){
            if(ms>=ast[i]){
                ms+=ast[i];
            }else{
                return false;
            }
        }
        return true;
    }
}