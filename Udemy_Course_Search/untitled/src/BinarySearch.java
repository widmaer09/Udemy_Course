public class BinarySearch {
    //data must be sorted
    //chooses the element in the middle of the array and compares it against the search value
    //if the  element is greater thant he value, search the left half of the array
    // if the element is less than the value, search the right half of the array
    //0(LOGN)

    public static void main(String[] args){
        int[] intArray ={-22,-15,1,7,20,35,55};
        System.out.println(iterativeBinarySearch(intArray,-22));
        System.out.println(iterativeBinarySearch(intArray,8));
        System.out.println(iterativeBinarySearch(intArray,7));

        System.out.println(recursiveBinarySearch(intArray,-22));
        System.out.println(recursiveBinarySearch(intArray,7));
        System.out.println(recursiveBinarySearch(intArray,0));



    }
    public static int iterativeBinarySearch(int[] input, int value){
        int start =0;
        int end = input.length;

        while (start <end){
            int midpoint = (start+end)/2;
            if(input[midpoint]==value){
                return midpoint;
            } else if (input[midpoint]<value) {
                start = midpoint +1;

            }
            else{
                end= midpoint;
            }
        }
        return -1;

    }
    public static int recursiveBinarySearch(int[] input, int value){

        return recursiveBinarySearch(input,0,input.length,value);

    }
    public  static int recursiveBinarySearch(int[] input, int start, int end , int value){
        if ( start >=end){
            return -1;
        }
        int midpoint = (start +end)/2;

        if(input[midpoint]== value){
            return midpoint;
        } else if (input[midpoint]<value) {
           return recursiveBinarySearch(input,midpoint+1,end,value);

        }else{
             return recursiveBinarySearch(input, start,midpoint, value);
        }


    }



}
