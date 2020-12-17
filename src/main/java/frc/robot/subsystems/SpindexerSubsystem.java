package frc.robot.subsystems;

import static frc.robot.Constants.*;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SpindexerSubsystem extends SubsystemBase {

    // Instantiate the hardware
    private final CANSparkMax spindexerMotor = new CANSparkMax(SPINDEXER_MOTOR_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final DutyCycleEncoder spindexerEncoder = new DutyCycleEncoder(SPINDEXER_ENCODER_CHANNEL);

    public SpindexerSubsystem() {
        spindexerMotor.setSmartCurrentLimit(14);
        spindexerMotor.setSecondaryCurrentLimit(16);
        spindexerEncoder.setDistancePerRotation(SPINDEXER_ENCODER_DPR);
    }

    // Method to return the spindexer encoders readings 
    public double readSpindexerEncoder() { return spindexerEncoder.getDistance(); }

    // Method to set the spindexer motor's power through percent
    public void setSpindexerMotorBP(double speed) { spindexerMotor.set(speed); }

    // Method to set the spindexer motor's power through voltage
    public void setSpindexerMotorBV(double voltage) { spindexerMotor.set(voltage); }

}