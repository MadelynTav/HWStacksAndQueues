package nyc.c4q.madelyntav;
import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 11/4/15.
 */
public class EvenWordHW
{
    public static boolean isEvenWord(String word)
    {
        if(word.length()==0 || word.isEmpty()){
            return true;
        }
         else {
            String current = String.valueOf(word.charAt(0));
            String subWord = word.substring(1);
            if(subWord.contains(current))
            {
                subWord = subWord.replaceFirst(current, "");
                    return isEvenWord(subWord);
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter A Word Whose Evenness You'd Like To Know");
        Scanner scanner= new Scanner(System.in);
        String word=scanner.next();

        System.out.println(isEvenWord(word));
    }
}
