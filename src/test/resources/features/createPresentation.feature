Feature: I create, save and download a new presentation slide

  Scenario: Create, save and download a presentation slide

    Given I go to "http://docs.google.com"
    And I login to existing account
    And I create new presentation slide
    And I add text into first slide

  //And I add a new slide for importing photos
  //And I create a new slide for creating shapes

    Then I download the created slide

