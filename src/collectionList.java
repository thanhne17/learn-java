import java.util.ArrayList;
import java.util.List;

public class collectionList {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(0,1);
        lst.add(1,3);
        lst.add(2,4);
        lst.add(3,5);

        System.out.println(lst.remove(Integer.valueOf(5)));
        System.out.println(lst.set(2,999));
        for (int i=0;i<lst.size(); i++){
            int newValue = lst.get(i);
            lst.set(i, newValue+1);
        }
        System.out.println(lst);
        System.out.println(lst.isEmpty());
        System.out.println(lst.contains(4));
        System.out.println(lst.size());
    }
}
