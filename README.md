Lifecycle Methods (Detailed)
1. onCreate()
Called when: The activity is first created.
Purpose: Initialization of the activity.
Common Uses:
Set layout using setContentView()
Initialize variables and UI components
Set up listeners or bindings
Important: This method is called only once during the activity’s life (unless recreated).
Example idea: Loading the screen layout.
2. onStart()
Called when: The activity becomes visible to the user.
Purpose: Prepare the activity to enter the foreground.
Common Uses:
Register broadcast receivers
Start UI-related tasks
The activity is visible but not yet interactive.
Example: Preparing UI elements before user interaction.
3. onResume()
Called when: The activity starts interacting with the user.
Purpose: Bring the app to the foreground.
Common Uses:
Start animations
Resume camera, sensors, or audio
Begin user interaction
This is where the activity is fully active.
Example: User can now click buttons and type.
4. onPause()
Called when: The activity is partially hidden (another app or dialog appears).
Purpose: Pause ongoing operations.
Common Uses:
Save unsaved data
Pause animations or music
Release temporary resources
Must be fast, because the system may move quickly to the next state.
Example: Incoming call or pop-up appears.
5. onStop()
Called when: The activity is no longer visible.
Purpose: Release resources not needed while hidden.
Common Uses:
Stop background processes
Unregister listeners
Release heavy resources (camera, GPS)
The activity is completely hidden from the user.
Example: User switches to another app.
6. onDestroy()
Called when: The activity is about to be destroyed.
Purpose: Final cleanup before removal from memory.
Common Uses:
Free all remaining resources
Stop background threads
May not always be called (system can kill the app).
Example: User closes the app or system removes it.

Normal Flow (Opening App)
onCreate() → onStart() → onResume()
When Interrupted
onPause() → onResume()
When Leaving App
onPause() → onStop()
When Returning to App
onRestart() → onStart() → onResume()
When Closing App
onPause() → onStop() → onDestroy()

Important Notes
onPause() must execute quickly to avoid lag.
onDestroy() is not guaranteed (system may kill the app).
Always save important data in onPause() or onStop().
Lifecycle handling is important for:
Preventing crashes
Saving battery
Smooth user experience

Link through Docs:

https://docs.google.com/document/d/1M2ORBKHjjf4e8iAfnpgIBEG2mHUd1XTm7oGNN-jPWX8/edit?usp=sharing
