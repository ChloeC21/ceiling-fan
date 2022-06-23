public class Main {

    public static void main(String[] args) {

        Fan fan1 = new Fan();
        System.out.println(fan1.toString());  // Fan{speed=0, isReversed=false}

        for (int i = 0; i < 5; i++) {
            fan1.pullSpeedCord();
            System.out.println(fan1.toString());
        }
        /*
        Fan{speed=1, isReversed=false}
        Fan{speed=2, isReversed=false}
        Fan{speed=3, isReversed=false}
        Fan{speed=0, isReversed=false}
        Fan{speed=1, isReversed=false}
        */

        fan1.pullReverseCord();
        System.out.println(fan1.toString());  // Fan{speed=1, isReversed=true}

        for (int i = 0; i < 5; i++) {
            fan1.pullSpeedCord();
            System.out.println(fan1.toString());
        }
        /*
        Fan{speed=2, isReversed=true}
        Fan{speed=3, isReversed=true}
        Fan{speed=0, isReversed=true}
        Fan{speed=1, isReversed=true}
        Fan{speed=2, isReversed=true}
        */
    }
}
