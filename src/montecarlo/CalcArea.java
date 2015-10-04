package montecarlo;

public class CalcArea {
    public static void main(String[] args) {
        double xCoordinate;
        double yCoordinate;
        long areaInsideCircle = 0;
        long areaOutsideCircle = 0;
        long randomDots = 4000000000L;

        System.out.printf("Calculating pi for %s random points\n",randomDots);
        System.out.println("Established Value of PI = " + Math.PI);
        for (long i = 0; i < randomDots; i++) {
        	xCoordinate = Math.random();
        	yCoordinate = Math.random();
            if (isInsideCircle(xCoordinate,yCoordinate)){
            	areaInsideCircle++;
            }
            else
            	areaOutsideCircle++;
        }
        System.out.println("Too right quadrant of circle = " +  (double)areaInsideCircle / (double)randomDots);
        //System.out.println("Ratio (Inside Circle)->(Outside circle)= " +  (((double)areaInsideCircle / (double)randomDots) * 10) + " : " + (((double)areaOutsideCircle / (double)randomDots)) * 10);
        System.out.println("Ratio (Inside Circle)->(Outside circle)= " + calculateRatio(areaInsideCircle,areaOutsideCircle,randomDots));
        System.out.println("Estimated Value of PI = " + 4.0 * estimatePI(areaInsideCircle,randomDots ));
        System.out.println("Points inside circle=" +areaInsideCircle);
        System.out.println("Points inside circle/square=" +areaOutsideCircle);
    }
    private static boolean isInsideCircle(double xCoordinate,double yCoordinate)
    {
    	if (xCoordinate * xCoordinate + yCoordinate * yCoordinate <= 1)
    		return true;
    	else
    		return false;
    }
    private static String calculateRatio(double areaInsideCircle,double areaOutsideCircle,double randomDots )
    {
    	return  ((double)areaInsideCircle / (double)randomDots) * 10 + " : " + ((double)areaOutsideCircle / (double)randomDots) * 10;
    }    
    private static double estimatePI(double areaInsideCircle,double randomDots )
    {
    	return  4.0 * (double)areaInsideCircle / (double)randomDots;
    }        
}
