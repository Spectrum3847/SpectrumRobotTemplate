package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class RobotConfig {

    private RobotType robotType;
    public final String Canivore = "3847";
    public final Motors motors = new Motors();
    public final Pneumatic pneumatic = new Pneumatic();
    public final String praticeBotMAC = "00-80-2F-1C-1C-1C";

    public final class Motors {
        public final int ExampleMotorID = 0;
    }

    public final class Pneumatic {
        public final int ExamplePneumatic = 0;
    }

    public RobotConfig() {
        checkRobotType();
        switch (getRobotType()) {
            case COMP:
                // Set all the constants specifically for the competition robot
                break;
            case PRACTICE:
                // Set all the constants specifically for the practice robot
                break;
            case SIM:
                // Set all the constants specifically for the simulation
                break;
        }
    }

    /** Set the RobotType based on if simulation or the MAC address of the RIO */
    public void checkRobotType() {
        if (Robot.isSimulation()) {
            robotType = RobotType.SIM;
            System.out.println("Robot Type: Simulation");
        } else if (Robot.MAC.equals(praticeBotMAC)) {
            robotType = RobotType.PRACTICE;
            System.out.println("Robot Type: Practice");
        } else {
            robotType = RobotType.COMP;
            System.out.println("Robot Type: Competition");
        }
    }

    public RobotType getRobotType() {
        return robotType;
    }

    public enum RobotType {
        COMP,
        PRACTICE,
        SIM
    }
}
