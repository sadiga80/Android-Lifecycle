# Android-Lifecycle


# Understand the Activity Lifecycle

The Activity instances in our app transition through different states in their lifecycle. The Activity class provides a number of callbacks that allow the activity to know that a state has changed.
The Activity lifecycle callbacks methods are as follows :

# onCreate() :

onCreate method need to be implemented in Activity. An Activity is created when we call onCreate(). This method is called only once in lifecycle, and its mostly used for initializations.

`@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}`

# onStart() :

onStart() is invoked by system when an activity enters started state. The onStart() call makes the activity visible to the user, as the app prepares for the activity to enter the foreground and become interactive.

`@override
public void onStart()
{
    super.onStart();
    Log.d("Lifecycle", "onStart() invoked");

}`

This is how we can log and see the onStart() method execution.

# onResume() :

onResume() method is invoked by system when the Activity is in foreground. This is the state in which app interacts with user.

@override
public void onResume()
`{
    super.onResume();
    Log.d("Lifecycle", "onResume() invoked");

}`

This is how we can log and see the onResume() method execution.

# onPause():

onPause() is invoked by system when the user is leaving Activity. This method as the first indication that the user is leaving our Activity. This callback indicates that an Activity is no longer in foreground or partially visible.

`@override
public void onPause()
{
    super.onPause();
    Log.d("Lifecycle", "onPause() invoked");

}`

This is how we can log and see the onPause() method execution.

# onStop() :

onStop() is executed by system when activity is no longer visible to user. This callback generally occurs when a new Activity is started and current Activity is finished.

`@override
public void onStop()
{
    super.onStop();
    Log.d("Lifecycle", "onStop() invoked");

}`

This is how we can log and see the onStop() method execution.

# onDestroy() :

onDestroy is called by system when an Activity is destroyed. This method is called when the the system is temporarily destroying the activity due to a configuration change. This lifecycle method can be invoked by calling finish() method.

`@override
public void onDestroy()
{
    super.onDestroy();
    Log.d("Lifecycle", "onDestroy() invoked");

}`

This is how we can log and see the onStop() method execution.

# onRestart() :

onRestart is invoked by system when Activity restarts after stopping.

`@override
public void onRestart()
{
    super.onRestart();
    Log.d("Lifecycle", "onRestart() invoked");

}`

This is how we can log and see the onRestart() method execution.
