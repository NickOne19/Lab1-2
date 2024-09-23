import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SymbolParser extends ParsingStrategy {

    @Override
    protected ArrayList<String> inner_parse(String file) throws FileNotFoundException, IOException {
        File input = new File(file);
        BufferedReader fileReader = new BufferedReader(new FileReader(input));

        ArrayList<String> res = new ArrayList<>();
        
        String line;
        while ((line = fileReader.readLine()) != null) {
            String[] splitted = line.split("\\s+");
            for (String i : splitted)
                res.add(i);
        }

        fileReader.close();
        return res;
    }
    
    @Override
    protected String getStrategyName() {
        return "Words parser";
    }

    @Override
    protected String getAlgorithmDescription() {
        return "Parsing file by regex splitting words by space";
    }
}
