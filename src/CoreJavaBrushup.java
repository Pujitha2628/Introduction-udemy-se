import java.sql.SQLOutput;

public class CoreJavaBrushup {

    public static void main(String[] args) {

        int num = 9;
        String str = "Pujitha";
        char ch = 'k';
        boolean bl = true;

        System.out.println(num + "is the value");


    //Arrays
    int[] arr1 = {1, 3, 4, 6, 9,66,4,2,11};
    System.out.println(arr1 [2]);

    //for loop

//        for(int i=0;i<5;i++){
//            System.out.println(arr1[i]);
//        }

        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

        String[] name={"janu","jashu","jain"};
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }

        for(String s:name){
            System.out.println(s);
        }


}}