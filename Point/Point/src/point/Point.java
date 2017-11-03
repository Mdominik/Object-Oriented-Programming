/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;
import java.util.Random;
/**
 *
 * @author POLAK
 */
public class Point {

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }
    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        return xy;
    }
    public void setXY(int x_, int y_) {
        this.xy[0] = x_;
        this.xy[1] = y_;
    }
    
    private int x = 0;
    private int y = 0;
    private int[] xy;
    
    Point() { 
    }
    Point(int x_, int y_) {
        this.x = x_;
        this.y = y_;
    }
    @Override
    public String toString() {
        String x = "Distance from the previous point: "; 
        return ("Point: coordinates: " + "("+this.x+", "+this.y + ")\n"
                +"distance from (0,0): " + distance() +
                 "\n");
    }
    
    //distance from this point to the given point at (x,y)
    public double distance(int x_, int y_) {
        return Math.sqrt(Math.pow(x-x_, 2)+Math.pow(y-y_, 2));
    }
    
    //to the previous point
    public double distance(Point myPoint) {
        return Math.sqrt(Math.pow(x-myPoint.getX(), 2)+Math.pow(y-myPoint.getY(), 2));
    }
    
    //to (0,0)
    public double distance() {
        return Math.sqrt(x*x+y*y);
    }
    
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        String generatedPoints = "";
        Point[] points = new Point[10];
        for (int i=0, l=points.length; i<l; i++) {
            points[i] = new Point(randomGenerator.nextInt(200), 
                                    randomGenerator.nextInt(200));
            if(i==9 || i==0) {
                    System.out.println("Nr " + i + ", " + points[i].toString());
                    continue;
            }
            System.out.println("Nr " + i + ", " + points[i].toString() + "Distance from the previous coordinate: " +
                    points[i].distance(points[i-1]));
        
        }
        
        System.out.println(generatedPoints);
    }
    
}
