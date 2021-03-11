Feature: Ejercicio 1

  @User
  Scenario: As admin
            I want to create and update an user
            So that I use the API

    Given I have access to Todo.ly
    When I send a request POST to url http://todo.ly/api/user.json with json
    """
    {
      "Email": "cesar@illanes.com",
      "FullName": "Cesar Ernesto Illanes Argote",
      "Password": "password12345678"
    }
    """
    Then I expected response code 200
    And I expected the response body
    """
    {
    "Id": "IGNORE",
    "Email": "cesar@illanes.com",
    "Password": null,
    "FullName": "Cesar Ernesto Illanes Argote",
    "TimeZone": 0,
    "IsProUser": false,
    "DefaultProjectId": "IGNORE",
    "AddItemMoreExpanded": false,
    "EditDueDateMoreExpanded": false,
    "ListSortType": 0,
    "FirstDayOfWeek": 0,
    "NewTaskDueDate": "IGNORE",
    "TimeZoneId": "IGNORE"
    }
    """
    And I get the property Id save on ID_USER

    When I send a request PUT to url http://todo.ly/api/user/0.json with json
    """
    {
      "FullName": "Cesar Ernesto Illanes Argote Update"
    }
    """
    Then I expected response code 200
    And I expected the response body
    """
    {
    "Id": ID_USER,
    "Email": "cesar@illanes.com",
    "Password": null,
    "FullName": "Cesar Ernesto Illanes Argote Update",
    "TimeZone": 0,
    "IsProUser": false,
    "DefaultProjectId": "IGNORE",
    "AddItemMoreExpanded": false,
    "EditDueDateMoreExpanded": false,
    "ListSortType": 0,
    "FirstDayOfWeek": 0,
    "NewTaskDueDate": "IGNORE",
    "TimeZoneId": "IGNORE"
    }
    """