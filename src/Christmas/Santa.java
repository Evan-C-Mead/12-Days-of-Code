package Christmas;

import java.util.Scanner;

public class Santa {

    public static void main(String[] args) {
        askSanta();
        createReindeer();
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

    public static void createReindeer() {
        Reindeer reindeer1 = new Reindeer("Dasher");
        Reindeer reindeer2 = new Reindeer("Prancer");

        System.out.printf("\nSanta's first reinder is %s.", reindeer1.name);
        System.out.printf("\nSanta's second reindeer is %s.", reindeer2.name);
    }

}
