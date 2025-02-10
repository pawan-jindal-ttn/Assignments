import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ques3 {
    public int countWords(String path, String word) throws FileNotFoundException {
        int count = 0;
        Scanner input = new Scanner(new File(path));
        while(input.hasNext()){
            String file_word = input.next();
            if(file_word.equals(word)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Ques3 ob = new Ques3();

        System.out.println("Enter the path of the file: ");
        String path = input.next();

        System.out.println("Enter the word: ");
        String word = input.next();

        int ans = ob.countWords(path, word);
        System.out.println("Total words in the given file is: "+ ans);
    }
}