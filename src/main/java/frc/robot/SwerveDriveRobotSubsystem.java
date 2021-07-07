package frc.robot;

import org.xero1425.base.RobotSubsystem;
import org.xero1425.base.XeroRobot;
import org.xero1425.base.swervedrive.SwerveDriveSubsystem;

public class SwerveDriveRobotSubsystem extends RobotSubsystem {
    public SwerveDriveRobotSubsystem(XeroRobot robot) throws Exception {
        super(robot, "SwerveRobotSubsystem") ;

        SwerveDriveSubsystem db = new SwerveDriveSubsystem(this, "swervedrive", "hw:swervedrive") ;
        addChild(db) ;

        SwerveDriveOI oi = new SwerveDriveOI(this, db) ;
        addChild(oi) ;
    }
}
