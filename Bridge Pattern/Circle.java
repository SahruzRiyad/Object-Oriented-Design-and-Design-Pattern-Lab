public class Circle extends Shape{
    
    private int x , y , radius;

    public Circle(IDrawAPI drawAPI , int radius , int x , int y){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void draw(){
        drawAPI.drawCircle(radius, x, y);
    }
}
