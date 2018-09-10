package org.usfirst.frc.team4610.robot.subsystems;

import org.usfirst.frc.team4610.robot.Robot;
import org.usfirst.frc.team4610.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {

	private TalonSRX LeftInMotor;
	private TalonSRX RightInMotor;

	
	
	public Intake() {
		LeftInMotor = new TalonSRX(RobotMap.LEFT_IN_MOTOR.value);
		RightInMotor = new TalonSRX(RobotMap.RIGHT_IN_MOTOR.value);
		Robot.initTalonCoast(LeftInMotor);
		Robot.initTalonCoast(RightInMotor);
		
		
	}
	
	public void set(ControlMode mode, double intakevalue) {
		LeftInMotor.set(mode, intakevalue);
		RightInMotor.set(mode, -intakevalue);
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
