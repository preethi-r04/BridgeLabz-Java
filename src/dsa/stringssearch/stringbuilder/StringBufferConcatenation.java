package dsa.stringssearch.stringbuilder;

public class StringBufferConcatenation {

    static String concat(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr)
            sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"Java", " ", "DSA", " ", "Prep"};
        System.out.println(concat(arr));
    }
}
