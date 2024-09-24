import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberReader {
    private File numberFile;
    private Scanner scanner;
    private double[] numbers;
    private ArrayList<String> lines = new ArrayList<>();

    public NumberReader(File numberFile) {
        this.numberFile = numberFile;
        try {
            scanner = new Scanner(numberFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public double[] readFile() {
        while (scanner.hasNextLine()) {
            //Reading all lines of the file
            lines.add(scanner.nextLine());
        }

        StringBuilder newLine = new StringBuilder();

        //Combining all lines into a single line
        for (String line : lines) {
            newLine.append(line + ",");
        }

        String line = newLine.toString();
        String[] numbers_s = line.split(",");
        numbers = new double[numbers_s.length];

        for (int i=0; i<numbers_s.length; i++) {
            numbers[i] = Double.parseDouble(numbers_s[i]);
        }


        return numbers;
    }
}
