package com.borikov.day1.entity;

public class Point {
    private String name;
    private double x;
    private double y;

    public Point(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        if (x != point.x) {
            return false;
        }
        if (y != point.y) {
            return false;
        }
        if (name == null) {
            if (point.name != null) {
                return false;
            }
        } else {
            if (!name.equals(point.name)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (int)(31 * x + y + ((name != null) ? name.hashCode() : 0));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point[");
        sb.append("name='").append(name).append('\'');
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(']');
        return sb.toString();
    }
}
