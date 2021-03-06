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
		LeftInMotor = new TalonSRX(5);
		RightInMotor = new TalonSRX(6);
		Robot.initTalonCoast(LeftInMotor);
		Robot.initTalonCoast(RightInMotor);
		
		
	}
	
	public void set(ControlMode mode, double intakevalue) {
		LeftInMotor.set(mode, intakevalue);
		RightInMotor.set(mode, -intakevalue);
		
	}
	
	public void stop() {
		LeftInMotor.set(ControlMode.PercentOutput, 0);
		RightInMotor.set(ControlMode.PercentOutput, 0);
		
	}
	public void in() {
		LeftInMotor.set(ControlMode.PercentOutput, 75);
		RightInMotor.set(ControlMode.PercentOutput, -75);
		
	}
	public void out() {
		LeftInMotor.set(ControlMode.PercentOutput, -75);
		RightInMotor.set(ControlMode.PercentOutput, 75);
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}

