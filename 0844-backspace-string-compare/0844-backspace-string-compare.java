class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '#') {
                if (!st1.isEmpty())
                    st1.pop();
            } else {
                st1.push(ch);
            }
        }

        for (char ch : t.toCharArray()) {

            if (ch == '#') {
                if (!st2.isEmpty())
                    st2.pop();
            } else {
                st2.push(ch);
            }
        }

        StringBuilder sb1 = new StringBuilder();

        while (!st1.isEmpty())
            sb1.append(st1.pop());

        StringBuilder sb2 = new StringBuilder();

        while (!st2.isEmpty())
            sb2.append(st2.pop());

        return sb1.reverse().toString().equals(sb2.reverse().toString());
    }
}