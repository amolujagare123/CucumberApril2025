Feature: all login scenario


  Background: open browser
    Given i open browser
    And i maximize it

  @valid @login
  Scenario: to test the functionality of login button for valid inpuy
    Given I am on login page
 #   When i enter correct username & password
    When i enter "admin" & "admin"
    And I click on login button
    Then i should go to the home page


    @invalid @login
  Scenario: to test the functionality of login button for invalid inpuy
    Given I am on login page
  #  When i enter incorrect username & password
    When i enter "dsdsds" & "dsdsds"
    And I click on login button
    Then i should go to error page

  @blank @login
  Scenario: to test the functionality of login button for blank inpuy
    Given I am on login page
   # When i enter blank username & password
    When i enter "" & ""
    And I click on login button
    Then i should go to error page


    @userReg
  Scenario: to test the functionality of submit button
    Given I am on user registration page
    When i enter below data
      | amol ujagare | amol@gmail.com | 9988998899 | pune |
    And I click on submit button
    Then user should be added



      @addMembers
  Scenario Outline: to test the functionality of submit button
    Given I am on add member page
    When i enter <name> , <email> ,<contact>, <city> , <address>
    And I click on add button
    Then member should be added
        Examples:
          | name         | email                | contact     | city       | address                        |
          | Rahul Sharma | rahul@gmail.com      | 9876543210  | Pune       | 101, MG Road, Camp             |
          | Priya Verma  | priya.verma@yahoo.in | 9123456789  | Mumbai     | B-502, Sea Breeze Apt, Bandra  |
          | Amit Joshi   | amitj@hotmail.com    | 9988776655  | Delhi      | 12, Connaught Place            |
          | Sneha Patel  | sneha.p@gmail.com    | 9765432101  | Ahmedabad  | 3rd Floor, Shakti Complex      |
