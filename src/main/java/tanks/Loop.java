package tanks;

public class Loop extends Thread
{

    private final Game GAME;
    private final View VIEW;

    public Loop(Game game, View view)
    {

        super("game-loop");
        this.setPriority(8);
        this.GAME = game;
        this.VIEW = view;
    }

    @Override
    public void run()
    {

        try
        {

            GAME.setUp();

        } catch (Exception ex)
        {

            throw new RuntimeException(ex);
        }

        long time = System.currentTimeMillis();

        while (true)
        {

            long now = System.currentTimeMillis();
            long elapsed = now - time;
            time = now;

            if (elapsed > 0)
            {

                GAME.update(elapsed);
                VIEW.render();

                Thread.yield();

            } else
            {

                try
                {

                    Thread.sleep(10L);

                } catch (InterruptedException ex)
                {

                    System.out.println("interrupted");
                    break;
                }
            }
        }

        try
        {

            GAME.shutDown();

        } catch (Exception ex)
        {

            throw new RuntimeException(ex);
        }
    }
}
