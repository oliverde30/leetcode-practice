package zyz.binsearch;

/**
 * 2021-05-26
 * 二分查找
 */
public class BinSearch {

    public int binSearch(int[] arr, int k) {
        int l = 0;
        int h = arr.length - 1;

        while (l < h) {
            int m = (l + h) / 2;
            if (arr[m] == k) {
                return m;
            } else if (arr[m] < k) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
    }

}
