package tanks;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View
{

    private final ViewObserver OBSERVER;
    private final Painter PAINTER;
    private final int WIDTH;
    private final int HEIGHT;
    private final JFrame FRAME;
    private final JPanel CANVAS;

    public View(Game game, ViewObserver observer, Painter painter, String title, int width, int height)
    {

        final View THIS = this;
        this.OBSERVER = observer;
        this.PAINTER = painter;
        this.WIDTH = width;
        this.HEIGHT = height;
        Dimension size = new Dimension(width, height);
        this.CANVAS = new JPanel();
        this.CANVAS.addKeyListener(game);
        this.CANVAS.addMouseListener(game);
        this.CANVAS.addMouseMotionListener(game);
        this.CANVAS.setSize(size);
        this.CANVAS.setPreferredSize(size);
        this.CANVAS.setMinimumSize(size);
        this.CANVAS.setMaximumSize(size);
        this.FRAME = new JFrame(title);
        this.FRAME.setContentPane(CANVAS);
        this.FRAME.pack();
        this.FRAME.setResizable(false);
        this.FRAME.setLocationRelativeTo(null);
        this.FRAME.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.FRAME.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {

                OBSERVER.viewClosing(THIS);
                FRAME.setVisible(false);
                FRAME.dispose();
            }
        });
    }

    void open()
    {

        this.FRAME.setVisible(true);
        this.CANVAS.requestFocus();
        this.FRAME.createBufferStrategy(2);
    }

    void render()
    {

        BufferStrategy STRATEGY = this.FRAME.getBufferStrategy();
        Insets in = FRAME.getInsets();
        Graphics g = STRATEGY.getDrawGraphics().create(in.left, in.top, WIDTH, HEIGHT);
        PAINTER.paint(g);
        g.dispose();
        STRATEGY.show();
        FRAME.getToolkit().sync();
    }
}
