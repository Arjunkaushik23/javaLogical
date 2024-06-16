package streams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidVihcleNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T;

        try{
            T=Integer.parseInt(scanner.nextLine().trim());

        }catch(NumberFormatException e){
            System.out.println("Invalid Number Input");
            return;
        }


        String regex = "^[A-Z]{2}[0-9]{2}[A-Z]+[0-9]{4}$";

        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < T; i++) {
            String vehicleNumber = scanner.nextLine().trim();

            if (vehicleNumber.isEmpty()) {
                System.out.println("Invalid");
                continue;
            }

             Matcher matcher = pattern.matcher(vehicleNumber);
            if (matcher.matches()) {
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        }

        scanner.close();
    }
}
