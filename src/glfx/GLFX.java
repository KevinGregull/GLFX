package glfx;

import engine.Engine;

public class GLFX
{
	
	
	
	
	public static void main(String[] args)
	{
		// Initialize Engine
		Engine engine=new Engine(800,600);
		engine.setTitle("OpenGL FrameworkX");
		
		// Start Logic
		engine.createWindow();
		engine.enterMainLoop();
	}
}
