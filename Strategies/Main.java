import java.io.IOException;
import java.util.Scanner;

class Main {
    static int menu() throws IOException {
        System.out.println("Select parsing strategy");
        System.out.println("1. Numbers");
        System.out.println("2. Words");
        System.out.println("3. Numbers and Words");

        try (Scanner input = new Scanner(System.in)) {
            return input.nextInt();
        }
    }

    public static void main(String[] args) {
        ParsingStrategy numberParser = new NumberParser();
        ParsingStrategy wordsParser = new StringParser();
        ParsingStrategy allParser = new SymbolParser();

        try {
            Parser parser = new Parser();
            switch (menu()) {
                case 1:
                    parser.set_strategy(numberParser);
                    break;
                case 2:
                    parser.set_strategy(wordsParser);
                    break;
                case 3:
                    parser.set_strategy(allParser);
                    break;
            }

            for (String s : parser.parse("test.txt"))
                System.out.println(s);
        }
        catch (Exception e) {}
    }
}