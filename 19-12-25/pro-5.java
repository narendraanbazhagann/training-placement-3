public class StringToInteger {

    public static int myAtoi(String s) {
        int i = 0, n = s.length();
        int sign = 1;
        int result = 0;

        // 1. Ignore leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4. Handle overflow before multiplying
            if (result > Integer.MAX_VALUE / 10 ||
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));          // 42
        System.out.println(myAtoi("   -042"));     // -42
        System.out.println(myAtoi("1337c0d3"));    // 1337
        System.out.println(myAtoi("0-1"));         // 0
        System.out.println(myAtoi("words and 987"));// 0
    }
}
