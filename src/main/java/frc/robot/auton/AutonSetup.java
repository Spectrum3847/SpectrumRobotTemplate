package frc.robot.auton;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.PrintCommand;
import frc.robot.Robot;

public class AutonSetup {
    public static final SendableChooser<Command> autonChooser = new SendableChooser<>();

    // A chooser for autonomous commands
    public static void setupSelectors() {
        autonChooser.setDefaultOption("Nothing", new PrintCommand("Doing Nothing in Auton"));
    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public static Command getAutonomousCommand() {
        // return new CharacterizeLauncher(Robot.launcher);
        return autonChooser.getSelected();
    }
}
