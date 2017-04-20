package tanks;

import java.awt.Graphics;
import static java.util.Objects.requireNonNull;

public class CreditsPainter implements Painter
{

    private final TanksModel MODEL;
    
    public CreditsPainter(TanksModel model)
    {
        this.MODEL = requireNonNull(model);
    }
    
    @Override
    public void paint(Graphics g)
    {
    }
}
