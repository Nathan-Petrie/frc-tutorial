/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4610.robot;

import org.usfirst.frc.team4610.robot.commands.HighGear;
import org.usfirst.frc.team4610.robot.commands.IntakeIn;
import org.usfirst.frc.team4610.robot.commands.IntakeOut;
import org.usfirst.frc.team4610.robot.commands.LiftBottom;
import org.usfirst.frc.team4610.robot.commands.LiftScale;
import org.usfirst.frc.team4610.robot.commands.LiftSwitch;
import org.usfirst.frc.team4610.robot.commands.LowGear;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	public static final double JOY_DEADZONE = .05; 
	public final Joystick LEFT_JOY = new Joystick(RobotMap.LEFT_JOYSTICK.value);
	public final Joystick RIGHT_JOY = new Joystick(RobotMap.RIGHT_JOYSTICK.value);
	public final Joystick BACKUP_JOY = new Joystick(RobotMap.BACKUP_JOYSTICK.value);
	Button button1 = new JoystickButton(LEFT_JOY, 1),
			button2 = new JoystickButton(LEFT_JOY, 2),
			button3 = new JoystickButton(LEFT_JOY, 3),
			button4 = new JoystickButton(LEFT_JOY, 4),
			button5 = new JoystickButton(LEFT_JOY, 5),
			button6 = new JoystickButton(LEFT_JOY, 6),
			button7 = new JoystickButton(LEFT_JOY, 7),
			button8 = new JoystickButton(LEFT_JOY, 8),
			button11 = new JoystickButton(RIGHT_JOY, 1),
			button12 = new JoystickButton(RIGHT_JOY, 2),
			button13 = new JoystickButton(RIGHT_JOY, 3),
			button14 = new JoystickButton(RIGHT_JOY, 4),
			button15 = new JoystickButton(RIGHT_JOY, 5),
			button16 = new JoystickButton(RIGHT_JOY, 6),
			button17 = new JoystickButton(RIGHT_JOY, 7),
			button18 = new JoystickButton(RIGHT_JOY, 8),
			button01 = new JoystickButton(BACKUP_JOY, 1),
			button02 = new JoystickButton(BACKUP_JOY, 2),
			button03 = new JoystickButton(BACKUP_JOY, 3),
			button04 = new JoystickButton(BACKUP_JOY, 4),
			button05 = new JoystickButton(BACKUP_JOY, 5),
			button06 = new JoystickButton(BACKUP_JOY, 6),
			button07 = new JoystickButton(BACKUP_JOY, 7),
			button08 = new JoystickButton(BACKUP_JOY, 8);
	
	public double getLeftJoyX() {
		double raw = LEFT_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getLeftJoyY() {
		double raw = LEFT_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getRightJoyX() {
		double raw = RIGHT_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getRgihtJoyY() {
		double raw = RIGHT_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getBackupJoyX() {
		double raw = BACKUP_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	
	public OI() {
		button01.whenPressed(new LiftBottom());
		button13.whenPressed(new HighGear());
		button4.whenPressed(new LowGear());
		button3.whileHeld(new IntakeIn());
		button14.whileHeld(new IntakeOut());
		button02.whenPressed(new LiftSwitch());
		button03.whenPressed(new LiftScale());
		
	}
	
}
