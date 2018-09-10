package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;
import org.usfirst.frc.team4610.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class LiftSwitch extends Command {

	public LiftSwitch(){
		requires(Robot.lift);
	}
	
	public void initialize(){
		
	}
	
	public void exicute() {
		if(Robot.lift.LiftMotor.getSelectedSensorPosition(0) > RobotMap.LIFT_SWITCH.value ) {
			Robot.lift.set(ControlMode.PercentOutput, -RobotMap.LIFT_SPEED.value);
		}
		else if(Robot.lift.LiftMotor.getSelectedSensorPosition(0) < RobotMap.LIFT_SWITCH.value ) {
			Robot.lift.set(ControlMode.PercentOutput, RobotMap.LIFT_SPEED.value);
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

