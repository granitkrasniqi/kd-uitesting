Feature: Service Management

  Scenario: Add a new Service
    Given the user is on the add service page
    When the user creates a new service with name "Vizite kontrolluese" and price "10.0" and description about service "Pershkrim test"
    Then They should see the list of services page

  Scenario: Delete a service
    Given the user is on the services list page
    When the user deletes service with name "Vizite kontrolluese" in the table
    Then They should see the list without service with name "Vizite kontrolluese"

    Scenario: View service's details
      Given the user is on the services list page
      When the user wants to see details of service with name "Vizite kontrolluese"
      Then They should see the details of service

      Scenario: Update service
        Given the user is on the service list page
        When the user updates service with name "Vizite kontrolluese" in the table And modifies name to "Kontrolli dhembit"
        Then They should see that the service name is modified

