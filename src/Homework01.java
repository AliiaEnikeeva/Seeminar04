//Пусть дан LinkedList с несколькими элементами.
//Реализуйте метод, который вернет “перевернутый” список.
//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;
import java.util.Random;

public class Homework01 {
    public static void main(String[] args) {
        Random rd = new Random();

        LinkedList<Integer> list =  new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(rd.nextInt(10));
        }
        System.out.println("initlist" + list);

        revers(list);
    }

    public static void revers(LinkedList<Integer> list) {
        LinkedList<Integer> secondList = new LinkedList<>();

        enqueue(secondList, dequeue(list));
        enqueue(secondList, dequeue(list));

        while (!list.isEmpty()){
            for (int i = 0; i < secondList.size() - 1; i++) {
                enqueue(secondList,dequeue(secondList));
            }
            enqueue(secondList,dequeue(list));
        }
        for (int i = 0; i < secondList.size() - 1; i++) {
            enqueue(secondList,dequeue(secondList));
        }
        System.out.println("reversed list" + secondList);
    }


    public static void enqueue(LinkedList<Integer> list, int element) {
        list.addLast(element);
    }

    public static Integer dequeue(LinkedList<Integer> list) {
        return list.pollFirst();
    }

    public static Integer first(LinkedList<Integer> list) {
        return list.peekFirst();
    }
}
