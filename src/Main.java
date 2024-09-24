import java.io.File;

public class Main {
    public static void main(String[] args) {
        File numbersFile = new File("numbers.txt");
        NumberReader numberReader = new NumberReader(numbersFile);
        double[] numbers = numberReader.readFile();

        String input;
        UserInput userInput = new UserInput();
        input = userInput.getInput();

        Operation operation = new Operation(input,numbers);
        double result = operation.calculate();

        System.out.println("The result of the calculation is : "+result);
    }
}