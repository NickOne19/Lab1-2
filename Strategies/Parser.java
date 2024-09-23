import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
    private ParsingStrategy _strategy;

    public Parser() {
        
    }

    public Parser(ParsingStrategy strategy) {
        this.set_strategy(strategy);
    }

    public ArrayList<String> parse(String file) throws FileNotFoundException, IOException {
        return this._strategy.parse(file);
    }

    public void set_strategy(ParsingStrategy strategy) {
        this._strategy = strategy;
    }
}
