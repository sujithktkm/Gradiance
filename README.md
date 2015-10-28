**Gradiance - A web-based tool for accelerated learning and evaluation**
------------------------------------------------------------------------

Gradiance tool in developed in this repository is a project to build a web-based tool for accelerated learning and evaluation similar to [Gradiance](http://www.gradiance.com/info.html) used in various courses. 

Gradiance is an assessment tool usually used in various courses to lighten the work load on Professor and Teaching Assistants in evaluating assignments and providing generic notifications to students. It also provides content services with the aim of making learning more effective and efficient in structured contexts. Using this tool, the Students will be able to register for courses, attempt home works, view past submissions and evaluate their performance. This tool provides the flexibility on number of attempts for home works. The professor and Teaching Assistants will be able to view reports on the performance of the students. 

**Entities and Relationships in this project:**

There are a lot of entities and relationships that are involved in developing this tool. They are 

- **Users:** It has data related to Students, Professors and Teaching Assistants. Students have two levels namely Graduate and Under Graduate. Each user has Login ID, Password and generic user details like First Name, Last Name and Email Address and to uniquely identify users a column named user ID is present. Each tuple also has a column named Role ID which helps to identify if a user is student or Professor or Teaching Assistant. 


- **Chapter:** Each Chapter has an ID, title and must be associated with a Textbook and thus has a column indicating the TextBookISBN. 


- **Course:** Each course has an ID to uniquely indicate the course. Each course has a name and a level associated with it, as the same course may be present for both Graduates and Under Graduates. 


- **CourseOfferings:** CourseOfferings has all the generic details related to a given course namely StartDate, EndDate to indicate the duration of the course and MaximumEnrollmentNumber to indicate the maximum capacity of the class. To identify the tuples uniquely there are two columns namely CourseTokenID and CourseID. 


- **CourseTeaching:** CourseTeaching is a mapping between Users and CourseOfferings. It has UserID, CourseTokeniD, CourseID and RoleID. RoleID is used to indicate whether the user is Professor or Teaching assistant associated with the course. 


- **CourseTextBookMapping:** This is a mapping between a given course and textbook associated with the course. This has the following columns, TextBookISBN and CourseTokenISBN. 


- **CourseTopics:** Each Course has a set of topics associated with it. This table gives an overview of all the topics present in a given course. It has CourseID, CourseTopicID and CourseName as columns. 


- **ExerciseList:** This table gives a detailed list of all the exercises/homeworks that are associated with a given Course and it also stores the list of topics on which the given Exercise is based on. It has ExerciseID, CourseTopicID and CourseTokenID.


- **ExerciseQuestion:** This table is a mapping between Exercise and QuestionBank. It has both ExerciseID and QuestionID to indicate the list of questions that are related to a given Exercise. 


- **Exercises:** This table stores the generic information related to a given exercise namely, NumberofRetries, Markspercorrectanswer, Marksperincorrectanswer, Startdatetime, enddatetime, sscoringtype and numberofquestions, difficultylevel and an ID field to uniquely identify exercise. 


- **Notifications:** Notifications table has notificationid to uniquely identify the notification. Each tuple has notificationtext indicating the notification and CourseTokenID to map course to notification. 


- **NotificationUserMapping:** This acts as a mapping between notifications table and users table. It has a list of columns namely NotificationId, UserID and readflag. Readflag is used to indicate if a notification is seen or unseen by a given user. 

- **QuestionBank:** QuestionBank has a list of values that are related to a given question like QuestionText, DifficultyLevel, Hint and Explanation. Mapping between course and Questions is given by coursetokenid. Each question is uniquely identified by QuestionID. 


- **QuestionParam:** This is a specialized form of QuestionBank. It has QuestionID to uniquely identify a question. It also has ParameterID, ParameterValue and SetID. SetID is used to group the parameters into different sets, as there may be many sets of parameters for a given question. 


- **Roles:** Roles is a table to indicate the association between roleid and rolename.  


- **StudentAttempt:** Each StudentAttempt tuple is a relation between Users and Exercises. It has got UserID, ExerciseID, AttemptID, MarksObtained and SubmissionTime. Thus each tuple has all the details related to each attempt of a given user. 


- **StudentAttemptQuestions:** This is a mapping between Users, Exercises and QuestionBank. It has got UserID, ExerciseID, QuestionId and AttemptID to uniquely identify the tuplese. It also has all the options posted for a given question, the option user has selected and also SetID to indicate the set of parameters the given question is having. 


- **StudentEnrollment:** This acts a relationship between Users and Course. It indicates the list of courses a student is enrolled in. 


- **TextBooks:** Each course has a textbook and even more than one course can have the same textbook. Eack tuple in a TextBooks table has a unique identification column named TextBookISBN and also details like title and author of the book. 


- **Sections:** Each chapter has a set of sections. The section table carries this information. It has TextBookISBN and ChapterID to indicate the textbook and chapter to which they belong to. It also has Section ID, Section Name and also Content. 


- **Subsections:** Each section has a set of sub sections. Thus each tuple in Subsections has SubsectionID, SectionID, ChapterID and TextbookISBN to indicate the link between textbook and Subsection. And it also has subsectionname and Content. Content gives the description of each sub section in a given textbook. 

Gradiance can be used as different type of Users:

- **Users as Student:**
A Student can firstly login to the system. Firstly, he has options to update password and update account details and logout of the system. 
Coming to the functionalities, a user can register for a particular course using the coursetokenid or look at the list of courses he/she has enrolled. Once he selects a particular course, he can attempt a homework which was posted, view past submissions, View notifications if any and also view the scores. View past submission helps the user understand his performance in a particular homework after he selects it in the Select Homework page, which pops up once view past submission button is clicked. Each time he tries to attempt a given homework, he gets a refreshed set of questions. In the notifications, there are a variety of notifications that get populated, like when a new homework is added, when password was not changed for about 3 months. 

- **Users as Professor:**
A professor has the generic options to login to the system, update password, update account details and logout of the system. 
Coming to the functionalities, a professor can select a course from list of courses she is currently teaching. Once he/she selects a course, she has option to add homework, add or remove questions to a given homework, edit homework, view homework, view notifications, view reports and add or remove TA. In add homework, professor has to give all the details related to it, like Number of questions, marks per correct answers, marks per incorrect answer, start and end date etc. In add or remove questions professor can add or remove questions to a selected homework respectively. Edit homework helps professor to edit the details of a selected homework, like start or end date, number of questions, number of retries, difficulty level of questions etc. In view homework, professor can select a particular homework and check the details pertaining to selected homework and also view all the questions that were added to a particular homework. Also professor can select topics to design the homework on those topics only. In notifications, notifications for password change appear. In reports professor can view statistics of the class, like list of students who did not attempt a particular homework, list of students who got maximum marks in a selected homework, average attempts of a given homework etc. 
Professor has the ability to add or remove TA for a particular course. To add a TA, professor must have an idea of the UserID of the student and to remove a TA, professor can select UserID of a particular TA and remove him/her.   

- **Users as Teaching Assistant:**
Based on the course he selects, a user is treated either as Student or a TA. For example, If he selects a course for which he is a Student then the view is of a student. And as a TA, he/she will not have all the privileges of a professor; they can only view a selected homework, view notifications and view reports. TA also has all the generic functionalities like update password, update account details, login and log out of the system.


An overview of this tool can be obtained using this ![ER diagram](https://github.com/sujithktkm/Gradiance/blob/master/ERDiagram_Gradiance_DBPirates.png)
