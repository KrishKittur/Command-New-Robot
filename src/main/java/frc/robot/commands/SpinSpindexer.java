package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SpindexerSubsystem;

public class SpinSpindexer extends CommandBase {

    private SpindexerSubsystem req_subsystem;

    public SpinSpindexer(SpindexerSubsystem subsystem) {
        req_subsystem = subsystem;
        addRequirements(subsystem);
    }

    // In the Initialize method, start the spindexer
    @Override
    public void initialize() {
        req_subsystem.setSpindexerMotorBP(0.1);
    }

    // In the end method, stop the encoder
    @Override
    public void end(boolean interrupted) {
        req_subsystem.setSpindexerMotorBP(0);
    }

    // In the isFinished method, return false
    @Override
    public boolean isFinished() {
        return false;
    }

}