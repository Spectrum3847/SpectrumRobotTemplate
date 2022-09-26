package frc.robot.pilot;

/** Constants used by the Pilot Gamepad */
public class PilotConstants {
    public static final int port = 0;

    public static final double throttleExp = 1.2;
    public static final double throttleScaler = -1.0;
    public static final double throttleDeadband = 0.15;
    public static final double steeringExp = throttleExp;
    public static final double steeringScaler = -1.0;
    public static final double steeringDeadband = throttleDeadband;
}
