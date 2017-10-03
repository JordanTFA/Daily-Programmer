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

        double rightWall = findRightWall(theCircles);
        double leftWall = findLeftWall(theCircles);

        System.out.println("\n" +
                "(" + maxHeight + ", " + leftWall + ") - " + "(" + maxHeight + ", " + rightWall + ")\n" +
                "(" + minHeight + ", " + leftWall + ") - " + "(" + minHeight + ", " + rightWall + ")"
        );
    }


    public static double findMaxHeight(ArrayList<Circle> theCircles) {

        double highestSoFar = 0;

        double top = 0;

        for (int i = 0; i < theCircles.size(); i++) {

            top = theCircles.get(i).getY() + theCircles.get(i).getR();

            if(top > highestSoFar){
                highestSoFar = top;
            }
        }

        return highestSoFar;
    }

    public static double findMinHeight(ArrayList<Circle> theCircles) {

        double lowestSoFar = 0;

        double low = 0;

        for (int i = 0; i < theCircles.size(); i++) {

            low = theCircles.get(i).getY() - theCircles.get(i).getR();

            if(low < lowestSoFar){
                lowestSoFar = low;
            }
        }

        return lowestSoFar;
    }

    public static double findRightWall(ArrayList<Circle> theCircles) {

        double furthestRightSoFar = 0;

        double right = 0;

        for (int i = 0; i < theCircles.size(); i++) {

            right = theCircles.get(i).getX() + theCircles.get(i).getR();

            if(right > furthestRightSoFar){
                furthestRightSoFar = right;
            }
        }

        return furthestRightSoFar;
    }

    public static double findLeftWall(ArrayList<Circle> theCircles) {

        double furthestLeftSoFar = 0;

        double left = 0;

        for (int i = 0; i < theCircles.size(); i++) {

            left = theCircles.get(i).getX() - theCircles.get(i).getR();

            if(left < furthestLeftSoFar){
                furthestLeftSoFar = left;
            }
        }

        return furthestLeftSoFar;
    }

}

