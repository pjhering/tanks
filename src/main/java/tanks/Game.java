package tanks;

import java.awt.event.KeyListener;
import javax.swing.event.MouseInputListener;

public interface Game extends KeyListener, MouseInputListener
{

    public void setUp() throws Exception;

    public void shutDown() throws Exception;

    public void update(long elapsed);
}
