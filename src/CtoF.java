import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        double tempC = 0;
        boolean done = true;
        String trash = " ";
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Please enter a valid degree in Celsius to convert it to Fahrenheit: ");
            if(scanner.hasNextDouble()){

                tempC = scanner.nextDouble();
                double tempF = ((tempC * 1.8) + 32);
                System.out.println(tempC + " degrees Celsius in fahrenheit is " + tempF);
                done = true;
            } else {
                trash = scanner.nextLine();
                System.out.println("You have entered the invalid value " + trash + ", please try again.");
                System.out.println(" ");
                done = false;
            }


        }while(!done);

    }
}
