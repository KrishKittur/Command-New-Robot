package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {

    private final CANSparkMax intakeMotor = new CANSparkMax(Constants.INTAKE_MOTOR_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
    

    public IntakeSubsystem() {
       intakeMotor.setSmartCurrentLimit(4);
       intakeMotor.setSecondaryCurrentLimit(5);
    }

    public void startIntake() {
        intakeMotor.set(0.3);
    }

    public void endIntake() {
        intakeMotor.set(0);
    }

}

