package strings;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence="my name is ram";
        String[] word = sentence.split(" ");
        String tep="";

        for (int i=word.length-1;i>=0;i--){
            tep+=word[i]+" ";

        }
        System.out.println(tep);
    }
}
