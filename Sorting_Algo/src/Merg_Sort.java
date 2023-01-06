public class Merg_Sort {
     public static void main(String[] args){
         int[] intArray ={20,35,-15,7,55,1,-22};

         mergSort(intArray,0, intArray.length);











         for (int j : intArray) {
             System.out.println(j);
         }



     }

     public static void mergSort(int []input ,int start,int end){
         if(end-start <2){
             return;
         }
         int mid=(start+end)/2;
         mergSort(input,start,mid);
         mergSort(input,mid,end);
         merge(input,start,mid,end);
     }

     public static void merge(int input[],int start, int mid, int end){
         if (input[mid-1]<= input[mid]){
             return;
         }
         int i= start;
         int j = mid;
         int tempIndex=0;

         int[] temp = new int[end-start];

         while (i<mid && j< end){
             temp[tempIndex++] = input[i] <= input[j] ? input[i++]: input[j++];
         }

         //{32,34},{33,36}
         //{32,33,34}

         System.arraycopy(input,i,input,start+tempIndex,mid-i);
         System.arraycopy(temp,0,input,start,tempIndex);





     }


}
