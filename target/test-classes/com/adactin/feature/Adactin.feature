Feature: Login functionality for Adactin Application 

Scenario: user enter valid username and valid password 
	Given user launch application 
	When user enter "Sowmiyasri" as username 
	And user enter "Sowmiya05" as password 
	Then user verify valid username and valid password 
	
Scenario: 
	user selected valid location, valid hotels, valid room type, valid number of rooms, valid check in date, valid check out date, 
	valid adults per room, valid children per room

	Given user selecting location 
	When user selecting hotel 
	And user selecting room type 
	And user selecting number of rooms 
	And user selecting check in date 
	And user selecting check out date 
	And user selecting adults per room 
	And user selecting children per room 
	Then user verify all credentials 
	
Scenario: user viewing and selecting the hotel 
	Given user checks the options 
	When user clicks the radiobutton 
	Then user verify the hotel selected 
	
Scenario: 
	user enters valid first name, valid last name, valid billing address, valid credit card no, valid credit card type, valid expiry date, valid cvv number 
	Given user enters valid first name 
	When user enters valid last name 
	And user enters valid billing address 
	And user enters valid credit card no 
	And user enters valid credit card type 
	And user enters valid expiry month 
	And user enters valid expiry year 
	And user enters valid cvv number 
	Then user verify the datas 
	
Scenario: user logout from the application 
	Given user logout from the application 
	When an action is performed 
	Then something should be asserted