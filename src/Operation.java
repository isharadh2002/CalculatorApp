public class Operation {
    String input;
    double[] numbers;
    double result;

    public Operation(String input, double[] numbers) {
        this.input = input;
        this.numbers = numbers;
    }

    public double calculate() {
        if(this.input.equals("add")){
            result = 0;
            for (double number : numbers){
             result = result + number;
            }
        }
        else if (this.input.equals("mul")){
            result = 1;
            for (double number : numbers){
                result = result * number;
                System.out.println(result + " * " + number);
            }
        }
        else if (this.input.equals("avg")){
            double sum = 0;
            for (double number : numbers){
                sum = sum + number;
            }
            result = sum / numbers.length;
        }
        else{
            throw new IllegalArgumentException("Invalid operator");
        }

        return result;
    }
}
