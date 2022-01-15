package programme.elements;

import interpreter.Turtle;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.PixelWriter;
import javafx.scene.transform.Rotate;
import utils.Vector2D;


public class LogoCanvas extends Group {
    private final static double WIDTH = 800;
    private final static double HEIGHT = 680;
    private final static double TURTLE_SIZE = 20.;
    private final static String TURTLE_PATH = "turtle.png";

    private final Image turtleImage;
    private final Canvas foreground;
    private final Canvas background;

    public LogoCanvas() {
        super();
        foreground = new Canvas(WIDTH, HEIGHT);
        background = new Canvas(WIDTH, HEIGHT);

        this.getChildren().add(background);
        this.getChildren().add(foreground);

        turtleImage = new Image(getClass().getResource(TURTLE_PATH).toString(), TURTLE_SIZE, TURTLE_SIZE, false, false);
    }

    public void paintLine(Vector2D oldPosition, Turtle turtle) {
        GraphicsContext gc = background.getGraphicsContext2D();
        gc.setLineWidth(turtle.getPenSize());
        System.out.println(turtle.getPenSize());
        gc.setStroke(turtle.getPenColour().toJavaFXColour());

        Vector2D turtlePosition = toCanvasCoordinates(turtle.getPosition());
        Vector2D oldPositionTransform = toCanvasCoordinates(oldPosition);
        gc.strokeLine(oldPositionTransform.x,oldPositionTransform.y,turtlePosition.x, turtlePosition.y);
    }

    public void paintTurtle(Turtle turtle) {
        GraphicsContext gc = foreground.getGraphicsContext2D();

        double angle = turtle.getRotation().getRotationOnCanvas();
        Vector2D position = toCanvasCoordinates(turtle.getPosition());
        drawRotatedTurtle(gc, angle, position.x, position.y);
    }

    public void repaintTurtle(Vector2D oldPosition, int oldAngle, Turtle turtle) {
        removeTurtle(oldPosition, oldAngle);
        paintTurtle(turtle);
    }

    public void removeTurtle(Vector2D oldPosition, int oldAngle) {
        Vector2D transformed = toCanvasCoordinates(oldPosition);
        GraphicsContext gc = foreground.getGraphicsContext2D();
        removeRotatedTurtle(gc, oldAngle, transformed.x, transformed.y);
    }

    public static Vector2D toCanvasCoordinates(Vector2D oldVector) {
        double newX = -(oldVector.x - WIDTH/2);
        double newY = -(oldVector.y - HEIGHT/2);
        return new Vector2D(newX, newY);
    }

    private void rotate(GraphicsContext gc, double angle, double px, double py) {
        Rotate r = new Rotate(angle, px, py);
        gc.setTransform(r.getMxx(), r.getMyx(), r.getMxy(), r.getMyy(), r.getTx(), r.getTy());
    }

    private void drawRotatedTurtle(GraphicsContext gc, double angle, double x, double y) {
        gc.save(); // saves the current state on stack, including the current transform
        rotate(gc, angle, x  , y );
        gc.drawImage(turtleImage, x- TURTLE_SIZE/2, y- TURTLE_SIZE/2, TURTLE_SIZE, TURTLE_SIZE);
        gc.restore(); // back to original state (before rotation)
    }

    private void removeRotatedTurtle(GraphicsContext gc, double angle, double x, double y) {
        gc.save(); // saves the current state on stack, including the current transform
        rotate(gc, angle, x  , y);
        gc.clearRect(x- TURTLE_SIZE/2, y- TURTLE_SIZE/2, TURTLE_SIZE, TURTLE_SIZE);
        gc.restore(); // back to original state (before rotation)
    }

    public void clean() {
        background.getGraphicsContext2D().clearRect(0,0, WIDTH, HEIGHT);
    }
}