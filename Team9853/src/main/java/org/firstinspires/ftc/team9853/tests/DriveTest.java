package org.firstinspires.ftc.team9853.tests;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.chathamrobotics.ftcutils.TeleOpMode;

/**
 * Created by storm on 11/15/2016.
 */

@TeleOp(name = "Test: Driving", group = "Test")

@Disabled

public class DriveTest extends TeleOpMode {
    DriveTest() {
        super();
    }

    @Override
    public void loop() {
        driver.drive(1, 1, 0);

        debug();
    }
}