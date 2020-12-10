package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import frc.robot.commands.RunIntake;
import frc.robot.commands.RunShooter;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


public class RobotContainer {

  private final IntakeSubsystem intake_subsystem = new IntakeSubsystem();
  private final ShooterSubsystem shooter_subsystem = new ShooterSubsystem();
  private final XboxController controller = new XboxController(Constants.CONTROLLER_CHANNEL);

  public RobotContainer() {

    //configure bindings
    configureButtonBindings();

    //set default commands
    shooter_subsystem.setDefaultCommand(new RunShooter(shooter_subsystem, () -> controller.getTriggerAxis(Hand.kLeft)));

  }

  private void configureButtonBindings() {
    new JoystickButton(controller, XboxController.Button.kA.value).whenHeld(new RunIntake(intake_subsystem));
  }

  //Make this return a auto Command in the future
  public void getAutonomousCommand() {
    
  }

}
