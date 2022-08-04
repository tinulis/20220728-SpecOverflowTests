Feature: Asking Question

  Rule: Only authenticated users can ask questions

    Scenario: valid user can post question

      Given the user logged as an authorised user
      When the user selects ask question
      And the user enters Title, Body, and Tags
      And the user submits the question
      Then the question is posted successfully
