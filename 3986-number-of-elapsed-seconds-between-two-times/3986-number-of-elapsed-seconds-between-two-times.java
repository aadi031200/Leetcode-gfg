class Solution {
    public int secondsBetweenTimes(String s, String e) {
        int s_h=Integer.parseInt(s.substring(0,2));
        int s_m=Integer.parseInt(s.substring(3,5));
        int s_s=Integer.parseInt(s.substring(6,8));

        int total_S=s_h*3600+s_m*60+s_s;

        int e_h=Integer.parseInt(e.substring(0,2));
        int e_m=Integer.parseInt(e.substring(3,5));
        int e_s=Integer.parseInt(e.substring(6,8));

        int total_E=e_h*3600+e_m*60+e_s;

        return total_E-total_S;
    }
}