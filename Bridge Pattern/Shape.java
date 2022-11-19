public abstract class Shape{

    public IDrawAPI drawAPI;

    public Shape(IDrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}