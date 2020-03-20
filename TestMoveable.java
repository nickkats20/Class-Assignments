public class TestMoveable{
    public static void main(String[] args) {
        Moveable m1 = new Pet();
        m1.move(10);

        Moveable m2 = new Car();
        m2.move(10);

        Moveable[] marr = {new Pet(), new Pet(), new Pet(), new Car(), new Car(), new Car()};
        for(Moveable m : marr){
            m.move(10);
        }
       
    }
}