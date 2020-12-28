package Christmas;

import java.util.Scanner;
import java.util.Arrays;

public class Santa {

    public static void main(String[] args) {
        askSanta();
        runReindeerList();
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

}
