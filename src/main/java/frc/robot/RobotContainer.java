package frc.robot;

import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.SpinSpindexer;
import frc.robot.subsystems.SpindexerSubsystem;

public class RobotContainer {

  public SpindexerSubsystem spindexer_subsystem = new SpindexerSubsystem();
  public XboxController controller = new XboxController(CONTROLLER_CHANNEL);

  public RobotContainer() {

    //configure bindings
    configureButtonBindings();

  }

  private void configureButtonBindings() {
    // If the A button is held, then start spinning the spindexer
    new JoystickButton(controller, Button.kA.value).whenHeld(new SpinSpindexer(spindexer_subsystem));
  }

  //Make this return a auto Command in the future
  public void getAutonomousCommand() {
    
  }

}
