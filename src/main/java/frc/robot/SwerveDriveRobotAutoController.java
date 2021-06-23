package frc.robot;

import org.xero1425.base.XeroRobot;
import org.xero1425.base.actions.InvalidActionRequest;
import org.xero1425.base.controllers.AutoController;
import org.xero1425.misc.BadParameterTypeException;
import org.xero1425.misc.MissingParameterException;

public class SwerveDriveRobotAutoController extends AutoController {

    private SwerveDriveAutoMode mode_;

    public SwerveDriveRobotAutoController(XeroRobot robot) throws MissingParameterException, BadParameterTypeException, InvalidActionRequest {
        super(robot, "SwerveDriveAutoController");

        mode_ = new SwerveMotorTestAutoMode(this) ;
        setAutoMode(mode_) ;
    }  

    public void updateAutoMode(int node, String gamedata) {
        setAutoMode(mode_) ;
    }    
}
