package by.it.dnevar.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {

    private static String[] words=new String[0];
    private static int[] counts=new int[0];


    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        Pattern compile = Pattern.compile("[а-яёА-ЯЁ]+");
        Matcher matcher = compile.matcher(text);
        while (matcher.find()){
            String word = matcher.group();
            process(word);
        }
        printResult();
    }

    private static void printResult() {
        for (int i = 0; i < words.length; i++) {
            System.out.printf("%s=%d\n",words[i],counts[i]);
        }
    }

    private static void process(String word) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                counts[i]++;
                return;
            }
        }
        words= Arrays.copyOf(words,words.length+1);
        words[words.length-1]=word;

        counts=Arrays.copyOf(counts,counts.length+1);
        counts[counts.length-1]=1;
    }
}
