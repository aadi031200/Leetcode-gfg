class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == y) {
                sb.append(y);
            }
        }
        for (char ch : s.toCharArray()) {
            if (ch != y && ch != x) {
                sb.append(ch);
            }
        }
        for (char ch : s.toCharArray()) {
            if (ch == x) {
                sb.append(x);
            }
        }

        return sb.toString();
    }
}