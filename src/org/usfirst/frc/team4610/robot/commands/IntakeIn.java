package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;
import org.usfirst.frc.team4610.robot.RobotMap;
import org.usfirst.frc.team4610.robot.OI;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeIn extends Command {

	private static final int Time = 0;

	public IntakeIn(){
		requires(Robot.intake);
		
		
	}
	
	public void initialize(){
		
	}
	
	public void execute() {
		//this makes it run for 1 decond, i will post on github how to make it button controlled
		setTimeout(1); 
		Robot.intake.in();
		
	}
	
	
	protected boolean isFinished() {
		 
		//Inexact code for button determination, i will upload to github the real deal later
		//Robot.OI.button1.isPressed();
		return isTimedOut();
	}
	
	//this end function runs once when the program is finished. Turn off what should be off if ntohing is running
	protected void end () {
		Robot.intake.stop();
	}
	
	protected void interupted() {
		
		end();
	}
}
