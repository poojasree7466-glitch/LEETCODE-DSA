class Solution {

    public int compress(char[] chars) {

        int l = 0;
        int r = 0;

        while (r < chars.length) {

            char current = chars[r];
            int count = 0;

            while (r < chars.length && chars[r] == current) {
                count++;
                r++;
            }

            chars[l] = current;
            l++;

            if (count > 1) {

                String s = String.valueOf(count);

                for (char c : s.toCharArray()) {
                    chars[l] = c;
                    l++;
                }
            }
        }

        return l;
    }
}