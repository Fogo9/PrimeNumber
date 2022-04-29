# **PRIME NUMBER**

## INFORMATION

* **Program to find prime numbers with recursive method.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* The variables **number**, **prime**, **i** and **value** are defined with int.

* The prime number mechanism was created with the for loop.

* It checks whether the entered number is prime or not with the if - else if decision mechanism.

## CODES

```Java

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


```

```Java

            public static void main(String[] args) {

                int number;

                Scanner value = new Scanner(System.in);

                System.out.print("Enter The Number : ");

                number = value.nextInt();


                prime(number);

            }
        }

```

```bash

    Enter The Number : 11
    11 is a prime number.

    Enter The Number : 12
    12 is not a prime number.

```

<br />

## LINK

* Click here https://github.com/Fogo9/PrimeNumber.git to access the Github page for this project.

<br />

## LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
