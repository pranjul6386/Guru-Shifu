package com.thoughtworks.rectangle;

public class Rectangle {
    private final double length,breadth;

    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }




    double area(){
        
        return (length*breadth);
        
    }
    double perimeter(){
        return (2*(this.length + this.breadth));
    }
}
