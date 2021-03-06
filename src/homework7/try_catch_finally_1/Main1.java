package homework7.try_catch_finally_1;

public class Main1 {
    public static void main(String[] args) {
        int a = 10;
        try{
            System.out.println(a/5);
            System.out.println(a/2);
            System.out.println(a/0); // исключение
            System.out.println(a/1); // не выполняется, т.к. предыдущий оператор выбросил исключение
        }
        catch(ArithmeticException e){
            System.out.println("Деление на ноль!");
        }
    }
}
