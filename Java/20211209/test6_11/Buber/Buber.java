package test6_11.Buber;

public class Buber {
    public int[] index(String sb, String st) {
        char start = st.charAt(0);
        char end = st.charAt(st.length() - 1);
        int startidex = 0;
        int endidex = 0;
        for (int i = 0; i < sb.length(); i++) {
            char sh = sb.charAt(i);
            if (sh == start && textTrue(sb, st, i)) {
                startidex = i;
            } else if (sh == end && textTrue(sb, st, startidex)) {
                endidex = i + 1;
            }
        }
        int[] indexs = {startidex, endidex};
        return indexs;
    }

    public boolean textTrue(String sb, String st, int i) {
        int count = 0;
        for (int n = i; n < sb.length(); n++) {
            if (sb.charAt(n) == st.charAt(count)) {
                count++;
                if (count == st.length()) {
                    return true;
                }
            }
        }

        return false;

    }
}

