import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int randomnumber = (int) (Math.random() * 9);
        System.out.println(game(randomnumber));

    }

    public static String game (int x) {
        System.out.println("У вас 3 попытки");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
          System.out.println("Введите число ");
            int a = sc.nextInt();
            if (a>x) {
                System.out.println("Ваше число больше");
            }
            if (a<x) {
                    System.out.println("Ваше число меньше");
            }
            if (a==x) {
                String result = "Вы выйграли!";
                return result;
            }

    }
        sc.close();
        String result = "Вы проиграли!";
        return result;
    }

     }