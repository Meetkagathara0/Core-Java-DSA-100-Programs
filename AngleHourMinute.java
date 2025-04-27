import java.util.Scanner;

public class AngleHourMinute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a hour");
        double h = sc.nextInt();
        System.out.println("enter a min");
        double m = sc.nextInt();
        double minute_angle = m * 6;
        double hour_angle = h * 30 + m * 0.5;

        double angle = Math.abs(hour_angle - minute_angle);

        if (angle > 180) {
            angle = 360 - angle;
        }
        System.out.println(angle);
    }

}
