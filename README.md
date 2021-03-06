**_STATEMENT OF PURPOSE_**

**What the application will do:**

- This application will work as a BAC (Blood Alcohol Content) calculator
  in which it will take input from the user - including their gender, weight in kilograms, how many standard drinks they have consumed and the amount of hours it has been since commencement of drinking. The application will then calculate the person's current Blood Alcohol Content based on the information the user has provided. It will also calculate the amount of hours until their Blood Alcohol Content will reach back to zero.

**What business problem it
addresses:**

- After consuming alcohol, it is important to know if enough time has passed for one's BAC to be within the legal limit to drive. This application assists in the prevention of drink-driving as it notifies the user if their Blood Alcohol Content is still too high to legally drive, in which the user will know they need to find another way home. It will also tell the user the amount of hours until their BAC will reach 0, allowing them to recognise the amount of time until they can drive legally.


**The target audience:**

- The target audience for this application includes those who have consumed alcohol recently and drive, and must know if their BAC is within legal limit to use their vehicle.


**APPLICATION FEATURES:**

- Intake information from the user such as gender, weight, number of standard drinks consumed and the number of hours since they first started drinking.
- Perform formula-based calculations based on input by the user, in order to calculate their BAC.
- Output the user's current Blood Alcohol Content.
- Output the number of hours remaining until the user's Blood Alcohol Content will return to zero.


**IMPLEMENTATION PLAN:**

**Thursday:** 
1. Create a GitHub Repository
2. Set up project with Gradle and class in IntelliJ and commit it into created GitHub repository.
3. Set up scanner to allow input from user.

**Friday:**
4. Create variables such as male, female, weight, hoursDrinking and standardDrinks.
5. Insert variables into the scanner to allow users to input their own statistics such as their gender, their weight in kilograms, how many standard drinks they have consumed and how many hours has passed since they started drinking.
6. Implement Widmark's BAC formula in order to calculate the user's Blood Alcohol Content based on the statistics they have provided.
7. Print out the user's Blood Alcohol Content.
8. Create a new variable called 'hoursUntilZero' in order to use another formula to calculate how many hours until the user's BAC will reach zero.
9. Print out the number of hours until the user's Blood Alcohol Content will return to zero.

**Monday:**
10. Fix error where if-and-else statement was not working and the Male formula was always being applied despite if the user inputs "Female" or an invalid input-type.
11. Edit code to make it efficient by reducing code lines and troubleshooting possible bugs.
12. Allow the scanner to ignore the casing of letters so that it will accept input in both lower and upper case to make it easier for user input.

**Tuesday**
11. Create and extract methods from if-and-else statements in order to make code easier to test.
12. Create first test that checks that the female BAC formula works correctly and outputs the correct BAC for a female.
13. Create second test that checks that the male BAC formula works correctly and outputs the correct BAC for a male.
14. Create third test that tests the BAC output for a user that inputs zero for their weight. 

**Wednesday** 
15. Scan over all code and tests to make sure the app is running correctly without bugs and errors, and that all tests pass. 
16. Extract project into a zip file and submit app. 
