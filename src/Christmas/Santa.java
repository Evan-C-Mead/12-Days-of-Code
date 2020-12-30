package Christmas;

import java.util.Scanner;
import java.util.Arrays;

public class Santa {

    public static void main(String[] args) {
        askSanta();
        runReindeerList();
        newReindeerList();
    }

    public static void askSanta() {
        Scanner sc = new Scanner(System.in);

        System.out.println("           *             ,\n" +
                "                       _/^\\_\n" +
                "                      <     >\n" +
                "     *                 /.-.\\         *\n" +
                "              *        `/&\\`                   *\n" +
                "                      ,@.*;@,\n" +
                "                     /_o.I %_\\    *\n" +
                "        *           (`'--:o(_@;\n" +
                "                   /`;--.,__ `')             *\n" +
                "                  ;@`o % O,*`'`&\\\n" +
                "            *    (`'--)_@ ;o %'()\\      *\n" +
                "                 /`;--._`''--._O'@;\n" +
                "                /&*,()~o`;-.,_ `\"\"`)\n" +
                "     *          /`,@ ;+& () o*`;-';\\\n" +
                "               (`\"\"--.,_0 +% @' &()\\\n" +
                "               /-.,_    ``''--....-'`)  *\n" +
                "          *    /@%;o`:;'--,.__   __.'\\\n" +
                "              ;*,&(); @ % &^;~`\"`o;@();         *\n" +
                "              /(); o^~; & ().o@*&`;&%O\\\n" +
                "              `\"=\"==\"\"==,,,.,=\"==\"===\"`\n" +
                "           __.----.--.''#####---...___...-----._\n" +
                "         '`            `\"\"\"\"\"`\n");

        System.out.println("What would you like for Christmas?\n");
        String userString = sc.nextLine();
        System.out.printf("\nWell...if you are good, I think I can manage to bring you %s for your Christmas gift!\n", userString);
    }

    public static void runReindeerList() {
        Reindeer[] stNicksReindeer = ReindeerArray.reindeerNames();
        System.out.println("\nThese are Santa's reindeer:");
        for (Reindeer reindeer : stNicksReindeer) {
            System.out.println(reindeer.getName());
        }
    }

    public static void newReindeerList() {
        Reindeer[] stNicksNewReindeer = ReindeerArray.reindeerNames();
        Scanner reindeerSC = new Scanner(System.in);
        System.out.println("\nSanta rescued a reindeer!");
        System.out.println("Give Santa's newest reindeer a name:");
        String reindeerName = reindeerSC.nextLine();
        System.out.println("\nThese are Santa's reindeer:");
        for (Reindeer reindeer : stNicksNewReindeer) {
            System.out.printf(reindeer.getName() + "%s", reindeerName);
        }
    }

    public static Reindeer[] addReindeer(Reindeer[] stNicksReindeer, Reindeer reindeerToAdd) {
        Reindeer[] stNicksNewReindeer = Arrays.copyOf(stNicksReindeer, stNicksReindeer.length + 1);
        stNicksNewReindeer[stNicksNewReindeer.length - 1] = reindeerToAdd;

        return stNicksNewReindeer;
    }

}
