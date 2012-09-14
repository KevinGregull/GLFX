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
	private static int width;
	private static int height;
	private static String title;
	private static FXOpenGL openGL;
	
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
	
	public static FXOpenGL getOpenGL()
	{
		return Engine.openGL;
	}
	
	// Constructor
	public Engine(int width,int height)
	{
		Engine.width=width;
		Engine.height=height;
		Engine.openGL=new FXOpenGL();
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
		
		GL11.glEnable(GL11.GL_TEXTURE_2D);               
        
		GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);          
        
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        
        GL11.glViewport(0,0,width,height);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);

		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, width, height, 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);		
	}
	
	public void enterMainLoop()
	{
		FXTexture texture=Engine.openGL.getTextureManager().addTexture("default","imgs/test.png");
		texture.use();
		
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
