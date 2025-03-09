# SDA-LAB
Grasp principle Applying "Creator" Principle 

EXAMPLE:
We have a Restaurant where customers can place Food Orders.
1-Every Order must have Food.
2-The Order class should be responsible for creating a Food object.

WITH CREATOR PRINCIPLE (GOOD):
-> Order creates a Food object
-> Properly encapsulated inside the Food class
-> Ensures every order has a valid Food object which shows data consistency
-> Easy to extend (e.g., adding price, category)

WITHOUT CREATOR PRINCIPLE (BAD):
-> Order class only stores food as a String
-> No clear separation of food details
-> Risk of inconsistent data
-> Hard to maintain in the future
This approach leads to data duplication, lack of structure, and difficulty in extending the system.

CONCLUSION:
Using the Creator Principle improves code structure, readability, and maintainability.Ensures that every order is properly linked to a valid food item.Follows object-oriented design principles by creating objects where they belong.By applying the Creator Principle, the system becomes more flexible, scalable, and easier to manage