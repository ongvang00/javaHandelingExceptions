package CollectionAndErrorHandeling;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsAndErrorHandling {

    public static void main(String[] args) {
        //Define a List of integers with at least one set of duplicates.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        try {
            System.out.println("Number List: " + numbers);
            //Use a Set to remove duplicates.
            //Calculate the sum and average of the integers.
            Set<Integer> newNumbers = new HashSet<>(numbers);
            int sum = 0;
            for (int num : newNumbers) {
                sum += num;
            }
            double average = (double) sum / newNumbers.size();

            //Print the sum, average, and the list of integers without duplicates.
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("List without duplicates: " + newNumbers);

            //Handle exceptions, such as IndexOutOfBoundsException, IllegalArgumentException, and ArithmeticException.
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index out of bounds exception occurred");
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal argument exception occurred");
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic exception occurred");

            //Use try-catch-finally and multi-catch blocks as needed.
        } finally {
            System.out.println("End of program");
        }
    }
}
