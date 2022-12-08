import java.util.*;
public class Main {
    public static void main(String[] args) {

         HashMap<Car,CarInfo> map = new HashMap<>();
        map.put(new Car(1L," 07kg 777 trr "),new CarInfo(2018,"BMW",50000,"Black"));
        map.put(new Car(2L," 01kg 001 lux "),new CarInfo(2010,"Toyota",40000,"Green"));
        map.put(new Car(3L," 08kg 570 vip "),new CarInfo(2019,"Lexus",10000,"White"));
        map.put(new Car(4L," 07kg 007 ttt "),new CarInfo(2003,"Mercedes",12000,"Blue"));

        System.out.println(map.entrySet());

    }

}