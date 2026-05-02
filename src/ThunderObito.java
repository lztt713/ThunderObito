import java.awt.*;

public class ThunderObito extends GameEngine
{
    public static  void main(String[] args)
    {
        createGame(new ThunderObito(),10);
    }

    boolean up, down;
    boolean gameOver;

    int score,health,experience;




    public void update(double dt) {

    }


    public void paintComponent() {
        changeBackgroundColor(Color.red);
        clearBackground(width(), height());
    }
}