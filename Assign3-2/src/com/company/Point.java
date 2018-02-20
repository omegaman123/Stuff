package com.company;

 class Point {

    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    double getDistance(Point p2){
        double base = p2.x - this.x;
        double height = p2.y - this.y;
        return Math.sqrt((Math.pow(base,2))+(Math.pow(height,2)));
    }



}
