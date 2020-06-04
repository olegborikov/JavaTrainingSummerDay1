package com.borikov.day1.entity;

public class CoordinatePoint {
    String name;
    int x;
    int y;

    public CoordinatePoint(String name, int x, int y) {
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoordinatePoint coordinatePoint = (CoordinatePoint) o;
        if (x != coordinatePoint.x)
            return false;
        if (y != coordinatePoint.y)
            return false;
        if (name == null) {
            if (coordinatePoint.name != null)
                return false;
        } else if (!name.equals(coordinatePoint.name))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (31 * x + y + ((name != null) ? name.hashCode() : 0));
    }
}
