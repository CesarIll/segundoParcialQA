Feature: Ejercicio 2

  @Projectos
  Scenario: As admin user
  I want to create, update and delete an item
  So that i am able to use the API of item

    Given I have access to Todo.ly
    When I send a request POST to url http://todo.ly/api/items.json with json
    """
    {
      "Content": "Prueba1",
      "ProjectId": 3897896
    }
    """
    Then I expected response code 200
    And I expected the response body
    """
    {
      "Id": "IGNORE",
      "Content": "Item Cesar RestAPI",
      "ItemType": 1,
      "Checked": false,
      "ProjectId": 3897896,
      "ParentId": null,
      "Path": "",
      "Collapsed": false,
      "DateString": null,
      "DateStringPriority": 0,
      "DueDate": "",
      "Recurrence": null,
      "ItemOrder": null,
      "Priority": 4,
      "LastSyncedDateTime": "IGNORE",
      "Children": [

      ],
      "DueDateTime": null,
      "CreatedDate": "IGNORE",
      "LastCheckedDate": null,
      "LastUpdatedDate": "IGNORE",
      "Deleted": false,
      "Notes": "",
      "InHistory": false,
      "SyncClientCreationId": null,
      "DueTimeSpecified": true,
      "OwnerId": "IGNORE"
  }
    """
    And I get the property Id save on ID_ITEM
    When I send a request PUT to url http://todo.ly/api/items/ID_ITEM.json with json
    """
    {
      "Content": "Item Cesar RestAPI Update",
      "Checked": true
    }
    """
    Then I expected response code 200
    And I expected the response body
    """
    {
      "Id": ID_ITEM,
      "Content": "Item Cesar RestAPI Update",
      "ItemType": 1,
      "Checked": true,
      "ProjectId": 3897896,
      "ParentId": null,
      "Path": "",
      "Collapsed": false,
      "DateString": null,
      "DateStringPriority": 0,
      "DueDate": "",
      "Recurrence": null,
      "ItemOrder": null,
      "Priority": 4,
      "LastSyncedDateTime": "IGNORE",
      "Children": [

      ],
      "DueDateTime": null,
      "CreatedDate": "IGNORE",
      "LastCheckedDate": "IGNORE",
      "LastUpdatedDate": "IGNORE",
      "Deleted": false,
      "Notes": "",
      "InHistory": "IGNORE",
      "SyncClientCreationId": null,
      "DueTimeSpecified": true,
      "OwnerId": "IGNORE"
  }
    """
    When I send a request DELETE to url http://todo.ly/api/items/ID_ITEM.json with json
    """

    """
    Then I expected response code 200
    And I expected the response body
    """
    {
      "Id": ID_ITEM,
      "Content": "Item Cesar RestAPI Update",
      "ItemType": 1,
      "Checked": true,
      "ProjectId": 3897896,
      "ParentId": null,
      "Path": "",
      "Collapsed": false,
      "DateString": null,
      "DateStringPriority": 0,
      "DueDate": "",
      "Recurrence": null,
      "ItemOrder": null,
      "Priority": 4,
      "LastSyncedDateTime": "IGNORE",
      "Children": [

      ],
      "DueDateTime": null,
      "CreatedDate": "IGNORE",
      "LastCheckedDate": "IGNORE",
      "LastUpdatedDate": "IGNORE",
      "Deleted": true,
      "Notes": "",
      "InHistory": "IGNORE",
      "SyncClientCreationId": null,
      "DueTimeSpecified": true,
      "OwnerId": "IGNORE"
  }
    """