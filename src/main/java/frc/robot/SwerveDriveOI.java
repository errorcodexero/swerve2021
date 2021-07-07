package frc.robot;

import org.xero1425.base.DriveBaseSubsystem;
import org.xero1425.base.Subsystem;
import org.xero1425.base.oi.OISubsystem;
import org.xero1425.base.swervedrive.SwerveDriveSubsystem;

public class SwerveDriveOI extends OISubsystem {
    public final static String SubsystemName = "swerveoi";

    public SwerveDriveOI(Subsystem parent, SwerveDriveSubsystem db) {
        super(parent, SubsystemName, db) ;
    }    
}
