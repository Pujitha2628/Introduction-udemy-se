import java.util.ArrayList;

public class CoreJavaBrushup3 {

    public static void main(String[] args) {

        int[] num={1,2,4,5,7};
        for(int i=num.length-1; i>=0; i--){  //reverse order
            System.out.println(num[i]);

//            System.out.println("first element is" + num[0]);    //first elem
//            System.out.println("last element is" + num[num.length-1]);//last elem


            ArrayList<String > a= new ArrayList<>();
            a.add("Janu");
            a.add("jain");
            a.add("vain");
            a.add("vani");
            System.out.println( a.get(2));

            for(int j=0; j<a.size();j++){
               // System.out.println(j);// printing index like- 0 1 2 3
                System.out.println(a.get(j));//prints values- janu, jain,..
            }
            System.out.println("**********");
            for(String val: a){
                System.out.println( val);
            }

            System.out.println(a.contains("vani"));
        }
    }
}
