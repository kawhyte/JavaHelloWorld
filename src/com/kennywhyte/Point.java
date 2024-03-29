package com.kennywhyte;

import java.util.Objects;

public class Point {

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
//    @Override
//    public boolean equals(Object obj) {
//
//
//        if (obj instanceof Point) {
//            var other = (Point) obj;
//            return other.x == x && other.y == y;
//        }
//        else{
//            return false;
//        }
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x,y);
//    }
}
