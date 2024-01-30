Feature: Add Remove Web Element

  Scenario: Add and then remove web element
    Given user is on add remove link
    When user add web element
    And user delete the web element
    Then web element should be deleted