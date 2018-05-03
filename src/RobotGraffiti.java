import org.jointheleague.graphical.robot.Robot;
public class RobotGraffiti {
public static void main(String[] args) {
	Robot dot = new Robot();
	dot.setSpeed(100);
	dot.penDown();
	dot.turn(270);
	dot.move(10);
	dot.turn(90);
	dot.move(2);
	dot.penUp();
	dot.move(18);
	dot.penDown();
	dot.turn(90);
	dot.move(20);
	dot.turn(180);
	dot.move(10);
	dot.turn(270);
	dot.move(20);
	dot.hide();
	
}
}
