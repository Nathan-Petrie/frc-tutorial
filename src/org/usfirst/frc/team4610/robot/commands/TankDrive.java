package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {
	
	public TankDrive(){
		requires(Robot.drivebase);
	}
	
	public void initialize(){
		
	}
	
	public void execute() {
		//double throttle = ( 1.0 -Robot.m_oi.LEFT_JOY.getThrottle()) / -2.0;
		
		Robot.drivebase.set(ControlMode.PercentOutput, -Robot.m_oi.LEFT_JOY.getRawAxis(1), 
				Robot.m_oi.RIGHT_JOY.getRawAxis(1));
	}
	
	
	protected boolean isFinished() {

		return false;
	}
	
	protected void interupted() {
		end();
	}
}
