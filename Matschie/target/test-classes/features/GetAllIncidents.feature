Feature: Get All Incident Managemant

  Scenario: Get All Incidents from Servicenow
	Given enable request logs
	When query parameters with number and INC0010506
	When query parameters with sysparm_fields and 'number,sys_id'
	When get all incidents
	Then the status code is 200
	And enable response logs
	And response includes the following
	|result.number|INC0010506|