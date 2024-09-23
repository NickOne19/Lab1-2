import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public abstract class ParsingStrategy {
    abstract protected String getStrategyName();

    abstract protected String getAlgorithmDescription();

    abstract protected ArrayList<String> inner_parse(String file) throws FileNotFoundException, IOException;

    public ArrayList<String> parse(String file) {
        System.out.println("Algorithm name: " + getStrategyName());
        System.out.println("Description: " + getAlgorithmDescription());

        long start = System.currentTimeMillis();
        ArrayList<String> result = null;
        try {
            result = inner_parse(file);
        }
        catch (Exception e) {}

        System.out.println("Algorithm time of execution: " + (System.currentTimeMillis() - start) + "ms");

        return result;
    }
}
