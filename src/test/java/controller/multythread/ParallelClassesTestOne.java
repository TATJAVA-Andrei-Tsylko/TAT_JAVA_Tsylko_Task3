package controller.multythread;


import com.epam.tsylko.andrei.controller.Controller;
import com.epam.tsylko.andrei.server.Server;
import org.junit.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelClassesTestOne {
    @DataProvider(name = "setUpPositiveDataForReservation", parallel = true)
    public Object[][] setUpPositiveDataForReservation() {

        return new Object[][]{
                {"action=CURRENT_ADDRESS&addressId=4&id=2","Address{id=4, country='UK', city='Manchester', street='Green Street', house=20, room=201}"},
                {"action=CURRENT_ADDRESS&addressId=5&id=3","Address{id=5, country='German', city='Manchester', street='Green Street', house=20, room=201}"},
                {"action=CURRENT_ADDRESS&addressId=2&id=4","Address{id=2, country='German', city='Passau', street='Innstraße ', house=41, room=0}"},

        };
    }
//    @DataProvider
//    public Object[][] setUpNegativeDataForReservation() {
//        return new Object[][]{
//
//                {"action=BOOK_RESERVATION&userId=11&bookId=5","Access denied"},
//                {"action=BOOK_RESERVATION","Access denied"},
//                {"action=BOOK_RESERVATION&userId=11&bookId=-5&id=3","Error during book reservation procedure"},
//                {"action=BOOK_RESERVATION&userId=11&bookId=6&id=11","Access denied"},
//        };
//    }

    @Test(dataProvider = "setUpPositiveDataForReservation")
    public void testPositiveReservationCommand(String request, String response) {
        Server server = Server.getInstance();

        Assert.assertEquals(server.processRequest(request),response);

    }

//    @Test(dataProvider = "setUpNegativeDataForReservation")
//    public void testNegativeReservationCommand(String request, String response) {
//
//        Assert.assertEquals(controller.executeTask(request),response);
//
//    }
}
