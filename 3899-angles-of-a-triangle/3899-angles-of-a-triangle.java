class Solution {
    public double[] internalAngles(int[] arr) {
        Arrays.sort(arr);
        double[] ans= new double[3];
        int a=arr[0];
        int b=arr[1];
        int c=arr[2];
        if(a+b>c){
            ans[0] = Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2.0*b*c)));
            ans[1] = Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2.0*a*c)));
            ans[2] = Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2.0*a*b)));

        }else{
            return new double[0];
        }
        return ans;
    }
}