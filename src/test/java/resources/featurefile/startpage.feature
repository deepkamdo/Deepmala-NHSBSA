Feature:NHS costs start page test

  As a user, need to browse all the categories displayed on the start page.

  Background:
    Given I am on help check page
    And I accepted the cookies


  Scenario: verify when User select country wales should get help with NHS costs
    When I click on start now button
    And I select Wales for live in country
    And I click on next button
    And I select yes button for registered with a GP who isn't in England
    And I click on next button
    And I select Wales button for dental practice
    And I click on next button
    And I input date of birth
    And I click on next button
    And I select yes button for live with partner
    And I click on next button
    And I select no button for partner claim benefits or tax credits
    And I click on next button
    And I select no button for pregnant
    And I click on next button
#
    And I select no button for injury serving in the armed forces
    And I click on next button
    And I select no button for diabetes
    And I click on next button
    And I select no button for glaucoma
    And I click on next button
    And I select no for live in care home
    And I click on next button
    And I select no for savings,investments or property
    And I click on next button
  Then I confirm that I get help with NHS costs




