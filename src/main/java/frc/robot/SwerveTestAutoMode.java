package frc.robot;

import org.xero1425.base.actions.InvalidActionRequest;
import org.xero1425.base.controllers.TestAutoMode;
import org.xero1425.base.swervedrive.SwerveDriveSubsystem;
import org.xero1425.base.swervedrive.SwerveSetMotorPowerAction;
import org.xero1425.misc.BadParameterTypeException;
import org.xero1425.misc.MissingParameterException;

public class SwerveTestAutoMode extends TestAutoMode {
    public SwerveTestAutoMode(SwerveDriveRobotAutoController ctrl) throws BadParameterTypeException, MissingParameterException, InvalidActionRequest {
        super(ctrl, "Swerver-Test-Mode") ;

        SwerveDriveRobotSubsystem robotsys = (SwerveDriveRobotSubsystem)ctrl.getRobot().getRobotSubsystem();
        SwerveDriveSubsystem swerve = (SwerveDriveSubsystem)robotsys.getDB() ;

        switch(getTestNumber()) {
            case 0:
                addSubActionPair(swerve, new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FL, getPower(), 0.0, getDuration()), true) ;
                break ;
            case 1:
                addSubActionPair(swerve, new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FL, 0.0, getPower()), true) ;
                break ;
            case 2:
                addSubActionPair(swerve, new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FL, getPower(), 0.0), true) ;
                break ;
            case 3:
                addSubActionPair(swerve, new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FL, 0.0, getPower()), true) ;
                break ;
            case 4:
                addSubActionPair(swerve, new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FL, getPower(), 0.0), true) ;
                break ;
            case 5:
                addSubActionPair(swerve, new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FL, 0.0, getPower()), true) ;
                break ;
            case 6:
                addSubActionPair(swerve, new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FL, getPower(), 0.0), true) ;
                break ;
            case 7:
                addSubActionPair(swerve, new SwerveSetMotorPowerAction(swerve, SwerveDriveSubsystem.FL, 0.0, getPower()), true) ;
                break ;                                                                                                                
        }
    }
}
