package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "TeleOp", group = "teleOp")
public class teleOp extends LinearOpMode {  
    Robot robot;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new Robot(this);

        waitForStart();

        while(opModeIsActive()){
            if(gamepad1.a) {
                robot.lF.setDirection(DcMotorSimple.Direction.FORWARD);
                robot.rB.setDirection(DcMotorSimple.Direction.REVERSE);
                robot.rF.setDirection(DcMotorSimple.Direction.REVERSE);
                robot.lB.setDirection(DcMotorSimple.Direction.FORWARD);
                robot.lF.setPower(1);
                robot.lB.setPower(1);
                robot.rF.setPower(1);
                robot.rB.setPower(1);
            }else{
                robot.lF.setPower(0);
                robot.lB.setPower(0);
                robot.rF.setPower(0);
                robot.rB.setPower(0);
            }

            if(gamepad1.b) {
                robot.lF.setDirection(DcMotorSimple.Direction.REVERSE);
                robot.rB.setDirection(DcMotorSimple.Direction.REVERSE);
                robot.rF.setDirection(DcMotorSimple.Direction.REVERSE);
                robot.lB.setDirection(DcMotorSimple.Direction.REVERSE);
                robot.lF.setPower(1);
                robot.lB.setPower(1);
                robot.rF.setPower(1);
                robot.rB.setPower(1);
            }else{
                robot.lF.setPower(0);
                robot.lB.setPower(0);
                robot.rF.setPower(0);
                robot.rB.setPower(0);
            }

            if(gamepad1.x) {
                robot.lF.setDirection(DcMotorSimple.Direction.FORWARD);
                robot.rB.setDirection(DcMotorSimple.Direction.FORWARD);
                robot.rF.setDirection(DcMotorSimple.Direction.FORWARD);
                robot.lB.setDirection(DcMotorSimple.Direction.FORWARD);
                robot.lF.setPower(1);
                robot.lB.setPower(1);
                robot.rF.setPower(1);
                robot.rB.setPower(1);
            }else{
                robot.lF.setPower(0);
                robot.lB.setPower(0);
                robot.rF.setPower(0);
                robot.rB.setPower(0);
            }

            if(gamepad1.y) {
                robot.lF.setDirection(DcMotorSimple.Direction.REVERSE);
                robot.rB.setDirection(DcMotorSimple.Direction.FORWARD);
                robot.rF.setDirection(DcMotorSimple.Direction.FORWARD);
                robot.lB.setDirection(DcMotorSimple.Direction.REVERSE);
                robot.lF.setPower(1);
                robot.lB.setPower(1);
                robot.rF.setPower(1);
                robot.rB.setPower(1);
            }else{
                robot.lF.setPower(0);
                robot.lB.setPower(0);
                robot.rF.setPower(0);
                robot.rB.setPower(0);
            }
        }
    }
}