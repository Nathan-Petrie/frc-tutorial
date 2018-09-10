package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

public class LowGear extends Command {

	public LowGear(){
		requires(Robot.drivebase);
	}
	
	public void initialize(){
		
	}
	
	public void exicute() {
		Robot.drivebase.position(Value.kReverse); 
	}
	
	
	protected boolean isFinished() {

		return false;
	}
	
	protected void interupted() {
		end();
	}
}
