public class CoreJavaBrushup4 {

    public static void main(String[] args) {

        String s="Rahul Shetty Academy";
       String[]  splitted= s.split("Shetty");
        System.out.println(splitted[0]);
        System.out.println(splitted[1]);
        System.out.println(splitted[1].trim());

        for(int i=s.length()-1;i<s.length();i--){
            System.out.println(s.charAt(i));
        }

    }
}
