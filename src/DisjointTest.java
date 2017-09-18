import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by haimengzhang on 9/17/17.
 */

public class DisjointTest {

    Disjoint a = new Disjoint();

    // When the first arrays finds a common element on first iteration
    int[] A1 = {0};
    int[] B1 = {0, 1,2,3};

    // when two arrays find common value on last iteration
    int[] B2 = {1,3,5,7,100};
    int[] C1 = {100};

    // if both arrays are empty
    int[] D1 = {};
    int[] D2 = {};

    // if only one of the two arrays is empty
    int[] D3 = {};
    int[] D4 = {10, 9, 8, 7};

    //if the arrays contain negative values and no common values
    int[] E1 = {-2, -1, -5,-6};
    int[] E2 = {-3, 1, 2};

    int[] H1 = {1, 2};
    int[] H2 = {1, 2};

    //if the array contain duplicate values and
    int[] F1 = {1, 1, 2, 2};
    int[] F2 = {5, 5, 6, 6, 7, 8, 9};

    @Test
    public void testCheckDisjoint() {
        assertEquals(a.checkDisjoint(A1,B1), true);
        assertEquals(a.checkDisjoint(B2,C1),false);
        assertEquals(a.checkDisjoint(B1,B2), false);
        assertEquals(a.checkDisjoint(B1,C1), true);
        assertEquals(a.checkDisjoint(D1,D2), true);
        assertEquals(a.checkDisjoint(D3,D4), true);
        assertEquals(a.checkDisjoint(E1,E2), true);
        assertEquals(a.checkDisjoint(H1,H2), true);
        assertEquals(a.checkDisjoint(F1,F2), true);
    }
}
