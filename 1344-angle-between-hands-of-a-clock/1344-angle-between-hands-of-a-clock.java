class Solution {
    public double angleClock(int hour, int min) {
        double minuteAngle=6*min;
        double hourAngle=30*hour+0.5*min;

        double diff=Math.abs(hourAngle-minuteAngle);

        return Math.min(diff,360-diff);
    }
}