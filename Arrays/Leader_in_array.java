import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leader_in_array {
    public List<Integer> superiorElements(int[] a) {
        List<Integer> ans = new ArrayList<>();

        int maxi = Integer.MIN_VALUE;

        for (int i = a.length - 1; i >= 0; i--) {

            if (a[i] > maxi) {
                ans.add(a[i]);
            }

            maxi = Math.max(maxi, a[i]);
        }

        Collections.sort(ans);

        return ans;
    }
}
