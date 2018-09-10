package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class LiftManual extends Command {

	public LiftManual(){
		requires(Robot.lift);
	}
	
	public void initialize(){
		
	}
	
	public void exicute() {
		
		
		Robot.lift.set(ControlMode.PercentOutput, Robot.m_oi.getBackupJoyX() );
	}
	
	
	protected boolean isFinished() {

		return false;
	}
	
	protected void interupted() {
		end();
	}
}
