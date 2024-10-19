package strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Appa";
        StringBuilder s = isReverseString(str);
        System.out.println(s);


        /*      direct approach  start    */
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Direct approach : " + rev);

        /*      direct approach  end    */
    }

    private static StringBuilder isReverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));

        }
        return sb;
    }

}


