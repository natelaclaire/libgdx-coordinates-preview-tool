import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.GL20;
import java.util.Random;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class CoordToolWindow extends ApplicationAdapter
{
    Ball ball;
    ShapeRenderer shape;
    Random r = new Random();
    private SpriteBatch batch;
    private BitmapFont font;
    private Viewport viewport;
    private Camera camera;

    @Override
    public void create() {
        camera = new OrthographicCamera();
        viewport = new ScreenViewport(camera);
        viewport.apply();
        
        shape = new ShapeRenderer();
        ball = new Ball(0, 0, 10);
        Gdx.input.setInputProcessor(new MyInputProcessor(ball));
        batch = new SpriteBatch();
        font = new BitmapFont();
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        shape.begin(ShapeRenderer.ShapeType.Filled);
        ball.update();
        ball.draw(shape);
        shape.end();
        
        batch.begin();
        font.setColor(Color.WHITE);
        font.draw(batch, coordsText(), ball.getX()+15, ball.getTranslatedY());
        batch.end();
    }
    
    @Override
    public void resize(int width, int height) {
        // use true here to center the camera
        // that's what you probably want in case of a UI
        viewport.update(width, height, true);
    }
    
    public String coordsText() {
        String retval = "Touch: " + ball.getX() + "," + ball.getY() + " / Screen: " + ball.getX() + "," + ball.getTranslatedY();
        
        return retval;
    }
}
