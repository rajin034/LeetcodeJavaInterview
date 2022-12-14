import java.util.Arrays;

public class MeddianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int fal = nums1.length;        //determines length of firstArray
        int sal = nums2.length;   //determines length of secondArray
        int[] result = new int[fal + sal];  //resultant array of size first array and second array
        System.arraycopy(nums1, 0, result, 0, fal);
        System.arraycopy(nums2, 0, result, fal, sal);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        double d;
        int n = result.length;
        if (n%2 !=0){
            int a = (n/2);
            d= result[a];
        }
        else {
            int b = n/2;
            int c = b-1;
            d = (result[b]+ result[c])/2.0;
        }
        return d;

    }

    public static void main(String[] args) {
        int[] t1 = {1,3};
        int[] t2 = {2};
        findMedianSortedArrays(t1,t2);
        System.out.println(findMedianSortedArrays(t1,t2));



    }
}
