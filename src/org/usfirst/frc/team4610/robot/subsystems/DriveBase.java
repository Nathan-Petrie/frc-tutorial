package org.usfirst.frc.team4610.robot.subsystems;

import org.usfirst.frc.team4610.robot.Robot;
import org.usfirst.frc.team4610.robot.RobotMap;
import org.usfirst.frc.team4610.robot.commands.TankDrive;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveBase extends Subsystem {

	private TalonSRX RightMotor;
	private TalonSRX RightMotorFollow;
	private TalonSRX LeftMotor;
	private TalonSRX LeftMotorFollow;
		
	public DriveBase() {
		RightMotor = new TalonSRX(1); 
		LeftMotor = new TalonSRX(3);
		RightMotorFollow = new TalonSRX(2); 
		LeftMotorFollow = new TalonSRX(4);
		Robot.initTalonBrake(LeftMotor);
		Robot.initTalonBrake(RightMotor);
		Robot.initTalonBrake(LeftMotorFollow);
		Robot.initTalonBrake(RightMotorFollow);
		
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
