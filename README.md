# CS-320

# How can I ensure that my code, program, or software is functional and secure?
To ensure that my code is functional and secure I created JUnit tests. When creating these tests, it was important to test all aspects including testing valid inputs as well as invalid inputs. In some cases, it was important to create variables with the class name in it to not confuse similar code in another class when testing. If I did not and in the case that these got mixed up, it may have passed the test but not actually adding/updating/deleting from the correct array (list). To further ensure that this testing worked and there was not any 'dead' code, I referenced the coverage percentage of each test/class.

# How do I interpret user needs and incorporate them into a program?
I incorporated the users’ needs by ensuring that the correct character limit and the inability to be null for each task, contact, and appointment were included. Furthermore, when testing these restrictions I included sample data that should, and did, come out as false. In addition, the user needed to be able to add, delete, and update the given class (task, contact, and appointment). 

# How do I approach designing software?
As we did not complete an interface to integrate all of these classes together, I started with the task and taskService requirements with their corresponding tests. As contact and appointment were similar to task and contactService and appointmentService were similar to taskService, it gave a reference point when completing the additional classes. Throughout our assignments and development process, I stumbled upon ways to improve these classes and went back to previous completed classes and fixed them to replicate, to an extent (with their correct variables), the current one I was working on at the time. This allowed me to put them all together later on for the final project and gave an easier flow to reading the code due to the close similarities.
