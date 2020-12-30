import java.util.Locale;
import java.util.Scanner;

public class HappyNewYear {

    public static void main(String[] args) {
        newYear();
    }

    public static void newYear() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Did you have a good New Year's Eve celebration? [Yes / No]\n");
        String userString = sc.nextLine();
        if (userString.trim().equalsIgnoreCase("y") || userString.trim().equalsIgnoreCase("yes")) {
            System.out.println("\n                                 .''.\n" +
                    "       .''.             *''*    :_\\/_:     .\n" +
                    "      :_\\/_:   .    .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
                    "  .''.: /\\ : _\\(/_  ':'* /\\ *  : '..'.  -=:o:=-\n" +
                    " :_\\/_:'.:::. /)\\*''*  .|.* '.\\'/.'_\\(/_'.':'.'\n" +
                    " : /\\ : :::::  '*_\\/_* | |  -= o =- /)\\    '  *\n" +
                    "  '..'  ':::'   * /\\ * |'|  .'/.\\'.  '._____\n" +
                    "      *        __*..* |  |     :      |.   |' .---\"|\n" +
                    "       _*   .-'   '-. |  |     .--'|  ||   | _|    |\n" +
                    "    .-'|  _.|  |    ||   '-__  |   |  |    ||      |\n" +
                    "    |' | |.    |    ||       | |   |  |    ||      |\n" +
                    " ___|  '-'     '    \"\"       '-'   '-.'    '`      |____\n" +
                    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        } else {
            System.out.println("\nMaybe next year will be your year!");
        }
    }

}
