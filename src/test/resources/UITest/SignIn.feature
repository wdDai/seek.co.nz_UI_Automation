Feature: Sign in
  As a Job Seeker, I want to login

  Scenario Outline: Sign in
    Given I'm on homepage
    * I've clicked sign in link
    * I've entered <username> and <password>
    When I click sign in button
    Then I should be logged in

    Examples:
      |username|password|
      |testeryouknowwho@gmail.com|testeryouknowwho|