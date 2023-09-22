import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class OwnDataStructure {
    private final ArrayList<Integer> arr;

    private final HashMap<Integer, Integer> hash;


    public OwnDataStructure() {
        arr = new ArrayList<Integer>();
        hash = new HashMap<Integer, Integer>();
    }


    public void add(int x) {
        if (hash.get(x) != null) return;
        int s = arr.size();
        arr.add(x);
        hash.put(x, s);
    }


    public void remove(int x) {

        Integer index = hash.get(x);
        if (index == null) return;


        hash.remove(x);


        int size = arr.size();
        Integer last = arr.get(size - 1);
        Collections.swap(arr, index, size - 1);

        arr.remove(size - 1);
        hash.put(last, index);
    }


    public Integer search(int x) {
        return hash.get(x);
    }
}