package engine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Engine
{
	public Engine()
	{
		try
		{
			Display.setDisplayMode(new DisplayMode(800,600));
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
