import java.util.ArrayList;

public class Main {

    // The circles
    static ArrayList<Circle> theCircles = new ArrayList<Circle>();

    public static void main(String[] args) {

        // the input
        double[][] circles = {
                {1, 1, 2},
                {2, 2, 0.5},
                {-1, -3, 2},
                {5, 2, 1}
        };

        for (int i = 0; i < circles.length; i++) {
            theCircles.add(new Circle(circles[i][0], circles[i][1], circles[i][2]));
        }

        // Find upper and lower vertical bounds
        double maxHeight = findMaxHeight(theCircles);
        double minHeight = findMinHeight(theCircles);

        // Find upper and lower horizontal bounds
        double rightWall = findRightWall(theCircles);
        double leftWall = findLeftWall(theCircles);

        // Display answer
        System.out.println("\n" +
                "(" + maxHeight + ", " + leftWall + ") - " + "(" + maxHeight + ", " + rightWall + ")\n" +
                "(" + minHeight + ", " + leftWall + ") - " + "(" + minHeight + ", " + rightWall + ")"
        );
    }


    // Upper vertical bound
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

    // Lower vertical bound
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

    // Upper horizontal bound
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

    // Lower vertical bound
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

