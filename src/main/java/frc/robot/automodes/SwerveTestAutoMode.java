package frc.robot.automodes;

import frc.robot.SwerveDriveRobotSubsystem;

import org.xero1425.base.actions.DelayAction;
import org.xero1425.base.actions.ParallelAction;
import org.xero1425.base.controllers.TestAutoMode;
import org.xero1425.base.swervedrive.SwerveAnglePowerAction;
import org.xero1425.base.swervedrive.SwerveAngleVelocityAction;
import org.xero1425.base.swervedrive.SwerveDirectionRotateAction;
import org.xero1425.base.swervedrive.SwervePathFollowAction;
import org.xero1425.base.swervedrive.SwerveRamseteAction;
import org.xero1425.base.swervedrive.SwerveDriveSubsystem;
import org.xero1425.base.swervedrive.SwerveNewPathAction;
import org.xero1425.base.swervedrive.SwerveSetMotorPowerAction;
import org.xero1425.base.swervedrive.SwerveStopAction;

public class SwerveTestAutoMode extends TestAutoMode {
    public SwerveTestAutoMode(SwerveDriveRobotAutoController ctrl) throws Exception {
        super(ctrl, "Swerver-Test-Mode");

        double[] angles = new double[4];
        double[] speeds = new double[4];
        SwerveDriveRobotSubsystem robotsys = (SwerveDriveRobotSubsystem) ctrl.getRobot().getRobotSubsystem();
        SwerveDriveSubsystem swerve = (SwerveDriveSubsystem) robotsys.getDB();
        ParallelAction pact = new ParallelAction(ctrl.getRobot().getMessageLogger(), ParallelAction.DonePolicy.All);

        switch (getTestNumber()) {
            case 0:
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FL, getPower(), 0.0, getDuration()),
                        true);
                break;
            case 1:
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FL, 0.0, getPower(), getDuration()),
                        true);
                break;
            case 2:
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FR, getPower(), 0.0, getDuration()),
                        true);
                break;
            case 3:
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FR, 0.0, getPower(), getDuration()),
                        true);
                break;
            case 4:
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.BL, getPower(), 0.0, getDuration()),
                        true);
                break;
            case 5:
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.BL, 0.0, getPower(), getDuration()),
                        true);
                break;
            case 6:
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.BR, getPower(), 0.0, getDuration()),
                        true);
                break;
            case 7:
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.BR, 0.0, getPower(), getDuration()),
                        true);
                break;
            case 8:
                pact.addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FL, getPower(), getPower()), true);
                pact.addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FR, getPower(), getPower()), true);
                pact.addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.BL, getPower(), getPower()), true);
                pact.addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.BR, getPower(), getPower()), true);
                addAction(pact);
                break;
            case 9:
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FL, getPower(), 0, getDuration()),
                        true);
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FL, 0, getPower(), getDuration()),
                        true);
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FR, getPower(), 0, getDuration()),
                        true);
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FR, 0, getPower(), getDuration()),
                        true);
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.BL, getPower(), 0, getDuration()),
                        true);
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.BL, 0, getPower(), getDuration()),
                        true);
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.BR, getPower(), 0, getDuration()),
                        true);
                addSubActionPair(swerve,
                        new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.BR, 0, getPower(), getDuration()),
                        true);
                break;

            case 10:
                for (int i = 0; i < 4; i++) {
                    angles[i] = 0.0;
                    speeds[i] = getPower();
                }

                addSubActionPair(swerve, new SwerveAngleVelocityAction(swerve, angles, speeds, false), false);
                addAction(new DelayAction(ctrl.getRobot(), getDuration()));
                addSubActionPair(swerve, new SwerveStopAction(swerve), true);
                break;

            case 11:
                for (int i = 0; i < 4; i++) {
                    angles[i] = getPower();
                    speeds[i] = 0.0;
                }
                addSubActionPair(swerve, new SwerveAngleVelocityAction(swerve, angles, speeds, false), false);

                addAction(new DelayAction(ctrl.getRobot(), getDuration()));
                addSubActionPair(swerve, new SwerveStopAction(swerve), true) ;
                break;

            case 12:
                addSubActionPair(swerve, new SwerveAnglePowerAction(swerve, 0, getPower(), getDuration()), true);
                break;

            case 13:
                addSubActionPair(swerve, new SwerveDirectionRotateAction(swerve, getNamedDouble("x"), getNamedDouble("y"), getNamedDouble("rotate"), getDuration()), true);
                break ;

            case 14:
                addSubActionPair(swerve, new SwervePathFollowAction(swerve, getNameParam()), true);
                break ;

            case 15:
                addSubActionPair(swerve, new SwerveNewPathAction(swerve), true);
                break ;
        }
    }
}
