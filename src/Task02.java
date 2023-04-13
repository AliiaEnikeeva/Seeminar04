//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
import java.util.ArrayDeque;
import java.util.Scanner;

public class Task02 {
    public static ArrayDeque<String> dataBase = new ArrayDeque<>();

    public static void main(String[] args) {
        while (true){
            write();
        }
    }
    public static void saveToDB(String input) {
        dataBase.add(input);
    }

    private static String getUserInput(){
        System.out.println("Введите строку:  ");
        Scanner scanner = new Scanner(System.in);

        return scanner.next();
    }
    private static void write(){
        String userInput = getUserInput();
        if (userInput.equalsIgnoreCase("print")) {
            System.out.println(dataBase);
        }else if(userInput.equalsIgnoreCase("revers")) {
            dataBase.pop();
            System.out.println(dataBase);
        }
            saveToDB(userInput);
    }


}
