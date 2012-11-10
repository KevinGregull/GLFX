package opengl;

public class Float3D
{
    // Attributes

    public float x;
    public float y;
    public float z;

    // Constructors
    public Float3D(float x,float y,float z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public Float3D()
    {
    }

    // Getter
    public float getX()
    {
        return this.x;
    }

    public float getY()
    {
        return this.y;
    }

    public float getZ()
    {
        return this.z;
    }

    public float getR()
    {
        return this.x;
    }

    public float getG()
    {
        return this.y;
    }

    public float getB()
    {
        return this.z;
    }

    // Setter
    public void setX(float value)
    {
        this.x=value;
    }

    public void setY(float value)
    {
        this.y=value;
    }

    public void setZ(float value)
    {
        this.z=value;
    }

    public void setR(float value)
    {
        this.x=value;
    }

    public void setG(float value)
    {
        this.y=value;
    }

    public void setB(float value)
    {
        this.z=value;
    }
}
