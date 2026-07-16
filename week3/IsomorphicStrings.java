package week3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class IsomorphicStrings {


    @Test
    public void test1()
    {
        String s = "egg" , t = "add";
        boolean isIsomorphic = isomorphic_String(s,t);
        //Assertions.assertTrue(isIsomorphic);
        Assertions.assertTrue(ascii_Isomorphic(s,t));
    }

    @Test
    public void test2()
    {
        String s = "f11" , t = "b12";
        boolean isIsomorphic = isomorphic_String(s,t);
        Assertions.assertFalse(isIsomorphic);
    }

    @Test
    public void test3()
    {
        String s = "paper" , t = "title";
        boolean isIsomorphic = isomorphic_String(s,t);
        Assertions.assertTrue(isIsomorphic);
    }

    /*
    1. Initialize Two HashMaps: Create map1 (to track mappings from s to t) and
    map2 (to track mappings from t to s). This ensures a bijective (one-to-one) relationship
    between characters.
    2. Iterate Through the Strings: Loop through both strings simultaneously,
    index by index, extracting character a from string s and character b from string t.
    3. Check for Conflicts (Validation): * If a already exists as a key in map1,
    but its mapped value is not equal to b, return false.
    4. If b already exists as a key in map2,
    but its mapped value is not equal to a, return false.
    5. Update Mappings: If no conflict is found,
    register the relationship by putting (a, b) into map1 and (b, a) into map2.
    6. Return Success: If the loop finishes without finding any conflicts,
    return true.
     */

    public boolean isomorphic_String(String s, String t)
    {
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();

        for (int i = 0;i<s.length();i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map1.containsKey(a)&& map1.get(a)!=b || map2.containsKey(b) && map2.get(b)!=a)
                return false;
            map1.put(a,b);
            map2.put(b,a);
        }

        return true;
    }

    /*
    1. Check Base Case: First, check if the lengths of s and t are different. If they are,
they cannot be isomorphic, so return false immediately.
    2. Initialize Character Trackers: Create two integer arrays, mapS and mapT, of size 256
(to cover all ASCII characters). These arrays will store the last seen position (index + 1)
of each character.
Note: We use index + 1 because array elements default to 0 in Java. A value of 0 means the character has not been seen yet.
    3. Iterate Through both Strings: Loop through the strings simultaneously, fetching
charS from string s and charT from string t at the current index i.
    4. Compare Last Seen Positions: * Retrieve the stored position value for charS from
mapS and charT from mapT.
    5. If these values do not match, it means one of the characters appeared earlier
without its partner, breaking the isomorphic pattern. Return false immediately.
    6. Update Current Positions: If the positions match, update both mapS[charS] and
mapT[charT] to the current position tracker: i + 1.
    7. Return Success: If the loop completes without detecting any mismatched positions,
return true.

     */
    public boolean ascii_Isomorphic(String s, String t)
    {
        if (s.length() != t.length()) {
            return false;
        }

        // Stores the last seen position (index + 1) of characters in s and t
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // If the "last seen" positions don't match, they aren't isomorphic
            if (mapS[charS] != mapT[charT]) {
                return false;
            }

            // Store the current index + 1 (using 0 as the default "not seen" flag)
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }

        return true;
    }
}
