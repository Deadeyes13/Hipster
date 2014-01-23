package view;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author CJ Oman
 * @version 1.1
 * @date Nov 25, 2013 8:16:59 AM
 */
@SuppressWarnings("serial")
public class PicturePanel extends JPanel
{
	private Image baseImage;
	private ImageIcon pictureSource;
	private int width;
	private int height;

	/**
	 * creates a PicturePanel object with the specific URL path, width and
	 * height.
	 * 
	 * @param imagePath
	 *            The URL address for the picture
	 * @param width
	 *            The width of the panel
	 * @param height
	 *            The height of the panel
	 */
	public PicturePanel(URL imagePath, int width, int height)
	{
		this.width = width;
		this.height = height;
		this.pictureSource = new ImageIcon(imagePath);
	}

	@Override
	protected void paintComponent(Graphics panelGraphics)
	{
		super.paintComponent(panelGraphics);
		baseImage = pictureSource.getImage();
		panelGraphics.drawImage(baseImage, 0, 0, width, height, null);
	}
}
