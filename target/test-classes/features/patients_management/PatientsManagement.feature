Feature: Patients Management

  Scenario: Add a new Patient
      Given the user is on the add patient page
      When the user creates a new patient with Personal Number 102258796 and name Granit and surname Krasniqi and gjinia Mashkull and date of birth 10/10/1998 and telephone number 04900000 and email gk@gmail.com and address Prishtine and description This is a test
      Then They should see the list of patients page

    Scenario: View patient's details
      Given the user in on the patients list pages
      When the user wants to see details of patient with personal number 102258796
      Then They should see the patient's with personal number 102258796 details page

    Scenario: Delete a patient
      Given the user is on the patients list page
      When the user deletes patient with personal number 102258796 in the table
      Then They should see the list without patient with personal number 102258796


      Scenario: Update patient's name and username
        Given the user is on the patients list page
        When the user updates patient's with id 102258796 name to "Filan" and surname to "Fisteku"
        Then They should see that the patient's name and surname is modified