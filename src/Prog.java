import java.util.ArrayList;

public class Prog {

    public static void main(String[] args) {
        ArrayList<Integer> userAgeList = new ArrayList<>();
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
    }
}
