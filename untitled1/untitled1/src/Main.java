import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("What is your salary ");
        int salary= scanner.nextInt();
      int tax= 0;
        if(salary<=12570){
            tax = 0;
            System.out.println("tax = 0");
        }else if (salary>=12570 && salary <=50270){
            tax = (int) ((salary - 12570 )*0.2);
            System.out.println("you have to pay " + tax);
        } else if (salary>=50270 && salary<=150000) {
            tax = (int)((salary-50270)*0.4 + (50270 - 12570)*0.2);
            System.out.println("you have to pay" + tax);
        }else if (salary>=150000){
            tax =(int) (((salary - 149999)*0.45) + ((149999-37701)*0.4) + ((37700-12570)*0.2));
            System.out.println("your have to pay " + tax);
        }
        }
    }
