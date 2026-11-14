public class CoreJavaBrushup2 {

    public static void main(String[] args) {

        int[] arr={1,4,6,87,9,90,2,22,24};
        for(int i=0;i<arr.length;i++){  //multiple of 2
            if(arr[i] % 2==0){
                System.out.println(arr[i]);
               // break;
            }
//            else {
//                System.out.println(arr[i] + "is not multiple of 2");
//            }
        }
    }
}
