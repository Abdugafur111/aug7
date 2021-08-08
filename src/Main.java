public class Main {

    public static void main(String[] args) {
	CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
        System.out.println(circle.toString());
        circle.printCircle();
        System.out.println("Area is " + circle.getArea());
        System.out.println("Diameter is: " + circle.getDiameter());

        RectangleFromSimpleGeometricObject rec1 = new RectangleFromSimpleGeometricObject(2,4);
        System.out.println(rec1.toString());
        System.out.println("width: " + rec1.getWidth() + ", height: " +rec1.getHeight() );
        System.out.println("Area is " + rec1.getArea());
        System.out.println("Perimeter is " + rec1.getPerimeter());
    }
}
