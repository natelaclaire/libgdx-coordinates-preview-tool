import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Input;

public class MyInputProcessor implements InputProcessor {
    Ball ball;
    
    public MyInputProcessor(Ball ball) {
        this.ball = ball;
    }
    
   public boolean keyDown (int keycode) {
      return false;
   }

   public boolean keyUp (int keycode) {
      return false;
   }

   public boolean keyTyped (char character) {
      return false;
   }

   public boolean touchDown(int x, int y, int pointer, int button) {
        if (button == Input.Buttons.LEFT) {
            ball.setCoords(x, y);
            return true;
        }
        return false;
    }

   public boolean touchUp (int x, int y, int pointer, int button) {
      return false;
   }

   public boolean touchDragged (int x, int y, int pointer) {
      return false;
   }

   public boolean mouseMoved (int x, int y) {
      return false;
   }

   public boolean scrolled (int amount) {
      return false;
   }
}