// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

// Example 1:

// Input: s = "egg", t = "add"
// Output: true
// Example 2:

// Input: s = "foo", t = "bar"
// Output: false
// Example 3:

// Input: s = "paper", t = "title"
// Output: true

void main(List<String> args) {
  Solution().isIsomorphic("bbbaaaba", "aaabbbba");
  Solution().isIsomorphic("paper", "title");
}

class Solution {
  bool isIsomorphic(String s, String t) {
    if (s.length != t.length) return false;
    if (s.isEmpty) return true;

    Map<String, int> mapS = {};
    Map<String, int> mapT = {};
    for (int i = 0; i < s.length; i++) {
      mapS[s[i]] = i;
      mapT[t[i]] = i;
    }

    return mapT.values.join() == mapS.values.join();
  }
}
