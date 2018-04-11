## Water Hydration App  
This sample app helps users live their best life by scheduling and sending notifications to drink a glass of water within a specified time interval (15 minutes), if their phone is charging   

![Green App Demo](https://user-images.githubusercontent.com/7875284/38591485-f12be14e-3d04-11e8-8487-cd2625b861d9.gif)

## Learning Objective(s):

- [x] Adding an Intent Service (Background Job) to an Android App
- [x] Create a button that triggers a Notification/Pending Intent  
- [x] Add Actions to a Notification
- [x] Adding a JobService to an Android App
- [x] Use FirebaseJobDispatcher class to schedule a background job
- [x] Implement and register a System Broadcast Intent for device change (phone charging)

## Best Practices and Takeaways 

-	Learning about the Service lifecycle, how this component helps separate threading concerns, and how to run tasks efficiently in the background
-	Appropriate use cases for a Service component verses a Loader component 
-	Differentiating Foreground Services from Intent (Background) Services, and understanding priority levels of different Services in lieu of memory constraints
-	Ways and corresponding methods for starting a Service
-	Intro to the design guide, channels and badges for Notifications (Pending Intents) as well as useful applications that build on recent API releases (Android Oreo) and the diffusion of Wearable technologies
-	Installing the necessary SDKs to run Firebase, setting up Android Debug Bridge (ADB) to simulate device changes, and helpful ADB terminal commands
-	Learning about static and dynamic Broadcast Intents, flag sets and how Intent Filters work

## App Dependencies: 
- 'com.android.support:appcompat-v7:26.0.1'
-	'com.firebase:firebase-jobdispatcher:0.5.2'

**Target SDK Version:** 26
