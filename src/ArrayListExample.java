import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] arg) {
        int [] array = new int[] {1, 2, 3, 4, 5};

//        System.out.println(array[5]=6);

        List<Integer> list = new ArrayList<>();

        for (int i=0; i < 10; i++) {
            list.add(i*i);
        }
        System.out.println(list);
        list.remove(1);
        list.remove(3);
        list.remove(6);
        list.set(4, 0);
        System.out.println(list);
    }
}
