Feature: Adding new pet in the store
  Scenario Outline:As a user, I want to add  a new  pet in the store
    Given :Add new pet "<name>" "<ID>" "<CategoryName>" "<Ps>"
    When : User call "AddPetAPI" API with a status using "POST" HttP request
    Then :Data is return successfully with all the available pets in the website with status code 200
    And "status" in response body is "<Ps>"
    #And "petId" in response body is "<ID>"
    Examples:
    |name     |ID               |CategoryName|Ps       |
    | doggy01 |588              |dog         |available|
    | fish02  |589              |fish        |sold     |
    | cat03   |599              |cat         |Pending  |

  Scenario :verify that all the available pets are returned successfully
    Given : Get all value for  pets where status equal to "available"
    When : User call "GetAllPetsAPI" API with a status using "GET" HttP request
    Then :Data is return successfully with all the available pets in the website with status code 200

  Scenario :verify that the data updated successfully
    Given : update by status "Sold" by using "ID"
    When : User call "UpdatePetAPI" API with a status using "PUT" HttP request
    Then :Data is Updated successfully with all the available pets in the website with status code 200



