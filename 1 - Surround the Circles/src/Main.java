import java.util.ArrayList;

public class Main {

    static ArrayList<Circle> theCircles = new ArrayList<Circle>();

    public static void main(String[] args) {

        double[][] circles = {
                {1, 1, 2},
                {2, 2, 0.5},
                {-1, -3, 2},
                {5, 2, 1}
        };

        for (int i = 0; i < circles.length; i++) {
            theCircles.add(new Circle(circles[i][0], circles[i][1], circles[i][2]));
        }

        double maxHeight = findMaxHeight(theCircles);
        double minHeight = findMinHeight(theCircles);

        double maxWidth = findMaxWidth(theCircles);
        double minWidth = findMinWidth(theCircles);
    }


    public static double findMaxHeight(ArrayList<Circle> theCircles){

        return 0;
    }

    public static double findMinHeight(ArrayList<Circle> theCircles){

        return 0;
    }

    public static double findMaxWidth(ArrayList<Circle> theCircles){

        return 0;
    }

    public static double findMinWidth(ArrayList<Circle> theCircles){

        return 0;
    }

    }

