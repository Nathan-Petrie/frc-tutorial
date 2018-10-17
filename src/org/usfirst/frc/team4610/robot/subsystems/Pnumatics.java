package org.usfirst.frc.team4610.robot.subsystems;

import org.usfirst.frc.team4610.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

	public class Pnumatics extends Subsystem {
		public DoubleSolenoid IntakeSol;
		public DoubleSolenoid ShifterSol;
	
		public Pnumatics() {
		
		IntakeSol = new DoubleSolenoid(1,2);
		ShifterSol = new DoubleSolenoid(3,4);
		
		}
	
		public void shift(DoubleSolenoid.Value value) {
			ShifterSol.set(value);
		}
		
		public void intakeArms(DoubleSolenoid.Value value) {
			IntakeSol.set(value);
		}

		@Override
		protected void initDefaultCommand() {

		}

	}
