package org.usfirst.frc.team4610.robot.subsystems;

import org.usfirst.frc.team4610.robot.Robot;
import org.usfirst.frc.team4610.robot.RobotMap;
import org.usfirst.frc.team4610.robot.commands.TankDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveBase extends Subsystem {

	private TalonSRX RightMotor;
	private TalonSRX RightMotorFollow;
	private TalonSRX LeftMotor;
	private TalonSRX LeftMotorFollow;
		
	public DriveBase() {
		RightMotor = new TalonSRX(RobotMap.RIGHT_MOTOR.value); 
		LeftMotor = new TalonSRX(RobotMap.LEFT_MOTOR.value);
		RightMotorFollow = new TalonSRX(RobotMap.RIGHT_MOTOR_FOLLOW.value); 
		LeftMotorFollow = new TalonSRX(RobotMap.LEFT_MOTOR_FOLLOW.value);
		
		Robot.initTalon(LeftMotor);
		Robot.initTalon(RightMotor);
		Robot.initTalon(LeftMotorFollow);
		Robot.initTalon(RightMotorFollow);
		
		LeftMotorFollow.follow(LeftMotor);
		RightMotorFollow.follow(RightMotor);
	}
	
	public void set(ControlMode mode, double leftvalue, double rightvalue) {
		LeftMotor.set(mode, leftvalue);
		RightMotor.set(mode, rightvalue);
	}

	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
	}

}
