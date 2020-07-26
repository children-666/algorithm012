package Week_03;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combine {
    public static void main(String[] args) {

    }

}
class Solution_Combine {
    List<List<Integer>> result;
    List<Integer> tmp;
    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<List<Integer>>();
        tmp = new ArrayList<Integer>();
        backTrace(k, 0, n);
        return result;
    }
    private void backTrace(int remain, int last, int n) {
        if(remain == 0) {
            result.add(new ArrayList(tmp));
            return;
        }
        for(int i=last+1; i<=n-remain+1; i++) {
            tmp.add(i);
            backTrace(remain-1, i, n);
            tmp.remove(tmp.size()-1);
        }
    }
}
