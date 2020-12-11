package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {

    private final CANSparkMax intakeMotor = new CANSparkMax(Constants.INTAKE_MOTOR_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
    

    public IntakeSubsystem() {
       intakeMotor.setSmartCurrentLimit(Constants.INTAKE_MOTOR_SMART_CURRENT);
       intakeMotor.setSecondaryCurrentLimit(Constants.INTAKE_MOTOR_SECONDARY_CURRENT);
    }

    public void startIntake() {
        intakeMotor.set(Constants.INTAKE_MOTOR_SPEED);
    }

    public void endIntake() {
        intakeMotor.set(0);
    }

}

