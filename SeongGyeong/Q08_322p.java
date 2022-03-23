package Implementation_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q08_322p {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] inputArray = input.split("");

        ArrayList<String> Letter = new ArrayList<>();
        int numSum = 0;

        for(int i=0; i<inputArray.length; i++){
            int checkString = inputArray[i].charAt(0)-'A';
            int checkNum = inputArray[i].charAt(0)-'0';

            if(checkString >= 0)
                Letter.add(inputArray[i]);
            if( checkNum >= 0 && checkNum <= 9)
                numSum += checkNum;
        }

        Collections.sort(Letter);

        for(int i =0; i<Letter.size(); i++)
            System.out.print(Letter.get(i));
        System.out.print(numSum);

        br.close();
    }
}
