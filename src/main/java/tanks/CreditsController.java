package tanks;

import static java.util.Objects.requireNonNull;

public class CreditsController extends AbstractGame
{
    
    private final TanksModel MODEL;
    
    public CreditsController(TanksModel model)
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
