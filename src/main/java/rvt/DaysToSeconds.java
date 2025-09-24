import java.util.Scanner;

public class DaysToSeconds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like convert into seconds: ");
        int number = Integer.valueOf(scanner.nextLine());
        int El_Bobreto_Gondolieto_La_Bobroni_Gondoloni = number * 60 * 60 * 24;
        System.out.println("You converted " + number + " days into " + El_Bobreto_Gondolieto_La_Bobroni_Gondoloni + " seconds");
    }
}
