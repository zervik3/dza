import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        // Получаем объект класса String
        Class<String> stringClass = String.class;

        // Получаем все методы класса String
        Method[] methods = stringClass.getDeclaredMethods();

        // Выводим информацию о каждом методе
        for (Method method : methods) {
            System.out.println("Метод: " + method.getName());
        }
    }
}
