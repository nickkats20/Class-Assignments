public class doubleTrouble{



    public static void main(String[] args) {
        testMethod();
    }

    public static void testMethod(){
        double sum = 0.0;
        for(int i = 0; i < 20; i++){
        System.out.println(sum);
        sum = sum + 0.4;
       }
    }
}