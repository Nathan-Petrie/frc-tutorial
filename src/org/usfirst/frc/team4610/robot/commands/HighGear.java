package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;
import org.usfirst.frc.team4610.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

public class HighGear extends Command {

	public HighGear(){
		requires(Robot.pnumatics);
	}
	
	public void initialize(){
		setTimeout(.1);
	}
	
	public void execute() {
		Robot.pnumatics.shift(Value.kForward);
	}
	
	
	protected boolean isFinished() {
		isTimedOut();
		return false;
	}
	
	protected void interupted() {
		end();
	}
}
