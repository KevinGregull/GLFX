package opengl;

public class Int2D
{
    // Attributes

    public int x;
    public int y;

    // Constructors
    public Int2D(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public Int2D()
    {
    }

    // Getter
    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public int getR()
    {
        return this.x;
    }

    public int getG()
    {
        return this.y;
    }

    // Setter
    public void setX(int value)
    {
        this.x=value;
    }

    public void setY(int value)
    {
        this.y=value;
    }

    public void setR(int value)
    {
        this.x=value;
    }

    public void setG(int value)
    {
        this.y=value;
    }
}
