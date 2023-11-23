public class ClassWork {

public static void main(String[] args){

//Circle
Circle circle = new Circle(4,"circle");
String area_of_circle = circle.Area(7);
System.out.println(area_of_circle);


//Circle
Square square = new Square(4,"square");
String area_of_square = square.Area(4);
System.out.println(area_of_square);



//Task : do that of rectangle
Rectangle rectangle = new Rectangle(4,"rectangle");
String area_of_rectangle = rectangle.Area(4,9);
System.out.println(area_of_rectangle);


}
}


/**
 * Shape
 */
class Shape {

//properties
int NoOfSide;
String name;
 
 //helps set the the properties on class instantiation
Shape(int NoOfSide, String name){
    this.NoOfSide = NoOfSide;
    this.name = name;
 }
 
 public void area(){
 }
 
 public int getNoOfSide(){
 return NoOfSide;
 }
 
 public String getName(){
 return name;
 }
 
 public void setName(String name){
 this.name = name;
 }
 
 public void setNoOfSides(int NoOfSide){
 this.NoOfSide = NoOfSide;
 }
 
 }
 /**
  * Circl
  */
 class Circle extends Shape{

    Circle (int NoOfSide, String name){
    super(NoOfSide, name);
        this.NoOfSide = NoOfSide;
        this.name = name;
    }   
    
    public String Area (double radius){
     double Area = 3.142 * radius * radius;
     return "The area of a "+ this.name + " is "+ Area;
    }

 }
 
  class Square extends Shape{

    Square (int NoOfSide, String name){
   super(NoOfSide, name);
        this.NoOfSide = NoOfSide;
        this.name = name;
    }   
    
    public String Area (double l){
     double Area = l * l ;
     return "The area of a "+ this.name + " is "+ Area;
    }
    
 }
 
 
   class Rectangle extends Shape{

    Rectangle (int NoOfSide, String name){
   super(NoOfSide, name);
        this.NoOfSide = NoOfSide;
        this.name = name;
    }   
    
    public String Area (double l, double b){
     double Area = l * b ;
     return "The area of a "+ this.name + " is "+ Area;}
}