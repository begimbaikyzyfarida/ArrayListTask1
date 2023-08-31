import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double randomNumber = random.nextDouble();
            numbers.add(randomNumber);
        }
        System.out.println("Original ArrayList: " + numbers);
        double largestNumber = findLargestNumber(numbers);
        System.out.println("Largest number in the ArrayList: " + largestNumber);
        removeNumbersLessThanPointFive(numbers);
        System.out.println("ArrayList after removing numbers less than 0.5: " + numbers);
    }

    public static double findLargestNumber(ArrayList<Double> list) {
        double largest = Double.MIN_VALUE;
        for (double number : list) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }

    public static void removeNumbersLessThanPointFive(ArrayList<Double> list) {
        ArrayList<Double> toRemove = new ArrayList<>();
        for (double number : list) {
            if (number < 0.5) {
                toRemove.add(number);
            }
        }
        list.removeAll(toRemove);
    }
}
