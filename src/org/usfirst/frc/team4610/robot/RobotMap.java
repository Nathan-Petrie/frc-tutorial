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
LIFT_MOTOR(5),
LEFT_IN_MOTOR(6),
RIGHT_IN_MOTOR(7),
LIFT_BOTTOM(-250),
LIFT_SWITCH(-17000),
LIFT_SCALE(-79388),
LIFT_SPEED(75),
INTAKE_SPEED(75),
SHIFTER_PORT1(0),
SHIFTER_PORT2(1),
LEFT_JOYSTICK(1),
RIGHT_JOYSTICK(2),
BACKUP_JOYSTICK(3);


	public final int value;
	
	RobotMap(int value) {
		this.value = value;
	}
}
