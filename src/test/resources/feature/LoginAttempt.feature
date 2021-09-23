Feature: Test Weborder Login Page

  @test
  Scenario Outline: Test login with valid credentials

    Given Open chrome and start application
    When I enter valid "<username>" and valid "password"
    Then user should be able to login successfully
    Then application should be closed

    Examples:
      | username          | password  |
      | Tester            | test      |
