public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double radius;

    CircleFromSimpleGeometricObject(){
    }

    CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }

    CircleFromSimpleGeometricObject(double radius, boolean filled, String color){
        this. radius = radius;
        setColor(color);
        isFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return radius * 2;
    }

    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated() + " and radius is " + radius );
    }
}
