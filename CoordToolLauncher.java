import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class CoordToolLauncher {
    public static void main (String[] args)
    {
        // To start a LibGDX program, this method:
        // (1) creates an instance of the game
        // (2) creates a new application with game instance as argument
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();

        cfg.title = "yourGame";
        cfg.width = LwjglApplicationConfiguration.getDesktopDisplayMode().width;
        cfg.height = LwjglApplicationConfiguration.getDesktopDisplayMode().height;
        cfg.fullscreen = true;

        CoordToolWindow myProgram = new CoordToolWindow();
        LwjglApplication launcher = new LwjglApplication( myProgram, cfg );
    }
}
