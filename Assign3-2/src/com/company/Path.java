package com.company;

class Path {


    Element first;
    Element last;
    int totalElements;


    Path() {
        this.first = null;
        this.last = null;
        this.totalElements = 0;
    }

    Path addPoint(int x, int y) {
        Element addedPoint = new Element(new Point(x, y));
        addedPoint.previous = this.last;
        if (this.last != null) {
            this.last.next = addedPoint;
        }
        this.last = addedPoint;
        if (this.first == null) {
            this.first = addedPoint;
        }
        this.totalElements++;
        return this;
    }


    String getPoint(int i) {
        Element current = this.first;
        for (int ele = 0; ele < this.totalElements; ele++) {
            if (ele == i) {
                String s = String.format("(%d, %d)",current.point.x,current.point.y);
                return s;
            }

            current = current.next;
        }
        return "";

    }

    void print() {
        Element current;
        current = this.first;
        System.out.print(this.totalElements + ": ");
        while (current != null) {
            current.point.print();
            current = current.next;
        }
        System.out.println("");

    }


    int numOfPoints() {


        return totalElements;
    }


    boolean removePoint(int i) {
        Element current = this.first;

        for (int ele = 0; ele < this.totalElements; ele++) {
            if (ele == i) {
                if (current.previous != null) {
                    current.previous.next = current.next;
                } else {
                    this.first = current.next;
                }
                if (current.next != null) {
                    current.next.previous = current.previous;
                } else {
                    this.last = current.previous;
                }
                totalElements--;
                return true;
            }

            current = current.next;
        }


        return false;
    }

    void addPath(Path other) {

        if (other.first == null && other.last == null) {
            return;
        }
        if (this.first == null && this.last == null) {

            this.first = other.first;
            this.last = other.last;
            this.totalElements = other.totalElements;
            return;
        }

        this.totalElements = this.totalElements + other.totalElements;
        other.first.previous = this.last;
        this.last.next = other.first;
        if (other.last != null) {
            this.last = other.last;
        }


    }

    double getLength() {

        Element current = this.first;
        double length = 0;

        while (current != null) {

            if (current.next != null) {
                length += current.point.getDistance(current.next.point);
            }
            current = current.next;
        }
        return length;
    }


    double getDistance() {
        if (this.first == null || this.last == null) {
            return 0;
        }
        return this.first.point.getDistance(this.last.point);
    }


    boolean isLonger(Path p) {

        return (this.totalElements > p.totalElements);
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

    class Element {
        Point point;
        Element next;
        Element previous;

        Element(Point p) {
            this.point = p;
            this.next = null;
            this.previous = null;
        }

        void next(Element e) {
            this.next = e;
        }

        void previous(Element e) {
            this.previous = e;
        }
    }
}


