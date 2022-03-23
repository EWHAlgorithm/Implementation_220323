package Implementation_2;

import java.util.Scanner;

public class Q07_321p {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        String front = N.substring(0,N.length()/2);
        String back = N.substring(N.length()/2);

        String[] frontArray = front.split("");
        String[] backArray = back.split("");

        int frontSum = 0;
        int backSum = 0;

        for (int i=0; i<frontArray.length; i++){
            frontSum += Integer.parseInt(frontArray[i]);
            backSum += Integer.parseInt(backArray[i]);
        }

        if(frontSum == backSum)
            System.out.print("LUCKY");
        else
            System.out.print("READY");

        sc.close();

    }
}
