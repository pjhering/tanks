package tanks;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import static java.util.Objects.requireNonNull;

public class SplashScreenPainter implements Painter
{
 
    private final TanksModel MODEL;
    private final String TITLE = "TANKS";
    private final String INSTRUCTION = "press any key to begin";
    private final Color BACKGROUND;
    private final Color FOREGROUND;
    private Font titleFont, instructionFont;
    private int width, height;
    private int titleX, titleY;
    private int instructionX, instructionY;

    SplashScreenPainter(TanksModel model)
    {
        this.MODEL = requireNonNull(model);
        this.BACKGROUND = new Color(0, 128, 0);
        this.FOREGROUND = new Color(64, 255, 64);
    }

    @Override
    public void paint(Graphics g)
    {
        if(this.width != MODEL.getScreenWidth() || this.height != MODEL.getScreenHeight())
        {
            update(g);
        }
        
        g.setColor(BACKGROUND);
        g.fillRect(0, 0, width, height);

        g.setFont(titleFont);
        g.setColor(FOREGROUND);
        g.drawString(TITLE, titleX, titleY);
        
        g.setFont(instructionFont);
        g.drawString(INSTRUCTION, instructionX, instructionY);
    }
    
    private void update(Graphics g)
    {
        this.width = MODEL.getScreenWidth();
        this.height = MODEL.getScreenHeight();
        
        int size = height / 4;
        titleFont = new Font("Arial", BOLD, size);
        FontMetrics titleMetrics = g.getFontMetrics(titleFont);
        Rectangle2D titleBounds = titleMetrics.getStringBounds(TITLE, g);
        titleX = (int)((width - titleBounds.getWidth()) / 2);
        titleY = (int)((height - titleBounds.getHeight()) / 2);
        
        instructionFont = new Font("Arial", BOLD, size / 4);
        FontMetrics instrMetrics = g.getFontMetrics(instructionFont);
        Rectangle2D instrBounds = instrMetrics.getStringBounds(INSTRUCTION, g);
        instructionX = (int)((width - instrBounds.getWidth()) / 2);
        instructionY = (int)(titleY + titleBounds.getHeight() + instrBounds.getHeight());
    }
}
