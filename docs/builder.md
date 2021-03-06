

Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create different representations.” It is used to construct a complex object step by step and the final step will return the object. The process of constructing an object should be generic so that it can be used to create different representations of the same object.

A Builder class builds the object step by step and finally return the object. This builder is independent of objects being built.

![UML diagram](./images/uml-of-builedr.jpg)

We have considered a business case of fast-food restaurant where a typical meal could be a burger and a cold drink. Burger could be either a Veg Burger or Chicken Burger and will be packed by a wrapper. Cold drink could be either a coke or pepsi and will be packed in a bottle.

We are going to create an `Item` interface representing food items such as burgers and cold drinks and concrete classes implementing the Item interface and a `Packing` interface representing packaging of food items and concrete classes implementing the Packing interface as burger would be packed in wrapper and cold drink would be packed as bottle.

We then create a Meal class having ArrayList of Item and a MealBuilder to build different types of Meal objects by combining Item. Our demo will use MealBuilder to build a Meal.

![pattern diagram](./images/builder_pattern_uml_diagram.jpg)

Demo class:

[../src/main/java/sample.designpattern/builder/MeanBuilder.java](../src/main/java/sample/designpattern/builder/MealBuilder.java)

Maven command to run the demo class:

```bash
./mvnw exec:java -Dexec.mainClass="sample.designpattern.builder.MealBuilder"
```
