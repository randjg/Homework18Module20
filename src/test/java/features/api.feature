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
  Scenario: Test get list data normal (negative)
    Given prepare url for "GET_LIST_USERS"
    And hit api get list users
    Then validation status code is equals to 200
    Then validation response body get list users
    Then validation response json with JSONSchema "get_list_users_normal_wrong.json"
