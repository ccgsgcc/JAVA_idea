//6 if условный оператор
public class If {
    public static void main(String [] args) {
        int myInt = 5;
        if (myInt < 10){
            System.out.println("verno");
            // << выполнится только это ,
            // тк программа выполняется сверхну вниз
        } else if (myInt < 15){
            System.out.println("neverno");
        } else {
            System.out.println("Никакой");
        }
    }
}
