public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;


    SimpleGeometricObject(){
            dateCreated = new java.util.Date();
    }


    SimpleGeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }


    public String getColor(){
        return color;
    }


    public void setColor(String color){
        this.color = color;
    }


    public boolean isFilled(){
        return filled;
    }


    public void isFilled(boolean filled){
        this.filled = filled;
    }


    public java.util.Date getDateCreated(){
        return dateCreated;
    }


    public String toString(){
        return "created on" + dateCreated + "\ncolor: " + color;
    }

}
