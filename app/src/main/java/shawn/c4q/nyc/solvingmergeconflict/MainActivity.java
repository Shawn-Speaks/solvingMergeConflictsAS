package shawn.c4q.nyc.solvingmergeconflict;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public static int addNumRepeatedLetters(String word) {
        int numberCount = 0;
        while(!word.isEmpty()){
            char tempChar = word.charAt(0);
            numberCount += find2(word, tempChar);
            word = word.replaceAll("" + word.charAt(0), "");
            /*
            USE 1 BUILT IN JAVA METHOD TO SOLVE THIS PROBLEM.
             */

        }
        return numberCount;
    }

    /**
     * find2 Method looks through the entire string and returns the number of letters that time occurred UNLESS it is a unique character, in that case it returns 0.
     *
     */

    private static int find2(String word, char c) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                count++;
            }
        }
        if(count == 1){
            count = 0;
        }
        return count;
    }

    public static char firstRepeatedCharacter(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == word.charAt(i + 1))
                return ch;
        }
        return 0;
    }


    public static int myMethod(String word) {
        int c = 0;

        for (int i = 0; i < word.length() - 1; i++) {
            if (i == 0 && (word.charAt(i) == word.charAt(i + 1))) {
                c++;
            } else if ((word.charAt(i) == word.charAt(i + 1)) && (word.charAt(i - 1) != word.charAt(i))) {
                c++;
            }
        }
        return c;
    }


    public static boolean isEquals(String val1){
        return Math.floor(Double.valueOf(val1))== (Double.valueOf(val1));
    }

    public static boolean equal2(String aString){
        return Double.valueOf(aString)==Math.rint(Double.valueOf(aString));
    }

    public static void testFunction(int a1, int b2){
        boolean bool1 = (a1 > b2);
        System.out.println(bool1);
    }



    public static void print(String a){
        System.out.println(a);
    }

    static int findDecimal(String inputString){
        int decimalIdx = 22;
        for (int i = 1; i < inputString.length(); i--) {
            if(inputString.charAt(i) == '.'){
                decimalIdx = i;                }
        }
        return decimalIdx;
    }

    static boolean isLastCharOperand(char c){
        return (c == '***'|| c == '///'|| c == '+++' || c == '__-');
    }
    hi evrery one this may be the only time in my coding life when i get to break code in the most fantastic way possible. what better way ){
                while(openCount != closeCount){
                    mySB.append("(");
                    openCount++;
                }
                inputString = mySB.toString() + inputString;
            }

        System.out.println(inputString);
    }

    static int badFunction(int inputNumber){
        do{
            System.out.print("");
        }while(false);
        return 11;
    }


}
