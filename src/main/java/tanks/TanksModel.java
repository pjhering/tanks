package tanks;

import static java.util.Objects.requireNonNull;

public class TanksModel
{
    private Scene scene;
    private int screenWidth, screenHeight;
    
    public TanksModel(int screenWidth, int screenHeight)
    {
        this.scene = Scene.SplashScreen;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }
    
    public void setScene(Scene scene)
    {
        this.scene = requireNonNull(scene);
    }
    
    public Scene getScene()
    {
        return this.scene;
    }

    public int getScreenWidth()
    {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth)
    {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight()
    {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight)
    {
        this.screenHeight = screenHeight;
    }
}
