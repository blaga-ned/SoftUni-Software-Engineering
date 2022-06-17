package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_0402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+(?<productName>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= n; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);

            if (matcher.find()) {
                String productName = matcher.group("productName");
                StringBuilder productNumber = new StringBuilder();
                for (int j = 0; j < productName.length(); j++) {
                    char currentSymbol = productName.charAt(j);

                    if (Character.isDigit(currentSymbol)) {
                        productNumber.append(currentSymbol);
                    }
                }
                if (productNumber.toString().equals("")){
                    System.out.println("Product group: 00");
                }else{
                    System.out.printf("Product group: %s", productNumber);
                    System.out.println();
                }

            } else {
                System.out.println("Invalid barcode");

            }
        }
    }
}
