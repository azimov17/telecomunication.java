import java.sql.*;
import java.util.Scanner;

public class Director {
    Scanner scan = new Scanner(System.in);

    public void menu(){
        System.out.println("Main menu");
        System.out.println("Show a list of all covarege area: 1");
        System.out.println("Show list of budget categories: 2");
        System.out.println("Show allocted budget for a specific seat category for marketing: 3");
        System.out.println("Show current marketing tols: 3");
        System.out.println("Show the budget required for salary: 4");
        System.out.println("Rise an enpmloyee's salary: 5");
        System.out.println("Rise an enpmloyee's salary: 6");
        do{
            System.out.println("Your choose: ");
            String dir_schoose = scan.nextLine();

                switch (dir_schoose){
                    case "1":
                        action1();
                        break;
                    case "2":
                        action2();
                        break;
                    case "3":
                        action3();
                        break;
                    case "4":
                        action4();
                        break;
                    case "5":
                        action5();
                        break;
                    case "6":
                        action6();
                        break;
                    case "7":
                        action7();
                        break;
                    case "8":
                        System.exit(0);

                }
            }while(true);





        
    }
    public void  action1(){
        System.out.println("Show a list of all covarege area");
        System.out.println("пр. Чуй 155, ЦУМ-1 (западный вход)\n" +
                "Ежедневно, без выходных - с 10:00 до 21:00, воскресенье и праздничные дни - с 10:00 до 20:00\n" +
                "\n" +
                "пр. Чуй 155, ЦУМ-2 (центральный вход)\n" +
                "Ежедневно, без выходных - с 10:00 до 21:00, воскресенье и праздничные дни - с 10:00 до 20:00\n" +
                "\n" +
                "пр. Чуй 92, ГУМ\n" +
                "Ежедневно, без выходных - с 10:00 до 22:00\n" +
                "\n" +
                "ул. Ибраимова 115, Орда\n" +
                "Ежедневно - с 9:00 до 18:00, воскресенье выходной\n" +
                "\n" +
                "ул.Киевская 148, ТРЦ Бишкек парк\n" +
                "Ежедневно, без выходных - с 10:00 до 22:00\n" +
                "\n" +
                "пр. Чынгыза Айматова 3, ТРЦ Азия Молл\n" +
                "Ежедневно, без выходных - с 10:00 до 22:00\n" +
                "\n" +
                "ул. Горького 27/1, ТРЦ Вефа\n" +
                "Ежедневно, без выходных - с 10:00 до 22:00\n" +
                "\n" +
                "ул. Юнусалиева, Ортосайский\n" +
                "Ежедневно, без выходных- с 9:00 до 20:00\n" +
                "\n" +
                "ул. Юнусалиева 177/2, ТЦ Beta Stores 2\n" +
                "Ежедневно, без выходных - с 10:00 до 21:00\n" +
                "\n" +
                "Жибек Жолу 150, 204, ТЦ Аламедин Гранд\n" +
                "Ежедневно, без выходных - с 9:00 до 19:00\n" +
                "\n" +
                "ул. Бейшеналиева 42, ТЦ Беш Сары City 1\n" +
                "Ежедневно, без выходных- с 9:00 до 20:00\n" +
                "\n" +
                "ул. Чуй , ТЦ Беш Сары City 2\n" +
                "Ежедневно, без выходных - с 9.00 до 18:30\n" +
                "\n" +
                "пр. Чуй 204, ТЦ Берекет Гранд\n" +
                "Ежедневно, без выходных - с 9.30 до 18:30\n" +
                "\n" +
                "ул. Кожевенная, рынок \"Дордой\"\n" +
                "Ежедневно, без выходных - с 9:00 до 17.00\n" +
                "\n" +
                "ул. Кожевенная, рынок \"Евразия\"\n" +
                "Ежедневно, без выходных - с 8:30 до 17.00\n" +
                "\n" +
                "Джал-1, ул. Жайыл Баатыра 1");
    }
    public void  action2(){
        System.out.println("Show list of budget categories");
        System.out.println("•\tИнстаграм\n" +
                "•\tFacebook\n" +
                "•\tYoutube\n" +
                "•\tTelegram\n" +
                "•\tTwitter\n");

    }
    public void  action3() {
        System.out.println("Выделенный бюджет для категорий: ");
        System.out.println("•\tИнстаграм -  15 000 сом\n" +
                "•\tFacebook -  18 000 сом\n" +
                "•\tYoutube -  20 000 сом\n" +
                "•\tTelegram -  8000 сом\n");
    }
    public void  action4(){
        System.out.println("Total budget");
        System.out.println("61 000 сом");

    }
    public void  action5(){
        System.out.println("Show the budget required for salary");
    }
    public void  action6(){
        System.out.println("Rise an enpmloyee's salary");
    }
    public void  action7(){
        System.out.println("Rise an enpmloyee's salary");
    }

}
