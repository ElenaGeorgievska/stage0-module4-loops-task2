package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        // Create an char array of given String
        char[] ch = chars;

        int i = 0;

        // Declare an String with empty initialization
        String s = "";

        while (i < ch.length) {

            // concat with the declared String
            s = s + ch[i];
            i++;
        }

        System.out.println(s);

    }

    public static void main(String[] args) {
        WordsBuilder mb = new WordsBuilder();
        mb.buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');
    }
    //Write a program that will build a phrase from given chars (char...). !
    // HINT check length method in google!
}
