public class Rectangle {
    int length,breath;

    public static Rectangle createRectangle(int length, int breath){
        return new Rectangle(length,breath);
    }

    public static Rectangle createSquare(int length){
        return new Rectangle(length,length);
    }

    private Rectangle(int length,int breath){
        this.length = length;
        this.breath = breath;
    }

    public int getArea(){
        return length * breath;
    }

    public int getPerimeter(){
        return 2*length + 2*breath;
    }
}
