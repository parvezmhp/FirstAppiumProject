Feature: Login Features


  Scenario Outline: Login is unsuccessful with invalid credentials
    When user enters username "<username>" and "<password>"
    And click on the LogIn button
    Then user should get error message "<error>"

    Examples:
    |username         | password         | error                                                      |
    |invalidUserName  | secret_sauce     |Username and password do not match any user in this service.|
    |standard_user    | invalid_password |Username and password do not match any user in this service.|

  @test
  Scenario Outline: Login is successful with valid credentials
    When user enters username "<username>" and "<password>"
    And click on the LogIn button
    Then user should see product page with title "<title>"

    Examples:
      | username      | password     | title    |
      | validUserName | secret_sauce | PRODUCTS |
