package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;
import org.usfirst.frc.team4610.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeIn extends Command {

	public IntakeIn(){
		requires(Robot.intake);
		
	}
	
	public void initialize(){
		setTimeout(1); 
		
	}
	
	public void execute() {
		Robot.intake.set(ControlMode.PercentOutput, 100);
	}
	
	
	protected boolean isFinished() {

		return true;
	}
	
	protected void interupted() {
		end();
	}
}
