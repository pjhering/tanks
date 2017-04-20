package tanks;

import java.awt.Graphics;
import static java.util.Objects.requireNonNull;

public class TanksPainter implements Painter
{
    
    private final TanksModel MODEL;
    private final SplashScreenPainter SPLASH;
    private final MainMenuPainter MAINMENU;
    private final PlayGamePainter PLAYGAME;
    private final PauseGamePainter PAUSEGAME;
    private final CreditsPainter CREDITS;
    private final ErrorPainter ERROR;
    
    public TanksPainter(TanksModel model)
    {
        this.MODEL = requireNonNull(model);
        this.SPLASH = new SplashScreenPainter(MODEL);
        this.MAINMENU = new MainMenuPainter(MODEL);
        this.PLAYGAME = new PlayGamePainter(MODEL);
        this.PAUSEGAME = new PauseGamePainter(MODEL);
        this.CREDITS = new CreditsPainter(MODEL);
        this.ERROR = new ErrorPainter(MODEL);
    }

    @Override
    public void paint(Graphics g)
    {
        switch(MODEL.getScene())
        {
            case SplashScreen:
                SPLASH.paint(g);
                break;
            case MainMenu:
                MAINMENU.paint(g);
                break;
            case PlayGame:
                PLAYGAME.paint(g);
                break;
            case PauseGame:
                PAUSEGAME.paint(g);
                break;
            case Credits:
                CREDITS.paint(g);
                break;
            default:
                ERROR.paint(g);
                break;
        }
    }
}
