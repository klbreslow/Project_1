package com.csc205.project1;

/**
 * Driver class used to test Point implementation for Project 1.
 *
 * @author Ray Hedgecock
 * @version 1.1
 */
public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double shiftX(double n) {
        return x = x + n;
    }

    public double shiftY(double n) {
        return y = y + n;
    }

    public double distance(Point p2) {
        return Math.sqrt(Math.pow(p2.x - x, 2) + Math.pow(p2.y - y, 2));
    }

    public Point rotate(double angle) {
        x = x * Math.cos(angle) - y * Math.sin(angle);
        y = x * Math.sin(angle) + y * Math.cos(angle);
        return new Point(x, y);
    }

    public String toString() {
        return ("Point{x = " + x + ", y = " + y + "}");
    }
}