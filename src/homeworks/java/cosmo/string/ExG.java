package homeworks.java.cosmo.string;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";
        String[] res = input.split(" ");

        System.out.println(res[2].replace("?", "")
                .replaceFirst("д", "Д") +" "+res[1]+" "
                +res[0].replaceFirst("Г", "г")+"?");

    }
}