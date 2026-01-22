package dsa.stringssearch.stringbuilder;

public class ReverseStringBuilder {

    static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
