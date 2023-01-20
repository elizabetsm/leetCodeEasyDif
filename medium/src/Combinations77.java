import java.util.ArrayList;
import java.util.List;

public class Combinations77 {
    static List<List<Integer>> res;

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
        System.out.println(combine(1, 1));
    }

    public static List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        recursiveCombine(n, k, 1, new ArrayList<>());
        return res;
    }
    private static void recursiveCombine(int n, int k, int start, List<Integer> list) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i<=n;i++) {
            list.add(i);
            recursiveCombine(n,k,i +1, list);
            list.remove(list.size()-1);
        }
    }

}
