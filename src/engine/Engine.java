package engine;


import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Engine
{
	// Static Attributes
	private static int width;
	private static int height;
	private static String title;
	
	// Static Methods
	public static int getWidth()
	{
		return Engine.width;
	}
	
	public static int getHeight()
	{
		return Engine.height;
	}
	
	public static String getTitle()
	{
		return Engine.title;
	}	
	
	// Constructor
	public Engine(int width,int height)
	{
		Engine.width=width;
		Engine.height=height;
	}
	
	// Methods
	public void setTitle(String title)
	{
		Engine.title=title;
	}
	
	public void createWindow()
	{
		try
		{
			Display.setDisplayMode(new DisplayMode(Engine.getWidth(),Engine.getHeight()));
			Display.setTitle(Engine.getTitle());
			Display.create();
		}
		catch (LWJGLException ex)
		{
			System.out.println("Display could not be created!");
		}
	}
	
	public void enterMainLoop()
	{
		while (!Display.isCloseRequested())
		{
			Display.update();
		}
		Display.destroy();
	}
}
