import java.util.Arrays;
import java.util.Spliterator;

public class ArraysClassDemo {


    public static void main(String args[]){

        int[] array1 = new int[]{10,20,30,40,50,60,70,80,90,100};
        int[] array2 = new int[]{10,30,50,70,90,100,80,60,40,20};

        System.out.println("array1 : "+array1);
        System.out.println("array2 : "+array2);

        System.out.println(Arrays.binarySearch(array1,90));
        System.out.println(Arrays.binarySearch(array1,55));

        System.out.println(Arrays.binarySearch(array2,4,8,20));
        System.out.println(Arrays.binarySearch(array2,4,8,100));

        int[] array3 = Arrays.copyOf(array1,20);
        System.out.println("array3 : "+ Arrays.toString(array3));

        int[] array4 = Arrays.copyOf(array1,5);
        System.out.println("array4 : "+ Arrays.toString(array4));

        int[] array5 = Arrays.copyOfRange(array1,5,10);
        System.out.println("array5 : "+Arrays.toString(array5));

        System.out.println("equals : "+Arrays.equals(array1,array2));
        System.out.println("equals : "+Arrays.equals(array1,array1));
        int array6[] = array1.clone();
        System.out.println("array1 : "+Arrays.toString(array1));
        System.out.println("array6 : "+Arrays.toString(array6));
        System.out.println("equals : "+Arrays.equals(array1,array6));

        array6[0] = 300;
        System.out.println("array1 : "+Arrays.toString(array1));
        System.out.println("array6 : "+Arrays.toString(array6));

        Arrays.fill(array6,0);
        System.out.println("array6 : "+Arrays.toString(array6));

        Arrays.fill(array6,2,6,1);
        System.out.println("array6 : "+Arrays.toString(array6));

        System.out.println("array2 : "+Arrays.toString(array2));
        Arrays.sort(array2,5,10);
        System.out.println("array2 : "+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("array2 : "+Arrays.toString(array2));


       int[][] array7 = new int[][]{{1,2,3},{11,12,13},{21,22,23}};

        System.out.println("array7 : "+ Arrays.toString(array7));
        System.out.println("array7 : "+ Arrays.deepToString(array7));

        int[][][] array8 = new int[][][]{{{1,2,3},{11,12,13},{21,22,23}},{{1,2,3},{11,12,13},{21,22,23}},{{1,2,3},{11,12,13},{21,22,23}}};

        System.out.println("array8 : "+ Arrays.toString(array8));
        System.out.println("array8 : "+ Arrays.deepToString(array8));

    }

}
