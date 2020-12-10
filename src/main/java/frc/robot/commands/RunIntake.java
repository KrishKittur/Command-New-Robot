package frc.robot.commands;

import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class RunIntake extends CommandBase {

  private IntakeSubsystem req_subsystem;


  public RunIntake(IntakeSubsystem subsystem) {
    req_subsystem = subsystem;
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {
      req_subsystem.startIntake();
  }

  @Override
  public void end(boolean interrupted) {
      req_subsystem.endIntake();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
