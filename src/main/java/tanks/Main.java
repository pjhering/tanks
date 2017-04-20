package tanks;

import java.util.Objects;

public class Main implements ViewObserver
{

    private final Game GAME;
    private final View VIEW;
    private final Loop LOOP;

    public Main(Game game, Painter painter, String title, int width, int height)
    {

        GAME = Objects.requireNonNull(game);
        VIEW = new View(GAME, this, painter, title, width, height);
        LOOP = new Loop(GAME, VIEW);
    }
    
    public static void main(String[] args)
    {
        TanksModel model = new TanksModel(800, 600);
        Game game = new TanksGame(model);
        Painter painter = new TanksPainter(model);
        
        Main main = new Main(game, painter, "Tanks", 800, 600);
        main.launch();
    }

    public void launch()
    {

        VIEW.open();
        LOOP.start();
    }

    @Override
    public void viewClosing(View view)
    {

        LOOP.interrupt();
    }
}
