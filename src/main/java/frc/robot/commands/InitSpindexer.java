package frc.robot.commands;

import static frc.robot.Constants.*;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpiutil.math.MathUtil;
import frc.robot.subsystems.SpindexerSubsystem;

public class InitSpindexer extends CommandBase {

    private SpindexerSubsystem req_subsystem;
    private PIDController spindexerPIDController = new PIDController(SPINDEXER_ENCODER_KI, SPINDEXER_ENCODER_KI, SPINDEXER_ENCODER_KD);
    private double setPoint;

    public InitSpindexer(SpindexerSubsystem subsystem) {
        req_subsystem = subsystem;
        addRequirements(subsystem);
        spindexerPIDController.setTolerance(3, 1);
    }

    // In the initalize method, set the setpoint for the pid controller
    @Override
    public void initialize() {
        setPoint = SPINDEXER_START_POSITION - req_subsystem.readSpindexerEncoder();
    }

    // In the execute method, set the spindexer motor depending on the PID controller's output
    @Override
    public void execute() {
        double outputPID = MathUtil.clamp(spindexerPIDController.calculate(req_subsystem.readSpindexerEncoder(), setPoint), -12, 12);
        req_subsystem.setSpindexerMotorBV(outputPID);
    }

    // If the controller detects that it is at its sepoint, then end the command
    @Override
    public boolean isFinished() {
        return spindexerPIDController.atSetpoint();
    }

    // In the end method, set the spindexer voltage to 0 and reset the spindexer encoder's position to 0
    @Override
    public void end(boolean interrupted) {
        req_subsystem.setSpindexerMotorBV(0);
        req_subsystem.resetSpindexerEncoder();
    }
    

}