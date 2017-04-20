package tanks;

import java.awt.Graphics;
import static java.util.Objects.requireNonNull;

public class ErrorPainter implements Painter
{

    private final TanksModel MODEL;
    
    public ErrorPainter(TanksModel model)
    {
        this.MODEL = requireNonNull(model);
    }
    
    @Override
    public void paint(Graphics g)
    {
    }
}
