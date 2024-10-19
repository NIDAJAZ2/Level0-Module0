package _02_code_flow._1_robot_square;
import org.jointheleague.graphical.robot.Robot;
public class RobotSquare {
	public static void main(String[] args) {
		Robot rob = new Robot();
        rob.penDown();
        rob.setSpeed(10);
        int count =0;
     rob.move(50);
        rob.turn(90);
        count = count + 1;
         while(count < 4){
			count = count + 1;
		 }
}
}