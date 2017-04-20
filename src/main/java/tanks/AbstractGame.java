package tanks;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.util.Date;

public abstract class AbstractGame implements Game
{

    private static final DateFormat FMT = DateFormat.getTimeInstance(DateFormat.LONG);

    protected void log(Object obj)
    {

        System.out.print(getClass().getSimpleName());
        System.out.print("::");
        System.out.print(FMT.format(new Date()));
        System.out.print("::");
        System.out.println(obj);
    }

    public void keyTyped(KeyEvent e)
    {
    }

    public void keyPressed(KeyEvent e)
    {
    }

    public void keyReleased(KeyEvent e)
    {
    }

    public void mouseClicked(MouseEvent e)
    {
    }

    public void mousePressed(MouseEvent e)
    {
    }

    public void mouseReleased(MouseEvent e)
    {
    }

    public void mouseEntered(MouseEvent e)
    {
    }

    public void mouseExited(MouseEvent e)
    {
    }

    public void mouseDragged(MouseEvent e)
    {
    }

    public void mouseMoved(MouseEvent e)
    {
    }
}
