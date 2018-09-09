/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4610.robot;


public enum RobotMap {
LEFT_MOTOR(0),
RIGHT_MOTOR(1),
RIGHT_MOTOR_FOLLOW(3),
LEFT_MOTOR_FOLLOW(4),
LEFT_JOYSTICK(1),
RIGHT_JOYSTICK(2);


	public final int value;
	
	RobotMap(int value) {
		this.value = value;
	}
}
