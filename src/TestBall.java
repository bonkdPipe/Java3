public class TestBall {
    public static void main(String[] args) {
        System.out.println("Old coordinates: ");
        Ball shar = new Ball(5,6);
        System.out.println(shar );
        System.out.println("New coordinates after moving: ");
        shar.move(6,3);
        System.out.println(shar);
        System.out.println("New coordinates after direct set: ");
        shar.setXY(5,8);
        System.out.println(shar);
    }
}
