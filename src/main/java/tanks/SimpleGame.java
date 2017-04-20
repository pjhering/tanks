package tanks;

public abstract class SimpleGame extends AbstractGame implements Painter
{
    protected void log(String string)
    {
        System.out.println(string);
    }
}
