package tanks;

import static java.util.Objects.requireNonNull;

public class SplashScreenController extends AbstractGame
{
    
    private final TanksModel MODEL;
    
    public SplashScreenController(TanksModel model)
    {
        this.MODEL = requireNonNull(model);
    }

    @Override
    public void setUp() throws Exception
    {
    }

    @Override
    public void shutDown() throws Exception
    {
    }

    @Override
    public void update(long elapsed)
    {
    }
}
