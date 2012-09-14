package opengl;

import org.lwjgl.opengl.GL11;

import engine.Engine;

public class FXOpenGL
{
	private FXTextures textureManager;
	private FXModels modelManager;
	private FXScenes sceneManager;
	private FXShaders shaderManager;
	private FXFogs fogManager;
	private FXCamera camera;
	
	public FXOpenGL()
	{
		this.init();
		this.camera=new FXCamera();
		this.textureManager=new FXTextures();
		this.shaderManager=new FXShaders();
		this.modelManager=new FXModels();
		this.sceneManager=new FXScenes();
		this.fogManager=new FXFogs();
	}
	
	public void init()
	{
		GL11.glEnable(GL11.GL_TEXTURE_2D);               
	    
		GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);          
	    
	    GL11.glEnable(GL11.GL_BLEND);
	    GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
	    
	    GL11.glViewport(0,0,Engine.getWidth(),Engine.getWidth());
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
	
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, Engine.getWidth(), Engine.getWidth(), 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
	}
	
	public FXTextures getTextureManager()
	{
		return this.textureManager;
	}
	
	public FXModels getModelManager()
	{
		return this.modelManager;
	}
	
	public FXScenes getSceneManager()
	{
		return this.sceneManager;
	}
	
	public FXShaders getShaderManager()
	{
		return this.shaderManager;
	}
	
	public FXFogs getFogManager()
	{
		return this.fogManager;
	}
	
	public FXCamera getCamera()
	{
		return this.camera;
	}
	
}
