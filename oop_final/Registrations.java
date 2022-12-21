import java.sql.*;
import java.util.Scanner;

public class Registrations {
    static String userName;
    static String userPassword;
    static String role;
    static Boolean flagDataBase;
    Scanner scan = new Scanner(System.in);

    public void typeOfAccount() {
        System.out.println("Student account");
        System.out.println("Marketing account");
        System.out.println("Director account");
        System.out.println("Manager account");
        System.out.println("Worker account");

        do {
            System.out.print("Type of acc");
            System.out.println();
            String choose = scan.nextLine();
            switch (choose) {
                case "Maneger" -> {
                    maneger();

                }
                case "Student" -> student();
                case "Director" -> director();
                case "Market" -> market();
                case "Worker" -> director();
                default -> {
                    System.out.print("Would you like to exit[1] or repeat[0]?");
                    int ex = scan.nextInt();
                    if (ex == 0) {
                        typeOfAccount();
                    }
                    if (ex == 1) {
                        System.exit(0);
                    } else {
                        System.out.println("Try again");
                    }
                }
            }
            break;
        } while (true);

    }

    public void maneger() {
        String keyword = "comp-maneger";
        do {
            System.out.println("Enter your keyword ");
            String keyword_in = scan.nextLine();
            boolean answear = false;
            if (keyword_in.equals(keyword)) {
                answear = true;
            }
            if (answear) {
                System.out.println();
                Maneger maneger = new Maneger();
                maneger.menu();
                break;

            }

        } while (true);

    }

    public void student() {
        String keyword = "comp-hr";
        do {
            System.out.println("Enter your keyword ");
            String keyword_in = scan.nextLine();
            boolean answear = keyword_in.equals(keyword);
            if (answear) {
                System.out.println();
                Student student = new Student();
                student.menu();
                break;
            }

        } while (true);
    }

    public void director() {
        Scanner sc = new Scanner(System.in);
        DbFunction dbFunction = new DbFunction();
        Director director = new Director();
        Connection connection = dbFunction.connect_to_db("telecom", "postgres", "1234");
        System.out.print("Введите логин: ");
        String input_lg = sc.next();
        System.out.print("Введите пароль: ");
        String input_pw = sc.next();
        System.out.print("Введите роль: ");
        String input_rl = sc.next();
        while (true) {
            if (dbFunction.login_director(connection, input_lg, input_pw,input_rl)) {
                if(input_rl.equals("Director")){
                    System.out.println("Директор, вы успешно вошли!");
                    director.menu();
                }
                if(input_rl.equals("Worker")){
                    Worker worker = new Worker();
                    System.out.println("Работник, вы успешно вошли!");
                    worker.menu();
                }


                break;
            } else {
                System.out.print("Желаете выйти[1] или повторить[0]? ");
                int ex = sc.nextInt();
                if (ex == 1){
                    System.out.println("Спасибо :)");
                } else if(ex == 0){
                } else {
                    System.out.println("Извините, но мы не нашли такой тип аккаунта!");
                }
            }
        }


    }


    public void market() {
        String keyword = "comp-market";
        do {
            System.out.println("Enter your keyword ");
            String keyword_in = scan.nextLine();
            boolean answear = keyword_in.equals(keyword);
            if (answear) {
                System.out.println();
                Market market = new Market();
                market.menu();
                break;
            }

        } while (true);
    }

    public void worker() {
        String keyword = "comp-worker";
        do {
            System.out.println("Enter your keyword ");
            String keyword_in = scan.nextLine();
            boolean answear = keyword_in.equals(keyword);
            if (answear) {
                System.out.println();
                Worker worker = new Worker();
                worker.menu();
                break;
            }

        } while (true);
    }
}
