# Втора лабораториска вежба по Софтверско инженерство
## Христијан Попов 193255
### 1.Control Flow Graph
![285493899_1037206777212657_675121291828908055_n](https://user-images.githubusercontent.com/82377408/171907196-5f373df2-b154-4dae-aafe-90d255233cf2.png)

### 2.Цикломатска Комплексност
Цикломатската комплексност на мојот граф е E(ребра) - V(јазли) + 2 = 31 - 25 + 2 = 8

### 3.Every statement
Имам 25 statements
Користам три тестови
Test case #1: Input empty list, Output "List length should be greather than 0".
Со овој тест ги минам следниве statements:1,2,3,23.
Test case #2: Input 0,0,0,0,0,0,0,0 , Output "List length should be a perfect square".
Со овој тест ги минам следниве statements:1,2,4,5,6,7,23.
Test case #3: Input 0,#,0,#,0,#,#,#,0, овде нема никакви exceptions, Output е 2,#,2,#,4,#,#,#,2.
Со овој тест ги минам следниве statements:1,2,4,5,6,8,9.1,9.2,9.3,10,11,12,13,14,15,16,17,18,19,20,21,22,23.

### 4.Every branch
Имам 31 branches
Користам три тестови
Test case #1: Input empty list, Output "List length should be greather than 0".
Со овој тест ги минам следниве branches:1-2,2-3,3-23.
Test case #2: Input 0,0,0,0,0,0,0,0 , Output "List length should be a perfect square".
Со овој тест ги минам следниве branches:1-2,2-4,4-5,5-6,6-7,7-23.
Test case #3: Input 0,#,0,#,0,#,#,0,#, овде нема никакви exceptions, Output е 2,#,2,#,3,#,#,2,#.
Со овој тест ги минам следниве branches:1-2,2-4,4-5,5-6,6-8,8-9.1,9.1-9.2,9.2-10,9.2-21,10-11,10-20,11-12,12-13,12-14,13-15,14-15,15-16,15-17,16-17,17-18,17-19,18-19,19-21,20-21,21-9.3,9.3-9.2,21-22,22-23.
