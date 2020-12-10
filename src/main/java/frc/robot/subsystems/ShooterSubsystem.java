package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {

    private final CANSparkMax suckerMotor = new CANSparkMax(Constants.SUCKER_MOTOR_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax shooterMotor1 = new CANSparkMax(Constants.SHOOTER_MOTOR_1_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax shooterMotor2 = new CANSparkMax(Constants.SHOOTER_MOTOR_2_ID, CANSparkMaxLowLevel.MotorType.kBrushless);

    public ShooterSubsystem() {

    }

    public void startSucker() {
        suckerMotor.set(-1);
    }

    public void endSucker() {
        suckerMotor.set(0);
    }

    public void startShooter(double speed) {
        shooterMotor1.set(-1 * speed);
        shooterMotor2.set(speed);
    }

    public void endShooter() {
        shooterMotor1.set(0);
        shooterMotor2.set(0);
    }



   
}