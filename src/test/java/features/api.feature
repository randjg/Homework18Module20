Feature: Automation Test REST API

#  Scenario: Test get list data normal
#    Given prepare url valid for get list data
#
#  Scenario: Test get list data normal 2
#    Given prepare url valid for get list data
#
#  Scenario: Test get list data normal 3
#    Given prepare url valid for get list data

  @api
  Scenario: Test get list data normal (positive)
    Given prepare url for "GET_LIST_USERS"
    And hit api get list users
    Then validation status code is equals to 200
    Then validation response body get list users
    Then validation response json with JSONSchema "get_list_users_normal.json"

  @api
  Scenario: Test get list data with invalid endpoint (negative)
    Given prepare url for "INVALID_ENDPOINT"
    When hit api get list users with invalid endpoint
    Then validation status code is equals to 404
    And validation response body contains error message "Not Found"

  @api
  Scenario: Test get list data with invalid parameter (negative)
    Given prepare url for "INVALID_PARAMETER"
    And hit api get list users with invalid parameter "invalidParam" "invalidValue"
    Then validation status code is not equals to 200
    Then validation response body contains error message "not found"

