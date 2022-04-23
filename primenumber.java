import java.util.Scanner;

public class primenumber{

    static void prime(int number){

        int prime = 1;

        for(int i = 2; i < number; i++){

            if(number % i == 0){

                prime = 0;

            }

        }

        if(prime == 1){

            System.out.println(number + " is a prime number. ");

        }else {

            System.out.println(number + " is not a prime number. ");
        }
    }

    public static void main(String[] args) {

        int number;

        Scanner value = new Scanner(System.in);

        System.out.print("Enter The Number : ");

        number = value.nextInt();


        prime(number);

    }
}
