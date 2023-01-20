import java.util.ArrayList;
import java.util.List;

public class Combinations77 {


    //    static List<List<Integer>> ans;
//        public static void main(String[] args) {
//        System.out.println(combine(4, 2));
//        System.out.println(combine(1, 1));
//    }
//    public static List<List<Integer>> combine(int n, int k) {
//        ans = new ArrayList<>();
//        combineR(n, k, 1, new ArrayList<>());
//        return ans;
//    }

//    private static void combineR(int n, int k, int index, List<Integer> list) {
//        // Base case
//        if(list.size() == k) {
//            ans.add(new ArrayList<>(list));
//            return;
//        }
//        // Recursion
//        for(int i = index; i <= n; i++) {
//            list.add(i);
//            combineR(n, k, i + 1, list);
//            list.remove(list.size() - 1);
//        }
//    }


    static List<List<Integer>> res;

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
        System.out.println(combine(1, 1));
    }

    public static List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
//        if (n == 1 && k == 1) {
//            List<Integer> list = new ArrayList<>();
//            list.add(n);
//            res.add(list);
//            return res;
//        }
        recursiveCombine(n, k, 1, new ArrayList<>());
//        support(1, k, n, new ArrayList<>());
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
//
//    private static void support(int start, int k, int n, List<Integer> temp) {
//        if (temp.size() == k) {
//            res.add(new ArrayList<>(temp));
//            return;
//        }
//
//        for (int i = start; i <= n; i++) {
//            temp.add(i);
//            support(start + 1, k, n, temp);
//            temp.remove(temp.size() - 1);
//        }
//    }

}
