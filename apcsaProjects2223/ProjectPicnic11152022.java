package apcsaProjects2223;

public class ProjectPicnic11152022 {
    public static boolean goToPicnic(boolean weekend, boolean weather) {
        if ((weekend) && (weather)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(goToPicnic(true, true));
    }
}