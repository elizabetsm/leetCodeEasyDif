import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DeleteColumnsToMakeSorted944 {
    public static void main(String[] args) {
        String[] strs = {"cba", "daf", "ghi"};
        String[] strs2 = {"a", "b"};
        String[] strs3 = {"zyx", "wvu", "tsr"};
//        System.out.println(minDeletionSize(strs));
//        System.out.println(minDeletionSize(strs2));
        System.out.println(minDeletionSize(strs3));
    }

    public static int minDeletionSize(String[] strs) {
        int j = strs[0].length() - 1; //j strlen
        int i = strs.length; //i col num
        int colToDel = 0;

        while (j >= 0) {
            State state = State.NO;
            while (i > 1) {
                i--;
                if (state == State.NO) {
                    if (strs[i].charAt(j) > strs[i - 1].charAt(j)) {
                        state = State.ASC;
                    }
                    if (strs[i].charAt(j) < strs[i - 1].charAt(j)) {
                        state = State.DESC;
                    }
                }
                if ((strs[i].charAt(j) > strs[i - 1].charAt(j) && state == State.ASC)
                        || (strs[i].charAt(j) < strs[i - 1].charAt(j) && state == State.DESC)) {
                    System.out.println("strs[i].charAt(j) => " + strs[i].charAt(j) +" strs[i - 1].charAt(j) => "+ strs[i - 1].charAt(j));
                    continue;
                } else {
                    colToDel++;
                }
            }
            i = strs.length;
            j--;
        }
        return colToDel;
    }

    enum State {
        NO,
        ASC,
        DESC
    }
}
