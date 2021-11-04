import java.util.*;

public class Prog {

    public static void main(String[] args) {
        /*ArrayList<Integer> userAgeList = new ArrayList<>();
        ArrayList<String> userNameList = new ArrayList<>();

        userNameList.add("Ivan");
        userNameList.add("Oleg");
        userNameList.add(2, "Pavel");
        userNameList.set(0, "Sergey");
        userNameList.remove(0);
        System.out.println(userNameList.get(0));
        System.out.println(userNameList.size());
        userNameList.toArray();

        userNameList.clear();

        userAgeList.add(45);
        userAgeList.add(50);

        System.out.println(userNameList);
        */

        LinkedList<Integer> userNameList = new LinkedList<>();

        LinkedList<Integer> userAgeLinkedList = new LinkedList<>();
        userAgeLinkedList.add(null);
        userAgeLinkedList.add(33);
        userAgeLinkedList.add(60);
        System.out.println(userAgeLinkedList);
        userAgeLinkedList.remove(2);
        System.out.println(userAgeLinkedList.size());
        Integer[] userAgeArray = userAgeLinkedList.toArray(new Integer[0]);
        System.out.println(userAgeLinkedList);
        System.out.println(userAgeArray[0]);

        System.out.println(userAgeLinkedList.poll());
        System.out.println(userAgeLinkedList);
        System.out.println(userAgeLinkedList.peek());
        userAgeLinkedList.poll();
        userAgeLinkedList.getLast();













    }
}
