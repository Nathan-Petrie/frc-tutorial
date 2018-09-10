package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;
import org.usfirst.frc.team4610.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class LiftBottom extends Command {

	public LiftBottom(){
		requires(Robot.lift);
	}
	
	public void initialize(){
		
	}
	
	public void exicute() {
		if(Robot.lift.LiftMotor.getSelectedSensorPosition(0) > RobotMap.LIFT_BOTTOM.value ) {
			Robot.lift.set(ControlMode.PercentOutput, -RobotMap.LIFT_SPEED.value);
		}
		
		else {
			Robot.lift.set(ControlMode.PercentOutput, 0);
		}
	}
	
	
	protected boolean isFinished() {

		return false;
	}
	
	protected void interupted() {
		end();
	}
}
