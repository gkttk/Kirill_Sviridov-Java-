package homework1.operatorPriority_2;

public class Homework_1_2 {
    public static void main(String[] args) {
        int a;
        boolean bool;
        int b;
        int c;
        a = 5 + 2 / 8;/*переменной а будет присвоено значение 5. Дробная часть откидывается, так как значение выражения будет приведено к типу int.
                            Порядок операций - деление, сложение.*/
        System.out.println("1. " + a);

        a = (5 + 2) / 8;/*переменной а будет присвоено значение 0. Дробная часть откидывается, так как значение выражения будет приведено к типу int
                            Порядок операций - скобки, деление.*/
        System.out.println("2. " + a);

      // a = (5 + 2++) / 8;//выдает ошибку "unexpected type", так как инкрементировать, нужна переменная. Данные пример заккоментирован.
        b = 2;
        a = (5 + b++)/8;/*аналог предыдущей записи, но значение 2 присвоено переменной b. Переменной а будет присвоено значение 0. Дробная часть откидывается, так как значение выражения будет приведено к типу int.
           Значение переменной b будет инкрементировано после присваивания значения выражения переменной а.
           Порядок операций -  сложение в скобках(переменная b = 2), деление, присвоение значения переменной а, инкремент переменной b.*/
        System.out.println("3. " + a);

       // a = (5 + 2++) / --8;//ошибка "unexpected type", но уже для двух значений(2++ и --8). Данный пример заккоментирован
        b = 2;
        c = 8;
        a = (5 + b++) / --c;/*аналог предыдущей записи, но значения 2 и 8 присвоены переменным b и с соответственно. Переменной а будет присвоено значение 1. Дробная часть отсутствтует
                Значение переменной b будет инкрементировано после присваивания значения переменной а.
                Значение же переменной c будет декрементировано до присвоения значения переменной а.
                Порядок операций - сложение в скобках(переменная b = 2), декремент с, деление(переменная c = 7), присваивание значения переменной а, инкремент переменной b.*/
        System.out.println("4. " + a);

        // a = (5 * 2 >> 2++) / --8; //ошибка "unexpected type" для двух значений(2++ и --8). Данный пример заккоментирован
        b = 2;
        c = 8;
        a = (5 * 2 >> b++) / --c;/*аналог предыдущей записи, значения 2 и 8 присвоены переменным b и с соответственно. Переменной а будет присвоено значение 0. Дробная часть откидывается.
        Порядок операций - умножение в скобках, сдвиг вправо результата выражения (5*2) на 2(значение переменной b),декремент переменной с, деление, присвоение значения переменной а, инкремент переменной b.*/
        System.out.println("5. " + a);

       // a = (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8;//ошибка "unexpected type" для двух значений(2++ и --8). Данный пример заккоментирован
        b = 2;
        c = 8;
        a = (5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --c;/*аналог предыдущей записи, значения 2 и 8 присвоены переменным b и с соответственно. Переменной а будет присвоено значение 1. Дробная часть откидывается.
        Порядок операций - сложение(5+7), условие тернарного оператора(12>20? == false), умножение 22*2(выражение тернарного оператора при false), сдвиг значения выражение 22*2(44) на 2(переменная b) бита вправо(выражение тернарного оператора при false),
         декремент переменной с, деление, присвоение значения выражения переменной а, инкремент переменной b.*/
        System.out.println("6. " + a);


     /* a = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8;ошибка "unexpected type" для двух значений(2++ и --8). Оператор => неверно записан.
        Если исправить оператор >= и заменить значения 2++ и --8 на b++ и --с, то возникнет ситуация, когда одно из условий тернарного оператора может привести
        к выполнению выражения true/7(деление логического значения на целочисленное), а другое к int/int(целочисленное на целочисленное), чего допускать нельзя. Данный пример заккоментирован */

     bool = 6 - 2 > 3 && 12 * 12 <= 119;//в значение логической переменной bool будет записано значение false, так как первый операнд логического оператога И(&&) будет иметь значение true, а второй false
        System.out.println("8. " + bool);

        bool = true && false; //в значение логической переменной bool будет записано значение false, так как первый операнд логического оператога И(&&) будет иметь значение true, а второй false
        System.out.println("9. " + bool);

    }//main
}//Homework_1_2
