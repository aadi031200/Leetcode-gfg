class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5)
                a++;
            if (bills[i] == 10) {
                if (a == 0)
                    return false;
                b++;
                a--;
            }
            if (bills[i] == 20) {
                if (a > 0 && b > 0) {
                    a--;
                    b--;
                } else if (a >= 3)
                    a = a - 3;
                else
                    return false;

            }
        }
        return true;
    }
}