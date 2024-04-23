import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.Color;

public class Ball {
    int x;
    int y;
    int size;
    Color color = Color.WHITE;

    public Ball(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }
    public void update() {
        
    }
    public void draw(ShapeRenderer shape){
        shape.setColor(color);
        shape.circle(x, getTranslatedY(), size);
    }
    public void setCoords(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getTranslatedY() {
        return Gdx.graphics.getHeight() - 1 - y;
    }
}