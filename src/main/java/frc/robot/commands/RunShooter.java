package frc.robot.commands;

import frc.robot.subsystems.ShooterSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import java.util.function.DoubleSupplier;;


public class RunShooter extends CommandBase {

  private ShooterSubsystem req_subsystem;
  private DoubleSupplier shooterSpeed;
 

  public RunShooter(ShooterSubsystem subsystem, DoubleSupplier speed) {
    req_subsystem = subsystem;
    addRequirements(subsystem);
    shooterSpeed = speed;
  }

  @Override
  public void execute() {
    if (shooterSpeed.getAsDouble() > 0.1) {
        req_subsystem.startShooter(shooterSpeed.getAsDouble());
        req_subsystem.startSucker();
    } else {
        req_subsystem.endSucker();
        req_subsystem.endShooter();
    }
  }

  @Override
  public void end(boolean interrupted) {
    req_subsystem.endSucker();
    req_subsystem.endShooter();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
