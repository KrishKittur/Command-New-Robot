/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    // Controller Channels
    public static final int CONTROLLER_CHANNEL = 0;

    // Ports and ID's
    public static final int INTAKE_MOTOR_ID = 20;
    public static final int SUCKER_MOTOR_ID = 21;
    public static final int SHOOTER_MOTOR_1_ID = 22;
    public static final int SHOOTER_MOTOR_2_ID = 23;

    // Intake Motor Constants
    public static final int INTAKE_MOTOR_SMART_CURRENT = 8;
    public static final double INTAKE_MOTOR_SECONDARY_CURRENT = 10;
    public static final double INTAKE_MOTOR_SPEED = 10;

}
