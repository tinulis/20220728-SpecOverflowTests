Feature: Registration

  Background:
    Given user starts the registration

  Rule: Registration data should be valid.
    Scenario: user can register with valid data.
      When user enters username as "Jeremy"
      And user enters password and re-enter password as "1234"
      When user finishes the registration
      Then user is successfully registered


  Rule: Password must be at least 4 characters long.
    Scenario: user creates 5-character password.
      When user enters username as "Samantha"
      And user enters password re-enter password as "12345"
      When user finishes the registration
      Then successful registration


  Rule: Password must be at least 4 characters long.
    Scenario: user creates 3-character password.
      When user enters username
      And user enters password re-enter password as "123"
      When user finishes the registration
      Then Failed registration
















