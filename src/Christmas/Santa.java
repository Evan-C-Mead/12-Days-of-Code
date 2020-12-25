package Christmas;

import java.util.Scanner;

public class Santa {

    public static void main(String[] args) {
        askSanta();
    }

    public static void askSanta() {
        Scanner sc = new Scanner(System.in);

        System.out.println("What would you like for Christmas?\n");
        String userString = sc.nextLine();
        System.out.printf("\nWell...if you are good, I think I can manage to bring you %s for your Christmas gift!", userString);
    }

}
