package com.company;

public class Main {

    public static void main(String[] args) {

        Path p1 = new Path();

        p1.addPoint(0, 0);
        p1.addPoint(4, 0);
        p1.addPoint(4, 2);
        p1.printPath();
        System.out.println(p1.getDistance());
        System.out.println(p1.getLength());
        Path p2 = new Path();
        p2.addPoint(2,3);
        p2.addPoint(5,5);
        p1.addPath(p2);
        p1.removePoint(3);
        p1.printPath();
    }
}

class Point {

    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(Point p2) {
        double base = p2.x - this.x;
        double height = p2.y - this.y;
        return Math.sqrt((Math.pow(base, 2)) + (Math.pow(height, 2)));
    }

    void print() {
        System.out.print("(" + x + ", " + y + ") ");
    }
}

class Path {
    Point[] path;
    int numPoints;


    Path() {

        this.path = new Point[100];
        this.numPoints = 0;

    }

    String getPoint(int i) {

        return String.format("(%d, %d)", this.path[i].x, this.path[i].y);
    }

    int numOfPoints() {

        return numPoints;
    }

    double getLength() {
        double length = 0;
        if (numPoints < 2) {
            return 0;
        }
        for (int i = 0; i < this.numPoints - 1; i++) {
            length += path[i].getDistance(this.path[i + 1]);


        }
        return length;
    }

    double getDistance() {

        if (numPoints < 2) {
            return 0;
        }

        return this.path[numPoints - 1].getDistance(this.path[0]);
    }

    Path addPoint(int x, int y) {
        Point p = new Point(x, y);
        this.path[this.numPoints] = p;
        numPoints++;

        return this;
    }

    boolean removePoint(int i) {
        if (i > this.numPoints) {
            return false;
        }

        for (int j = i; j < this.numPoints - 1; j++) {
            this.path[j] = this.path[j + 1];
        }

        numPoints--;
        return true;
    }

    void addPath(Path other) {

        for (int i = numPoints; i < this.numPoints + other.numPoints; i++) {
            this.path[i] = other.path[i - this.numPoints];

        }
        this.numPoints = this.numPoints + other.numPoints;


    }

    void printPath() {
        for (int i = 0; i < this.numPoints; i++) {
            System.out.println("(" + this.path[i].x + ", " + this.path[i].y + ")");

        }


    }
    boolean isLonger(Path other){
        if (this.numPoints>other.numPoints){
            return true;
        }
        else {
            return false;
        }
    }

}

