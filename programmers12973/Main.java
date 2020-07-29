package programmers12973;

import java.util.Stack;

class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = "cabc";
		sol.solution(s);
	}
}

class Solution {
	public int solution(String s) {
		if (s.length() % 2 == 1)
			return 0;

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (st.isEmpty())
				st.push(c);
			else if (st.peek() == c)
				st.pop();
			else
				st.push(c);
		}

		if (st.size() == 0)
			return 1;
		else
			return 0;
	}
}