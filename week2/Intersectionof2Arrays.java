package week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersectionof2Arrays {
    @Test
    public void test1()
    {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] intersection_arrays = intersection(nums1,nums2);
        Assertions.assertArrayEquals(new int[]{2},intersection_arrays);
    }

    public int[] intersection(int[] nums1,int[] nums2)
    {
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                ans.add(num);
                set.remove(num);
            }
        }
        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {

            result[i] = ans.get(i);
        }

        return result;
    }
}
