# Chapter 4 - Writing Classes

[Chapter 4 from the textbook](./JSS_ch4.pdf)

[Chapter 4 Powerpoint](./JSS_ch4_ppt.pdf)

[A trip to Objectville](./A_Trip_to_Objectville.pdf)

### Topics
- Methods
    - Static Methods
    - Public vs Private methods
    - Return types
        - void (no return)
        - data type (int, double, etc)
        - abstract object type
    - Overloaded Methods
- Classes
    - Abstraction
    - Constructors
    - Overloaded constructors
    - Public vs Private data
    - Getter / Setter methods
    - toString() method
    - Creation of instances (objects)
    - Parent/child heirarchy


<br>

### Assignments & Practice

1. Methods Worksheet
    - [Answer](./Ch4_Answers/APCSA_WritingMethods_2021.pdf)
2. Codingbat Logic 2
    - Visit [codingbat](https://codingbat.com)
    - [Assignment](./Ch4_Assignments/Codingbat_logic2.png)
    - [Flow Charts](./Ch4_Answers/APCSA_CodingBat2Flow_2021.pdf)
3. Palindrome Tester (using methods)
    - [Assignment](./Ch4_Assignments/PalindromeTester_Complete_Description.pdf)
    - [My Answer](./Ch4_Answers/src/ch4/PalindromeTester.java)
4. GCF (Greatest Common Factor) Method
    - [Assignment](./Ch4_Assignments/GCF.jpg)
    - [My Answer](./Ch4_Answers/src/ch4/GCF.java)
5. Rational Methods
    - [Assignment](./Ch4_Assignments/RationalOperations_Complete_Description.pdf)
    - [My Answer](./Ch4_Answers/src/ch4/RationalOperations.java)
6. Quadratic Roots
    - [Assignment](./Ch4_Assignments/QuadraticRoots.pdf)
    - [My Answer](./Ch4_Answers/src/ch4/Quadratic.java)
7. Pig Game
    - [Assignment](./Ch4_Assignments/Pig_Game_Complete_Descripton.pdf)
    - [My Answer](./Ch4_Answers/src/ch4/PigGame.java)
8. Design and use a class
    - [Assignment](./Ch4_Assignments/Design_your_own_class.pdf)
    - Answer
        - My class was the ```teenager``` class. It has some common activities and attributes of a teenager.
        - [Teenager class](./Ch4_Answers/src/ch4/Teenager.java)
9. Box class
    - [Assignment](./Ch4_Assignments/BoxClass.jpg)
    - [My Answer](./Ch4_Answers/src/ch4/Box.java)
10. Dice Project - to do over winter break
    - [Assignment](./Ch4_Assignments/Programs_using_Dice.pdf)
    - Answers
        1. [Boxcars](./Ch4_Answers/src/ch4/diceProjects/BoxCars.java)
        2. [Dice Probability](./Ch4_Answers/src/ch4/diceProjects/ProbabilityTable.java)
        3. [Pig Game - Using Die and PairOfDice classes](./Ch4_Answers/src/ch4/diceProjects/PigGame.java)
        4. Dice Graph
            - [Solution](./Ch4_Answers/src/ch4/diceProjects/DiceGraph.java) - Uses variables for the count of each roll. Not memory or process efficient.
            - [Alternate Solution](./Ch4_Answers/src/ch4/diceProjects/DiceGraph_2.java) - Uses an integer array rather than variables, to save memory. However, integer arrays are not covered in Chapter 4, so feel free to return to this solution at a later time.
        5. Craps (Extra Credit)
        6. [Modified Pig Game](./Ch4_Answers/src/ch4/diceProjects/PigGame_Mod.java)
            - Just like normal pig game, except there are no snake eyes or half snake eyes.
            - 2 10-sided dice, a sum of 13 is a full reset, and a doubles is a round reset.
            - [Video Explanation](https://drive.google.com/file/d/1dTyNWssFrJ297Z4CfpNBLs33biTcHRc2/view?usp=sharing)
            - [Document Explanation](./Ch4_Answers/G12_APCSA_Ch4Proj_6PigGameModified_2021.pdf)
    - Dependency Classes
        - [Die](./Ch4_Answers/src/ch4/diceProjects/Die.java)
        - [PairOfDice](./Ch4_Answers/src/ch4/diceProjects/PairOfDice.java)
11. Account / Banking class
    - [Assignment](Ch4_Assignments/AccountBanking.jpg)
    - Answers
      - [Account class](Ch4_Answers/src/ch4/Account.java)
      - [Banking class](Ch4_Answers/src/ch4/Banking.java)
12. Circle class
    - [Assignment](Ch4_Assignments/Circle_UsingCircle.jpg)
    - [Circle UML](Ch4_Assignments/Circle_UML.png)
    - Answers
      - [Circle class](Ch4_Answers/src/ch4/Circle.java)
      - [UsingCircle class](Ch4_Answers/src/ch4/UsingCircle.java)
13. Rational class
    - [Assignment](Ch4_Assignments/Rational_Class.pdf)
    - Answers
      - [Rational class](Ch4_Answers/src/ch4/Rational.java)
      - [Rational class runner](Ch4_Answers/src/ch4/RationalRunner.java)
14. Point class
    - [Assignment](Ch4_Assignments/Point_class.pdf)
    - Answers
      - [Point class](Ch4_Answers/src/ch4/Point.java)
      - [UsingPoint class](Ch4_Answers/src/ch4/UsingPoint.java)
15. Line Class
    - Assignment files:
      - [Line.java](Ch4_Assignments/Line.java)
      - [UsingLine.java](Ch4_Assignments/UsingLine.java)
    - Answers:
      - [Line](Ch4_Answers/src/ch4/Line.java)
      - [UsingLine](Ch4_Answers/src/ch4/UsingLine.java)
16. Intersection Method - Line Class
    - [Assignment](Ch4_Assignments/Intersection_Method.pdf)
    - Answers
      - [Line Class](Ch4_Answers/src/ch4/Line.java)
      - [Testing](Ch4_Answers/src/ch4/UsingLine1.java)
      - [Testing Image](Ch4_Answers/IntersectionDemo.jpg) (courtesy Desmos)
17. Line Class constructors - logical accuracy
    - This is to check if your ```Line``` class works as expected.
    - [Assignment](Ch4_Assignments/Line_Class_Constructors_Logic_Test.pdf)
    - [Code](Ch4_Answers/src/ch4/LineRunner.java)
18. System of Linear Equations
    - [Assignment](Ch4_Assignments/System_Of_Linear_Equations.pdf)
    - [Answer](Ch4_Answers/src/ch4/SysOfEq.java)
19. System of Linear Equations using Rational class
    - This assignment asks for the ```Line``` class to be modified such that:
      - The slope and intercepts are ```Rational``` instances
      - The ```Point``` class will also need to be modified
    - I was unable to complete this assignment; anyone who has a solution, feel free to fork and PR.
20. Rectangle class
    - In this assignment, you must design and implement a ```RectangleStudent``` class.
    - [Starter file](Ch4_Assignments/RectangleStudent.java)
    - [Assignment Details](Ch4_Assignments/Rectangle_Class_HW_2018.pdf)