import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);
    String input;

    public String getInput(){
        System.out.print("Enter operation input : ");
        input = scanner.nextLine();
        return input;
    }
}
