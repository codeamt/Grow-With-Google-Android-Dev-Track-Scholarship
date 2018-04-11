## Droid Study App
The sample app from this sprint puts to use an existing content provider to serve up protected need-to-know definitions; functioning something like a flashcard quiz app for an Android Dev glossary.  

![Green App Demo](https://user-images.githubusercontent.com/7875284/38591485-f12be14e-3d04-11e8-8487-cd2625b861d9.gif)

## Learning Objective(s):

- [x] Gaining Content Provider access via the Android Manifest
- [x] Using the ContentResolver Class to Access the Content Provider’s data  
- [x] Implementing CRUD action methods for the Content Resolver using URIs
- [x] Displaying the queried responses from Content Provider in the app’s UI

## Best Practices and Takeaways 

-	In lieu of the Cambridge Analytica data breach, learning about permissions, user consent, and protecting end user’s sensitive data
-	Learning about the existing content providers on most Android devices (e.g. for Calendar, Contacts, Alarms, other apps on the device, etc.) 
-	How the Content Resolver functions as an intermediary to manage inter-process communication
-	Learning about some of the included URIs that come with the standard Contract class by convention 
-	Using AsyncTasks to keep DB calls off of the main thread in an app
-	Using projection, selection and sorting order params to keep queries manageable

## App Dependencies: 
-	'com.android.support:appcompat-v7:25.1.0’
-	'junit:junit:4.12’ (test compiling)

**Target SDK Version:** 25

