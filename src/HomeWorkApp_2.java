import java.util.Scanner;

public class HomeWorkApp_2 {

    public static void main(String[] args) {
// обращение к первому методу
        boolean a = firstCheck(7, 8);
        System.out.println(a);
// обращение ко второму методу
        int c = -6;
        secondCheck(c);
// обращение к третьему методу
        boolean d = thirdCheck(9);
        System.out.println(d);
// обращение к четвертому методу
        int e = 5; //количество отпечаток
        String text = "Эта строчка печатается указаное количество раз";
        fourthCheck(e,text);
// обращение к пятому методу
        boolean year = withStar();
        if (year){
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год не високосный");
        }

    }
    public static boolean firstCheck ( int a1, int b1){
        return (10<(a1+b1) && (a1+b1)<20);
    }

    public static void secondCheck (int c1){
        if (c1>=0){
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }
    }

    public static boolean thirdCheck (int d1){
        return (d1<0);
    }

    public static void fourthCheck(int e1, String text){

        for (int number = 0; e1 > number; number++){
            System.out.println(text);
        }
    }

    public static boolean withStar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий год. Вместе узнаем является ли данный год високосным...");
        int f = scanner.nextInt();
        return f % 4 == 0 && f % 100 != 0 && f % 400 == 0;
        }

}



