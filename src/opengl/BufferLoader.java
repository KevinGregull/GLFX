package opengl;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class BufferLoader
{
	public static ByteBuffer[] loadIcon(String filepath)
	{
		BufferedImage image=null;
		try
		{
			image=ImageIO.read(new FileInputStream(filepath));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		ByteBuffer[] buffers=new ByteBuffer[3];
		buffers[0]=loadIconInstance(image,128);
		buffers[1]=loadIconInstance(image,32);
		buffers[2]=loadIconInstance(image,16);

		return buffers;
	}

	private static ByteBuffer loadIconInstance(BufferedImage image,int dimension)
	{
		BufferedImage scaledIcon=new BufferedImage(dimension,dimension,
				BufferedImage.TYPE_INT_ARGB_PRE);
		Graphics2D g=scaledIcon.createGraphics();

		double ratio=getIconRatio(image,scaledIcon);
		double width=image.getWidth()*ratio;
		double height=image.getHeight()*ratio;

		g.drawImage(image,(int)((scaledIcon.getWidth()-width)/2),
				(int)((scaledIcon.getHeight()-height)/2),(int)(width),
				(int)(height),null);

		g.dispose();

		return readImageAsByteBuffer(scaledIcon);
	}

	private static double getIconRatio(BufferedImage originalImage,
			BufferedImage icon)
	{
		double ratio=1;

		if(originalImage.getWidth()>icon.getWidth())
		{
			ratio=(double)(icon.getWidth())/originalImage.getWidth();
		}
		else
		{
			ratio=icon.getWidth()/originalImage.getWidth();
		}
		if(originalImage.getHeight()>icon.getHeight())
		{
			double r2=(double)(icon.getHeight())/originalImage.getHeight();

			if(r2<ratio)
			{
				ratio=r2;
			}
		}
		else
		{
			double r2=icon.getHeight()/originalImage.getHeight();

			if(r2<ratio)
			{
				ratio=r2;
			}
		}

		return ratio;
	}

	public static ByteBuffer readImageAsByteBuffer(BufferedImage image)
	{
		byte[] imageBuffer=new byte[image.getWidth()*image.getHeight()*4];

		int counter=0;
		for(int i=0;i<image.getHeight();i++)
		{
			for(int j=0;j<image.getWidth();j++)
			{
				int colorSpace=image.getRGB(j,i);

				imageBuffer[counter]=(byte)((colorSpace<<8)>>24);
				imageBuffer[counter+1]=(byte)((colorSpace<<16)>>24);
				imageBuffer[counter+2]=(byte)((colorSpace<<24)>>24);
				imageBuffer[counter+3]=(byte)(colorSpace>>24);

				counter+=4;
			}
		}

		return ByteBuffer.wrap(imageBuffer);
	}
}
