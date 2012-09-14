package opengl;

public class FXOpenGL
{
	private FXTextures textureManager;
	private FXModels modelManager;
	private FXScenes sceneManager;
	private FXShaders shaderManager;
	
	public FXOpenGL()
	{
		textureManager=new FXTextures();
		shaderManager=new FXShaders();
		modelManager=new FXModels();
		sceneManager=new FXScenes();
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
	
}
