package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by Josh on 11/19/2016.
 */
@TeleOp(name="flicker", group="test")
public class Flicker_test extends OpMode {

    DcMotor flicker;

    @Override
    public void init(){

        flicker = hardwareMap.dcMotor.get("FM");
    }
     @Override
    public void loop () {

         if (gamepad1.right_trigger > 0.1){
             flicker.setPower(-1);
         } else if (gamepad1.right_trigger <0.1){
             flicker.setPower(0);
         }
         if (gamepad1.left_trigger > 0.1){
             flicker.setPower(1);
         } else if (gamepad1.left_trigger <0.1){
             flicker.setPower(0);
         }

         telemetry.addData("flickerPower", flicker.getPower());
         telemetry.update();
     }
}
