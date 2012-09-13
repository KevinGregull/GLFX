package glfx;

import engine.Engine;

public class GLFX
{
	
	
	
	
	public static void main(String[] args)
	{
		Engine engine=new Engine(800,600);
		engine.setTitle("OpenGL FrameworkX");
		engine.createWindow();
		engine.enterMainLoop();
	}
}
