Feature: Demo Guru 99

  Scenario Outline: Login Demo Guru 99, expected login successfully
	Given User is at login page
	When User enters <username> and <password>
	And User clicks login button
	Then User is navigated to home page, expected Hello <username>
	Examples:
	  | username   | password |
	  | mngr510570 | pedetEj  |
	  | mngr510574 | utuzuzU  |