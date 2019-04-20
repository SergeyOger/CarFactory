package com;

import com.bodycreator.CoupeBody;
import com.bodycreator.SUVBody;
import com.enginecreator.HighPowerDieselEngine;
import com.enginecreator.MediumPowerEngine;
import com.interiorcreator.SportInterior;
import com.suspensioncreator.ComphortSuspension;
import com.transmissioncreator.HeavyDutyTransmission;
import com.transmissioncreator.StandartTransmission;

public class Test { public static void main(String[] args) {
//        DetailCarCreator detailCarCreator = new DetailCarCreator();
//        detailCarCreator.changeEngine("LPE");
//        detailCarCreator.changeTransmission("AT");
//        detailCarCreator.changeBody("C");
//        detailCarCreator.changeSuspension("STS");
//        detailCarCreator.changeInterior("STI");
//        System.out.println(detailCarCreator.toString());
//    MediumPowerEngine mediumPowerEngine = new MediumPowerEngine();
//    mediumPowerEngine.getEngineDescription();
//    CoupeBody coupeBody = new CoupeBody();
//    coupeBody.getBodyDescription();
//    coupeBody.getBodyDescription();
//   SportInterior sportInterior = new SportInterior();
//    sportInterior.getInteriorDescription();
//    ComphortSuspension comphortSuspension = new ComphortSuspension();
//    comphortSuspension.getSuspensionDescription();
    SUVBody suvBody = new SUVBody();
    suvBody.getDetailDescription();
    }


}
