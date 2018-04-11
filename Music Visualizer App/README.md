## Music Visualizer App 
This sample app visualizes an audio track’s frequencies and offers the end user a settings page to switch up the UI – mainly, the color of visualizer shapes – to preference.  


![Green App Demo](https://user-images.githubusercontent.com/7875284/38591485-f12be14e-3d04-11e8-8487-cd2625b861d9.gif)

## Learning Objective(s):

- [x] Creating a Settings Activity to modify app preferences from Android UI widgets
- [x] Creating XML Preference Fragments using SharedPreferences persistence option
- [x] Handling triggered UI changes in other activities from Settings Activity
- [x] Implementing Preference Summaries to illustrate preference state
 
## Best Practices and Takeaways 

-	How to identify the appropriate persistent storage option for given data of size n: SharedPreferences (the focus for this sprint), as well as Relational DBs (SQLite), Internal/External Storage (On Device), and Cloud Storage (ex: Google’s Firebase Settings) 
-	Understanding the modular, reusable design pattern behind Preference Fragments
-	Reading from/writing to SharedPreferences and implementing event listeners
-	Implementing list preferences and passing default values as parameters


## App Dependencies: 
-	'com.android.support:appcompat-v7:25.1.0’
-	'com.android.support:preference-v7:25.1.0’

**Target SDK Version:** 25

