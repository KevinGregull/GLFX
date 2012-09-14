package opengl;

public class Int3D
{
	// Attributes
	public int x;
	public int y;
	public int z;

	// Constructors
	public Int3D(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public Int3D()
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
	public int getZ()
	{
		return this.z;
	}	
	public int getR()
	{
		return this.x;
	}
	public int getG()
	{
		return this.y;
	}
	public int getB()
	{
		return this.z;
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
	public void setZ(int value)
	{
		this.z=value;
	}
	public void setR(int value)
	{
		this.x=value;
	}
	public void setG(int value)
	{
		this.y=value;
	}
	public void setB(int value)
	{
		this.z=value;
	}
}
