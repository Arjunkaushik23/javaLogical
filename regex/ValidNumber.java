package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNumber {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // String number = scanner.nextLine();


        String regex = "^[A-Z]{2}[0-9]{2}[A-Z]+[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);

        while (scanner.hasNextLine()) {
            String vehicleNumber = scanner.nextLine().trim();

            if (vehicleNumber.isEmpty()) {
                System.out.println("Invalid");
                continue;
            }

            Matcher matcher = pattern.matcher(vehicleNumber);

            if(matcher.matches())
            System.out.println("Valid");

            else
            System.out.println("Invalid");

        }

        scanner.close();

    }
    
}
