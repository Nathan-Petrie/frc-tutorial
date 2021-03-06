/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4610.robot;

import org.usfirst.frc.team4610.robot.commands.IntakeIn;
import org.usfirst.frc.team4610.robot.commands.TankDrive;
import org.usfirst.frc.team4610.robot.subsystems.DriveBase;
import org.usfirst.frc.team4610.robot.subsystems.Intake;
import org.usfirst.frc.team4610.robot.subsystems.Lift;
import org.usfirst.frc.team4610.robot.subsystems.Pnumatics;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

public class Robot extends TimedRobot {
	public static OI m_oi;
	public static DriveBase drivebase;
	public static Lift lift;
	public static Pnumatics pnumatics;
	public static Intake intake;
	Compressor c1=new Compressor(); 
	Command m_autonomousCommand;
	SendableChooser<Command> m_chooser = new SendableChooser<>();
	Command tankDrive;
	Command intakeIn;
	@Override
	public void robotInit() {
		
		m_oi = new OI();
		drivebase = new DriveBase();
		lift = new Lift();
		intake = new Intake();
		pnumatics = new Pnumatics();
		tankDrive = new TankDrive();
		intakeIn = new IntakeIn();
		CameraServer.getInstance().startAutomaticCapture();
	}

	
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	
	@Override
	public void autonomousInit() {
		m_autonomousCommand = m_chooser.getSelected();

		

		if (m_autonomousCommand != null) {
			m_autonomousCommand.start();
		}
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		//tankDrive.start();
		
		if (m_autonomousCommand != null) {
			m_autonomousCommand.cancel();
		}
	}

	
	@Override
	public void teleopPeriodic() {
		Robot.m_oi.button1.whenPressed(intakeIn);
		Scheduler.getInstance().run();
	}

	
	@Override
	public void testPeriodic() {
	}
	
	public static void initTalonCoast(TalonSRX motor) {
		motor.setNeutralMode(NeutralMode.Coast);
		motor.neutralOutput();
		motor.setSensorPhase(false);
		motor.configNominalOutputForward(0.0, 0);
		motor.configNominalOutputReverse(0.0, 0);
		motor.configClosedloopRamp(0.5, 0);
	}
	
	public static void initTalonBrake(TalonSRX motor) {
		motor.setNeutralMode(NeutralMode.Brake);
		motor.neutralOutput();
		motor.setSensorPhase(false);
		motor.configNominalOutputForward(0.0, 0);
		motor.configNominalOutputReverse(0.0, 0);
		motor.configClosedloopRamp(0.55, 0);
	}
}
