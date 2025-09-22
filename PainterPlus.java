import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  // Turns the Painter to the right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  // Choice A: Takes all paint from a paint bucket
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  // Choice B: Moves forward while a Painter object can move
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }

  // Choice C: Paints and moves while the Painter object has paint
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
  }

  // Choice D: Moves, turns, and paints in a donut shape
  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }
 // paints one row the string color.
  public void paintRow(String color) {
  while(canMove()){
   paint(color);
    move();
  paint(color);

  }
  }
  //paints the whole grid by using while, if, and else statements.
  public void paintGrid() {
  boolean goingRight = true;

  while (true) {
    paintRow("red");

    if (goingRight) {
      turnRight();
      if (!canMove()) break;
      move();
      turnRight();
    } else {
      turnLeft();
      if (!canMove()) break;
      move();
      turnLeft();
    }

    goingRight = !goingRight; 
  }
}

}
  
  
    
  


