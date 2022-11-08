# WACAJ
WhatsApp cloud API java Wrapper.

I want to build a WhatsApp-cloud-API wrapper for Spring java.
The wrapper will be similar to https://github.com/Neurotech-HQ/heyoo.git heyoo Python wrapper.
Features that I want the project to have:
1. Send message to a customer.
2. Send bulk messages to customers.
3. Schedule bulk message to customers.
4. Filter customer and send them messages.
5. Receive messages from client and take very basic action.

I would also like to build a CI-CD pipeline for auto build and deployment.
The application should be hosted on AWS.

Already done:
All the user data shifted to a cloud mongo db.
The application is hosted on cloud with auto deployment on for every commit.
The spring security has been added

To Do:
Add Embedded signups for BSP so as to onboard businesses easily
Get the principle in the controller so as to make code very elegent.
Add list of customers page for the businesses from where they can send messages.
Upgrade to the latest spring security features.
Systems design.
Add frontend.
