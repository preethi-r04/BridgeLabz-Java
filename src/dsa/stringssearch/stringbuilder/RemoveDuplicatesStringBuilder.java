package dsa.stringssearch.stringbuilder;

import java.util.HashSet;

public class RemoveDuplicatesStringBuilder {

    static String remove(String s) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(remove("programming"));
    }
}

