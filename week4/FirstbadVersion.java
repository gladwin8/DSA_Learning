package week4;

import org.junit.jupiter.api.Test;

class VersionControl {
    int bad = 1;
    boolean isBadVersion(int version) {
        return version >= bad;
    }
}

public class FirstbadVersion extends VersionControl {

    @Test
    public void test1()
    {
        int totalversions = 1;

        int Badversion = firstbad_version(totalversions);
        System.out.println(Badversion);
    }

    public int firstbad_version(int total)
    {
        int left = 1 , right = total;
        while(left<right)
        {
            int mid = left + (right-left)/2;
            if(isBadVersion(mid))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}
