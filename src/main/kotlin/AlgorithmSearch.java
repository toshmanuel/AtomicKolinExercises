import java.util.Arrays;

class AlgorithmSearch {
    public static int linearSearch(int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target){
        int first = 0, last = array.length-1;
        while(first <= last){
            int middle = (first + last)/ 2;
            if (array[middle] == target){
                return middle;
            }else if (array[middle] < target){
                first = middle + 1;
            }else last = middle - 1;
        }
        return -1;
    }

    public static boolean recursiveSearch(int[] array, int target){
        if (array == null) return false;
        int middle = array.length / 2;
        if(array.length == 0) return false;
        else{

            if (array[middle] == target) return true;
            else if (array[middle] < target){
                int[] newArray = Arrays.copyOfRange(array, middle + 1, array.length);

                return recursiveSearch(newArray, target);
            }else{
                int[] newArray = Arrays.copyOfRange(array, 0, middle);
                return recursiveSearch(newArray, target);
            }

        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int result = linearSearch(numbers, 18);
        System.out.println(result);

        int result1 = binarySearch(numbers, 4);
        System.out.println(result1);

        boolean result2 = recursiveSearch(numbers, 9);
        System.out.println(result2);
    }
}
