package recursion;

import java.util.ArrayList;

public class ArraysRecursion {
    static boolean find(int[] arr, int n, int x) {
        if(n==0){
            return false;
        }
        return arr[n-1]==x || find(arr, n-1, x);
    }
    static int findIndex(int[] arr, int n, int x) {
        if(n==0){
            return -1;
        }
        if(arr[n-1]==x){
            return n-1;
        }
        return findIndex(arr, n-1, x);
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> res) {
        if(index==arr.length){
            return res;
        }
        if(arr[index]==target){
            res.add(index);
        }
        return findAllIndex(arr, target, index+1, res);
    }
    static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index) {
        if(index==arr.length){
            return new ArrayList<>();
        }
        ArrayList<Integer> res = findAllIndex1(arr, target, index+1);
        if(arr[index]==target){
            res.add(index);
        }
        return res;
    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        list.addAll(findAllIndex2(arr, target, index+1));
        return list;
    }
}
