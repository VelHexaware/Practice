Feature: Adactin hotel validation 
Scenario Outline: Login Validation 
	Given User is on adactin page 
	When User "<userName>" and "<password>" details 
	Then Click the button 
	
	Examples: 
		|userName|password|
		|Hello|Java|
		|Bye|Java|
