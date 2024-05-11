package com.gwu.dsa.d4;

//https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1

class MoveNegativeElementsSolution {

    public void segregateElements(int ar[], int n) {
        // Your code goes here

        int posCount = 0;
        int negCount = 0;


        // T.C = O(N) = N
        for(int i = 0 ; i < n ; i++) {
            if(ar[i] >= 0) {
                posCount++;
            } else {
                negCount++;
            }
        }




        // Combined Space Complexity = O(N) => where N = posCount + negCount;
        int pos[] = new int[posCount];
        int posIndex = 0;


        int neg[] = new int[n - posCount];
        int negIndex = 0;



        // T.C = O(N) = N
        for(int i = 0 ; i < n ; i++) {
            if(ar[i] >= 0) {
                pos[posIndex++] = ar[i];
            } else {
                neg[negIndex++] = ar[i];
            }
        }

        // System.out.println("Positive numbers : " + posIndex + " Negative number : " + negIndex);


        // Combined Time Complexity = O(N) => where N = posCount + negCount; = N
        for(int i = 0 ; i < posIndex ; i++) {
            ar[i] = pos[i];
        }

        for(int i = 0 ; i < negIndex ; i++) {
            ar[posIndex + i] = neg[i];
        }

    }
}

public class MoveNegativeElements {
    public static void main(String[] args) {
        MoveNegativeElementsSolution obj = new MoveNegativeElementsSolution();
        int ar[] = new int[]{2,3,4,-4,-9,1,-77,23,0};
        int n = ar.length;
        obj.segregateElements(ar, 9);

        System.out.println("After segregation ");

        for(int i = 0 ; i < n ; i++) {
            System.out.println(ar[i]);
        }
    }
}
