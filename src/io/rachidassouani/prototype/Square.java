package io.rachidassouani.prototype;

class Square extends Shape {
    public Square() {
        type = "Square";
    }

    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}