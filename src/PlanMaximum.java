import java.util.*;

public class PlanMaximum {
    public static void main(String[] args) {
        String str="I love Java very very";
        String [] array=str.split(" ");
        System.out.println("Кількість слів у реченні:" + array.length);

        System.out.println("===========Task4==========");

        String str1="I love my family . I have older brother . I love mother . I love father .";
        char [] array1=str1.toCharArray();
        int count=0;
        for(int i=0;i<array1.length;i++){
            if(array1[i]=='.'){
                ++count;
            }
        }
        System.out.println("Кількість речень:" + count);

        System.out.println("==========Task5===============");

        ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList(array));
        String word1=null;
        int max=0;
        for(String word: arrayList){
            int i=0;
            int [] count1=new int[array.length];
            count1 [i]= Collections.frequency(arrayList, word);
            if(count1[i]>max){
                max=count1[i];
                word1=word;
            }
            System.out.println("Слово:" + word + "Частота:" + count1 [i]);
            i++;
        }
        System.out.println("Найчастіше зустрічається:" + word1);

        System.out.println("===========Task6==========");

        String [] sentences=str1.split(" ");
        ArrayList<String>wordList1=new ArrayList<>(Arrays.asList(sentences));
        int f=Collections.frequency(wordList1,".");
        for(int i=0;i<f;i++){
        wordList1.remove(".");}
        System.out.println(wordList1);
        int max1=0;
        String word2=null;
        for(String words: wordList1){
            int i=0;
            int [] count1=new int[sentences.length];
            count1 [i]= Collections.frequency(wordList1, words);
            if(count1[i]>max1){
                max1=count1[i];
                word2=words;
            }
            System.out.println("Слово:" + words + "Частота:" + count1 [i]);
            i++;
        }
        System.out.println("Найчастіше зустрічається:" + word2);

        }







    }

