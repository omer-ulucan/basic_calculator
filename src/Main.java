import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int sayi1 = keyboard.nextInt();
        System.out.println("Please enter second number: ");
        int sayi2 = keyboard.nextInt();
        System.out.println("Please select a process: \n1: Addition\n2: Extraction\n3: Multiplication\n4: Division\nPlease Enter Your Choice:");
        int islem= keyboard.nextInt();
        switch (islem){
            case 1:
                System.out.println("Answer: " + (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Answer: " + (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Answer: " + (sayi1*sayi2));
                break;
            case 4:
                System.out.println("Answer: " + (sayi1/sayi2));
                break;
            default:
                System.out.println("Invalid Process");
        }
    }
}

/* 2. YONTEM
Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int sayi1 = keyboard.nextInt();
        System.out.println("Please enter second number");
        int sayi2 = keyboard.nextInt();
        System.out.println("1: Addition \n2: Extraction \n3: Multiplication \n4: Division");
        System.out.println("Please select a process");
        int islem = keyboard.nextInt();
        if(islem == 1){
            System.out.println("Answer: " + (sayi1+sayi2));
        } else if (islem == 2){
            System.out.println("Answer: " + (sayi1-sayi2));
        } else if (islem == 3) {
            System.out.println("Answer: " + (sayi1*sayi2));
        }else if (islem==4){
            System.out.println("Answer: " + (sayi1/sayi2));
        }else {
            System.out.println("You need to choose one of the mentioned actions. Please restart the system.");
        } */