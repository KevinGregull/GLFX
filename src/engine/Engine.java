package engine;


import opengl.FXOpenGL;
import opengl.FXTexture;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Engine
{
	// Static Attributes
	private static FXOpenGL openGL;
	
	// Static Getter Methods
	public static FXOpenGL getOpenGL()
	{
		return Engine.openGL;
	}
	public static int getWidth()
	{
		return Display.getWidth();
	}
	public static int getHeight()
	{
		return Display.getHeight();
	}
	public static int getX()
	{
		return Display.getX();
	}
	public static int getY()
	{
		return Display.getY();
	}
	public static String getTitle()
	{
		return Display.getTitle();
	}
	
	// Static Setter methods
	public static void setTitle(String title)
	{
		Display.setTitle(title);
	}
	public static void setConfiguration(int gamma,int brightness,int contrast)
	{
		try
		{
			Display.setDisplayConfiguration(gamma,brightness,contrast);
		}
		catch(LWJGLException e)
		{
			System.out.println("Could not configure Display");
		}
	}
	
	// Constructor
	public Engine(int width,int height)
	{
		// Create the Display
		try
		{
			Display.setDisplayMode(new DisplayMode(width,height));
			Display.create();
		}
		catch (LWJGLException ex)
		{
			System.out.println("Display could not be created!");
		}
		
		// Run OpenGL
		Engine.openGL=new FXOpenGL();
	}
	
	// FIXME: This is only Temporary / Replace with SceneManager
	public void testLoop()
	{
		FXTexture texture=Engine.getOpenGL().getTextureManager().addTexture("default","imgs/test.png");
		Engine.getOpenGL().getTextureManager().useTexture("default");
		
		while (!Display.isCloseRequested())
		{
			GL11.glBegin(GL11.GL_QUADS);
			GL11.glTexCoord2f(0,0);
			GL11.glVertex2f(100,100);
			GL11.glTexCoord2f(1,0);
			GL11.glVertex2f(100+texture.getTextureWidth(),100);
			GL11.glTexCoord2f(1,1);
			GL11.glVertex2f(100+texture.getTextureWidth(),100+texture.getTextureHeight());
			GL11.glTexCoord2f(0,1);
			GL11.glVertex2f(100,100+texture.getTextureHeight());
			GL11.glEnd();
			
			Display.update();
		}
		Display.destroy();
	}
}
