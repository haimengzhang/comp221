/**
 * Created by haimengzhang on 9/16/17.
 */

/*
The algorithm Disjoint below takes in two lists or arrays of integers:
A is n long, B is m long. It returns True if A and B have no values in common,
 and it returns False if they do have a value in common (see the illustrative examples below).

 */


public class Disjoint {

    /*
    @param A, B are arrays of integers
    return type of boolean
     */

    public boolean checkDisjoint(int[] A, int[] B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    return false; // exit with false  on cases of common values.
                }
            }
        }
        return true;
    }

  /*  public static void main(String[] args) {
        Disjoint obj = new Disjoint();
        int[] A1 = {1, 2};
        int[] A2 = {0};
        //
        int[] B1 = {1,2,3}; // if the inputs are
        int[] B2 = {1,5,6};
        //
        String[] C1 = {"eat"}; // When the inputs are strings, they cause compilation error.
        String[] C2 = {"drink"};
        //
        int[] D1 = {};
        int[] D2 = {}; // WHEN both arrays are empty

        int[] E1 = {};
        int[] E2 = {1, 2, 3}; // when one array is empty and the other is not, it will return true.

        System.out.println(obj.checkDisjoint(A1, A2));
        System.out.println(obj.checkDisjoint(B1, B2));
        //System.out.print(obj.check(C1, C2)); // IF IT IS TWO STRING INPUT
        System.out.println(obj.checkDisjoint(D1, D2)); //
        System.out.println(obj.checkDisjoint(E1, E2)); //

    }*/
}

