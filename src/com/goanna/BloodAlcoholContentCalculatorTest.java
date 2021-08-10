package com.goanna;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BloodAlcoholContentCalculatorTest {

  @Test
    public void getBloodAlcoholContentForFemale() {
    String gender = "Female";
    double weight = 60;
    double standardDrinks = 2.0;
    double hoursDrinking = 1.0;

    double bloodAlcoholContent = BloodAlcoholContentCalculator.getBloodAlcoholContent(gender, weight, standardDrinks, hoursDrinking);

    assertEquals(0.03787878787878788, bloodAlcoholContent);
  }

  @Test
  public void getBloodAlcoholContentForMale() {
    String gender = "Male";
    double weight = 60;
    double standardDrinks = 2.0;
    double hoursDrinking = 1.0;

    double bloodAlcoholContent = BloodAlcoholContentCalculator.getBloodAlcoholContent(gender, weight, standardDrinks, hoursDrinking);

    assertEquals(0.030637254901960783, bloodAlcoholContent);
  }

  @Test
  public void getBloodAlcoholContentWithZeroWeight(){
    String gender = "Female";
    double weight = 0;
    double standardDrinks = 2.0;
    double hoursDrinking = 1.0;

    double bloodAlcoholContent = BloodAlcoholContentCalculator.getBloodAlcoholContent(gender, weight, standardDrinks, hoursDrinking);

    assertEquals(Double.POSITIVE_INFINITY,bloodAlcoholContent);
  }

}