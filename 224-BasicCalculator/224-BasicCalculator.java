// Last updated: 7/31/2025, 2:14:11 PM
class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int number = 0, result = 0, sign = 1;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = c - '0';
                number = number * 10 + digit;
            } else if (c == '+' || c == '-') {
                result += number * sign;
                sign = (c == '+') ? 1 : -1;
                number = 0;
            } else if (c == '(') {
                result += number * sign;
                stack.push(result);
                stack.push(sign);
                number = 0;
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += (number * sign);
                result *= stack.pop(); 
                result += stack.pop();
                number = 0;
                sign = 1;
            }
        }
        return result + (number * sign);
    }
}