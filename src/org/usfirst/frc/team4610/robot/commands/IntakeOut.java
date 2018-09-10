package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;
import org.usfirst.frc.team4610.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeOut extends Command {

	public IntakeOut(){
		requires(Robot.intake);
	}
	
	public void initialize(){
		
	}
	
	public void exicute() {
		Robot.intake.set(ControlMode.PercentOutput, -RobotMap.INTAKE_SPEED.value);
	}
	
	
	protected boolean isFinished() {

		return false;
	}
	
	protected void interupted() {
		end();
	}
}
