package tanks;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import static java.util.Objects.requireNonNull;

class TanksGame implements Game
{

    private final TanksModel MODEL;
    private final SplashScreenController SPLASH;
    private final MainMenuController MAINMENU;
    private final PlayGameController PLAYGAME;
    private final PauseGameController PAUSEGAME;
    private final CreditsController CREDITS;
    
    public TanksGame(TanksModel model)
    {
        this.MODEL = requireNonNull(model);
        this.SPLASH = new SplashScreenController(model);
        this.MAINMENU = new MainMenuController(model);
        this.PLAYGAME = new PlayGameController(model);
        this.PAUSEGAME = new PauseGameController(model);
        this.CREDITS = new CreditsController(model);
    }

    @Override
    public void setUp() throws Exception
    {
        this.SPLASH.setUp();
        this.MAINMENU.setUp();
        this.PLAYGAME.setUp();
        this.PAUSEGAME.setUp();
        this.CREDITS.setUp();
    }

    @Override
    public void shutDown() throws Exception
    {
        this.SPLASH.shutDown();
        this.MAINMENU.shutDown();
        this.PLAYGAME.shutDown();
        this.PAUSEGAME.shutDown();
        this.CREDITS.shutDown();
    }

    @Override
    public void update(long elapsed)
    {
        switch(MODEL.getScene())
        {
            case SplashScreen:
                SPLASH.update(elapsed);
                break;
            case MainMenu:
                MAINMENU.update(elapsed);
                break;
            case PlayGame:
                PLAYGAME.update(elapsed);
                break;
            case PauseGame:
                PAUSEGAME.update(elapsed);
                break;
            case Credits:
                CREDITS.update(elapsed);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        switch(MODEL.getScene())
        {
            case SplashScreen:
                SPLASH.keyTyped(e);
                break;
            case MainMenu:
                MAINMENU.keyTyped(e);
                break;
            case PlayGame:
                PLAYGAME.keyTyped(e);
                break;
            case PauseGame:
                PAUSEGAME.keyTyped(e);
                break;
            case Credits:
                CREDITS.keyTyped(e);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        switch(MODEL.getScene())
        {
            case SplashScreen:
                SPLASH.keyPressed(e);
                break;
            case MainMenu:
                MAINMENU.keyPressed(e);
                break;
            case PlayGame:
                PLAYGAME.keyPressed(e);
                break;
            case PauseGame:
                PAUSEGAME.keyPressed(e);
                break;
            case Credits:
                CREDITS.keyPressed(e);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        switch(MODEL.getScene())
        {
            case SplashScreen:
                SPLASH.keyReleased(e);
                break;
            case MainMenu:
                MAINMENU.keyReleased(e);
                break;
            case PlayGame:
                PLAYGAME.keyReleased(e);
                break;
            case PauseGame:
                PAUSEGAME.keyReleased(e);
                break;
            case Credits:
                CREDITS.keyReleased(e);
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        switch(MODEL.getScene())
        {
            case SplashScreen:
                SPLASH.mouseClicked(e);
                break;
            case MainMenu:
                MAINMENU.mouseClicked(e);
                break;
            case PlayGame:
                PLAYGAME.mouseClicked(e);
                break;
            case PauseGame:
                PAUSEGAME.mouseClicked(e);
                break;
            case Credits:
                CREDITS.mouseClicked(e);
                break;
        }
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        switch(MODEL.getScene())
        {
            case SplashScreen:
                SPLASH.mousePressed(e);
                break;
            case MainMenu:
                MAINMENU.mousePressed(e);
                break;
            case PlayGame:
                PLAYGAME.mousePressed(e);
                break;
            case PauseGame:
                PAUSEGAME.mousePressed(e);
                break;
            case Credits:
                CREDITS.mousePressed(e);
                break;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        switch(MODEL.getScene())
        {
            case SplashScreen:
                SPLASH.mouseReleased(e);
                break;
            case MainMenu:
                MAINMENU.mouseReleased(e);
                break;
            case PlayGame:
                PLAYGAME.mouseReleased(e);
                break;
            case PauseGame:
                PAUSEGAME.mouseReleased(e);
                break;
            case Credits:
                CREDITS.mouseReleased(e);
                break;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        switch(MODEL.getScene())
        {
            case SplashScreen:
                SPLASH.mouseEntered(e);
                break;
            case MainMenu:
                MAINMENU.mouseEntered(e);
                break;
            case PlayGame:
                PLAYGAME.mouseEntered(e);
                break;
            case PauseGame:
                PAUSEGAME.mouseEntered(e);
                break;
            case Credits:
                CREDITS.mouseEntered(e);
                break;
        }
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        switch(MODEL.getScene())
        {
            case SplashScreen:
                SPLASH.mouseExited(e);
                break;
            case MainMenu:
                MAINMENU.mouseExited(e);
                break;
            case PlayGame:
                PLAYGAME.mouseExited(e);
                break;
            case PauseGame:
                PAUSEGAME.mouseExited(e);
                break;
            case Credits:
                CREDITS.mouseExited(e);
                break;
        }
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        switch(MODEL.getScene())
        {
            case SplashScreen:
                SPLASH.mouseDragged(e);
                break;
            case MainMenu:
                MAINMENU.mouseDragged(e);
                break;
            case PlayGame:
                PLAYGAME.mouseDragged(e);
                break;
            case PauseGame:
                PAUSEGAME.mouseDragged(e);
                break;
            case Credits:
                CREDITS.mouseDragged(e);
                break;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        switch(MODEL.getScene())
        {
            case SplashScreen:
                SPLASH.mouseMoved(e);
                break;
            case MainMenu:
                MAINMENU.mouseMoved(e);
                break;
            case PlayGame:
                PLAYGAME.mouseMoved(e);
                break;
            case PauseGame:
                PAUSEGAME.mouseMoved(e);
                break;
            case Credits:
                CREDITS.mouseMoved(e);
                break;
        }
    }
}
