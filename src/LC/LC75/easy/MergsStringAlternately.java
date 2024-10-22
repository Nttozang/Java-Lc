package LC.LC75.easy;

public class MergsStringAlternately {
    private String word1;
    private String word2;

    public MergsStringAlternately(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public static void main(String[] args) {

        MergsStringAlternately me = new MergsStringAlternately("abc","pqr");
        var x = me.mergeAlternately();
        System.out.println(x);

        MergsStringAlternately me2 = new MergsStringAlternately("ab","pqrs");
        var y = me2.mergeAlternately();
        System.out.println(y);
    }

    public String mergeAlternately(){
        StringBuilder sb = new StringBuilder();
        int i = 0 ;
        int j = 0 ;
        while (i < word1.length() && j < word2.length()){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        while (i < word1.length()){
            sb.append(word1.charAt(i++));
        }
        while (j < word2.length()){
            sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
}
