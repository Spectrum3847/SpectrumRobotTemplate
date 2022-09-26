package frc.robot.pilot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.Robot;

/** Add your docs here. */
public class PilotCommands {

    /** Set default command to turn off the rumble */
    public static void setupDefaultCommand() {
        Robot.pilotGamepad.setDefaultCommand(rumblePilot(0));
    }

    /** Command that can be used to rumble the pilot controller */
    public static Command rumblePilot(double intensity) {
        return new RunCommand(() -> Robot.pilotGamepad.rumble(intensity), Robot.pilotGamepad);
    }
}
