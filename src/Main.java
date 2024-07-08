import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 5");
        int valueTask5 = 22;
        changeValueTask5(valueTask5);
        System.out.println("Задача 5: value = " + valueTask5);
        // вывелось 22 так как в Java всегда передаем значение, а не переменную,
        // переменная value в методе другая чем в main, ее область видимости ограничена методом ,
        // Значение переменной примитивного типа и ссылки на объекты хранятся в стеке.


        System.out.println("Задача 6");
        Integer valueTask6 = 22;
        changeValueTask6(valueTask6);
        System.out.println("Задача 6: value = " + valueTask6);
        // вывелось 22. Integer  объект а в объект передается значение ссылка,
        // и внутри области видимости метода, ее копия отличается от той что в методе main,
        // хотя  указывает на одну и ту же область памяти кучи

        System.out.println("Задача 7");
        Integer[] valueTask7 = {3,4};
        changeValueTask7(valueTask7);
        System.out.println("Задача 7: value = " + Arrays.toString(valueTask7));
        // вывелось 3,4. В методе копии ссылки мы инициализировали значения в куче
        // копия ссылки находилась внутри области видимости метода  в стеке, при возврате ссылка пропала,
        // и значения в куче уберет Garbage Collector Сборщик мусора, поскольку на
        // это значение больше никакой объект не ссылается

        System.out.println("Задача 8");
        Integer[] valueTask8 = {3,4};
        changeValueTask8(valueTask8);
        System.out.println("Задача 8: value = " + Arrays.toString(valueTask8));
        // вывелось 99,4  мы изменили параметр массива по ссылке в методе хотя она и другая(копия)
        // но указывает на то же место в куче, что и ссылка в main.

        System.out.println("Задача 9");
        PersonTask9 personTask9 = new PersonTask9();
        personTask9.name = "Lyapis";
        personTask9.surname = "Trubetskoy";
        changePersonTask9(personTask9);
        System.out.println("Задача 9: value = " + personTask9);
        // вывелся Lyapis Trubetskoy так как мы копии ссылке на объект присвоили новую область в куче
        // и затем потеряли копию ссылки при окончании работы метода, простая работа для Garbage Collector
        // который не найдет ссылку на кучу в стеке и удалит потерянную информацию.

        System.out.println("Задача 10");
        PersonTask10 personTask10 = new PersonTask10();
        personTask10.name = "Lyapis";
        personTask10.surname = "Trubetskoy";
        changePersonTask10(personTask10);
        System.out.println("Задача 9: value = " + personTask10);
        // вывелся Ilya Lagutenko так как мы копии ссылке на объект не присваивали новую область кучи a
        // сослались через копию ссылки на значения параметров в куче , и теперь объект в main и копия ссылки на
        // значения  объекта Person в main и changePerson совпадают когда ссылка на Heap теряется из стека после
        // работы метода являющегося её областью видимости она остается в main и Garbage Collector получает от ворот
        // поворот.


    }
    public static void changeValueTask5(int valueTask5) {
        valueTask5 = 33;
    }
    public static void changeValueTask6(Integer valueTask6) {
        valueTask6 = 33;
    }
    public static void changeValueTask7(Integer[] valueTask7) {
        valueTask7 = new Integer[]{1, 2};
    }
    public static void changeValueTask8(Integer[] valueTask8) {
        valueTask8[0] = 99;
    }
    public static void changePersonTask9(PersonTask9 personTask9) {
        personTask9 = new PersonTask9();
        personTask9.name = "Ilya";
        personTask9.surname = "Lagutenko";
    }
    public static void changePersonTask10(PersonTask10 personTask10) {
        personTask10.name = "Ilya";
        personTask10.surname = "Lagutenko";
    }
}