@apis_all_examples
Feature: Test example API

  @apitest_01
  Scenario: Validar caso de prueba GET
    Given url "https://reqres.in/api/users/2"
    When method GET
    And response.data.first_name = "Janet"
    Then status 200

  @apitest_02
  Scenario: Validar caso de prueba POST
    Given url "https://reqres.in/api/users"
    When request {"name": "morpheus",  "job": "leader"}
    And method POST
    Then status 201

  @apitest_02_01
  Scenario: Validar caso de prueba POST
    Given url "https://reqres.in/api/users"
    When request
    """
    {
    "name": "morpheus",
    "job": "leader"
    }
    """
    And method POST
    Then status 201

  @apis_examples1
  Scenario: Validate the response of a GET request
    Given url 'https://jsonplaceholder.typicode.com/posts/1'
    When method GET
    Then status 200
    And match response.id == 1
    And match response.title == 'sunt aut facere repellat provident occaecati excepturi optio reprehenderit'

  @apis_examples2
  Scenario: Validate a POST request
    Given url 'https://jsonplaceholder.typicode.com/posts'
    And request { title: 'foo', body: 'bar', userId: 1 }
    When method POST
    Then status 201
    And match response.title == 'foo'
    And match response.body == 'bar'
    And match response.userId == 1