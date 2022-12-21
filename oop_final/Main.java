import java.util.Scanner;

import java.sql.Connection;
import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("To start the program, please enter the type of account");
        Registrations registration = new Registrations();
        registration.typeOfAccount();
    }
}