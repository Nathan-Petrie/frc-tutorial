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
	
	public void exicute() {
		double throttle = ( 1.0 -Robot.m_oi.LEFT_JOY.getThrottle()) / -2.0;
		
		Robot.drivebase.set(ControlMode.PercentOutput, Robot.m_oi.getLeftJoyY() * throttle, 
				Robot.m_oi.getRgihtJoyY() * throttle);
	}
	
	
	protected boolean isFinished() {

		return false;
	}
	
	protected void interupted() {
		end();
	}
}
