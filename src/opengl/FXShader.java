package opengl;

import static org.lwjgl.opengl.ARBFragmentShader.*;
import static org.lwjgl.opengl.ARBShaderObjects.*;
import static org.lwjgl.opengl.ARBVertexShader.*;

public class FXShader
{
	private int shaderID;
	private int vertID;
	private int fragID;
	
	public FXShader(String vertfile,String fragfile)
	{
		glCreateProgramObjectARB();
		this.vertID=glCreateShaderObjectARB(GL_VERTEX_SHADER_ARB);
		
		
	}
}
