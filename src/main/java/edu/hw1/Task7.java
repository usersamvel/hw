package edu.hw1;

public class Task7 {

    static final String ERROR = "negative number";

    public String conv(int m) {
        int n = m;
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            s.insert(0, (n % 2));
            n = n / 2;
        }
        return s.toString();
    }

    public int rotateLeft(int n, int shift) {
        if (n < 0 || shift < 0) {
            throw new IllegalArgumentException(ERROR);
        }
        if (n == 0) {
            return 0;
        }
        String s = conv(n);
        int l = s.length();
        int sh = shift % l;
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < sh; ++i) {
            t.append(s.charAt(i));
        }
        StringBuilder r = new StringBuilder();
        for (int i = sh; i < l; ++i) {
            r.append(s.charAt(i));
        }
        s = r.toString() + t;
        int ans = 0;
        for (int i = l - 1; i >= 0; --i) {
            if (s.charAt(i) == '1') {
                ans += (int) Math.pow(2, l - 1 - i);
            }
        }
        return ans;
    }

    public int rotateRight(int n, int shift) {
        if (n < 0 || shift < 0) {
            throw new IllegalArgumentException(ERROR);
        }
        if (n == 0) {
            return 0;
        }
        String s = conv(n);
        int l = s.length();
        int sh = shift % l;
        StringBuilder t = new StringBuilder();
        for (int i = l - 1; i >= l - sh; --i) {
            t.insert(0, s.charAt(i));
        }
        StringBuilder r = new StringBuilder();
        for (int i = l - sh; i >= 0; --i) {
            r.insert(0, s.charAt(i));
        }
        s = t + r.toString();
        int ans = 0;
        for (int i = l - 1; i >= 0; --i) {
            if (s.charAt(i) == '1') {
                ans += (int) Math.pow(2, l - 1 - i);
            }
        }
        return ans;
    }
}
