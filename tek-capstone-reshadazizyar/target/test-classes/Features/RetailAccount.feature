Feature: Reatail Accont Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'iman.aj885@gmail.com' and password 'Iman1234?'
    And User click on login button
    And User Should be logged in into Account

  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'BOOK' and Phone '9318686565'
    And User click on Update button
    Then User profile information should be updated
      | Iman1234? | ?9876Iman | ?9876Iman |
    And User click on Change Password button
    Then a message should be displayed 'Password Update Successfully'

  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2037183291639234 | Omar       |              12 |           2024 |          100 |
    And User click Add your card button
    Then a message should be displayed Payment Method added successfully

  @SmokeTest
  Scenario: Verify User can edit Debit or credit card
    When User click on Account option
    When User click on added card
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber       | nameOncard | expiration Month | expirationYear | security code |
      | 3490867431084356 | Matt       |               10 |           2023 |           109 |
    And User click on Update Your card button
    Then a message should be displayed Payment Method Updated Successfully
