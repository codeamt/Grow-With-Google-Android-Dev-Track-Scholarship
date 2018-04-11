## ToDo App 
This sample app puts a slight twist on the traditional "ToDo List" app by enabling end users to prioritize the tasks on their list.   

![Green App Demo](https://user-images.githubusercontent.com/7875284/38591485-f12be14e-3d04-11e8-8487-cd2625b861d9.gif)

## Learning Objective(s):

- [x] Creating a TaskManager class that extends from the Content Provider Interface and implements the onCreate function from the Android SDK
- [x] Registering the Content Provider in the Android Manifest  
- [x] Defining URIs and the different data types it can return for the Content Resolver
- [x] Add URIs and string constants to db Contract class
- [x] Implement a URIMatcher class to match URI patterns to integers 
- [x] Implement the 4 CRUD methods for the Content Resolver

## Best Practices and Takeaways 

- Designing Floating Action Buttons (FABs)
-	Terminology for Data Design (e.g., directories, items, etc.)
-	Using wildcard characters to parameterize your queries
-	More on unit testing in Android Studio
-	Understanding end-to-end flow from DB to Resolver and UI
-	Mimetypes and implementing provider methods – CRUD + onCreate and getType
- Implementing the Tinder-like swipe to delete code

## App Dependencies: 
-	'com.android.support:appcompat-v7:25.1.0’
-	'com.android.support:recyclerview-v7:25.1.0’
-	'com.android.support:design:25.1.0’
-	'com.android.support.constraint:constraint-layout:1.0.0-beta4’
-	'junit:junit:4.12’ (test compiling)'
-	'com.android.support:support-annotations:25.1.0'
-	'com.android.support.test:runner:0.5'
-	'com.android.support.test:rules:0.5'


**Target SDK Version:** 25
