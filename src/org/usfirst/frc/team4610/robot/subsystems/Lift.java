package org.usfirst.frc.team4610.robot.subsystems;

import org.usfirst.frc.team4610.robot.Robot;
import org.usfirst.frc.team4610.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Lift extends Subsystem {
	public TalonSRX LiftMotor; 
	
	
	public Lift() {
		LiftMotor = new TalonSRX(RobotMap.LIFT_MOTOR.value);
		
		Robot.initTalonBrake(LiftMotor);
		
		LiftMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		LiftMotor.setSelectedSensorPosition(0, 0 ,10);
	}
	
	public void set(ControlMode mode, double liftvalue) {
		LiftMotor.set(mode, liftvalue);
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
