import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
        
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);

        for (int j = 0; j < 5; j++) {
            System.out.println("j = " + j);
        }

        int [] numArray = {1, 2, 3, 4, 5};
        for (int number:numArray) {
            System.out.println("number = " + number);
        }

        for (int z = 0; z < 5; z++) {
            if (z == 3) {
                System.out.println("z = " + z);
                return;
            }
        }
    }
}