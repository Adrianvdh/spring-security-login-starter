package com.fridaylunch;

import org.junit.Test;

import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;

public class SubmitOrderTest {

    @Test
    public void submitOrderOntoGroup() throws Exception {
        UserGroup userGroup = new UserGroup();
        userGroup.addUser("Adrian");

        FoodOrder foodOrder = new FoodOrder();
        foodOrder.addItem("Cheese hamburger", 26.50f);
        foodOrder.addItem("Skinny fries", 12.00f);
        foodOrder.addItem("Diet Coke 500ml", 11.50f);

        userGroup.submitOrder(foodOrder, "Adrian");

        assertThat(userGroup.orders, hasItem(foodOrder));
    }

}
