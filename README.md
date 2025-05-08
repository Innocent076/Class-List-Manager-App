Create a database driven web application that will manage a classlist.A class list has No,Name, Birth date, Age, Gender, mark 
The application must have two roles (don’t think security, think different menus for 
different roles), namely: 
• Tutor and Lecturer. 
Tutor 
A tutor must be able to create records as shown in the table and view them. 
Lecturer 
A lecturer must be able to do the following: 
• Display the following test statistics: 
o Total number of students. 
o Total that passed. 
o Total that failed. 
o Average mark. 
o Minimum mark. 
o Maximum mark. 
• Display all the records according to gender. 
• Display the details of the students who passed the test. 
• Display the details of the students who failed the test. 
• Display the students with marks over a specified range (minValue, maxValue). 
Approach 
1. Create a database and manually populate. 
2. Create the connection pools and data source. 
3. Create an EJB module (incorporate JPQL) 
4. Web module 
5. Test 
