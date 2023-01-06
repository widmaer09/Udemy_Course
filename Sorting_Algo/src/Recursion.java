public class Recursion {
    public static void main(String[] args){
        System.out.println(recursiveFactorial(5));





    }
    //0!=1
    //1! =1*0!=1
    //2! = 2 *1 =2 *1!
    //3! =3 *2 *1= 3*2!
    //4!= 4*3*2*1= 4 *3!
    public static int iterativeFactorial(int num){
        if (num==0){
            return 1;//this is what breaks the recursive stack
        }
        int factorial =1;
        for (int i=1;i<= num;i++){
            factorial +=i;
        }
        return factorial;

    }


    public static int recursiveFactorial(int num){
        if(num==0){
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }
}
