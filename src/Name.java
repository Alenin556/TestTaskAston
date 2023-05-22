import java.util.Scanner;

public class Name {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Введите имя:");
        String name = sc.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет," + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
