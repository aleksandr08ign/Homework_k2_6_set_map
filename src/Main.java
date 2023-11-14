import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        {
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) % 2 > 0) {
                    System.out.print(nums.get(i) + " ");
                }

            }
        }
    }
}