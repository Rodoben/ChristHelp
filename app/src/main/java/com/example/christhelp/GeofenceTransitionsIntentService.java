
package com.example.christhelp;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;

import java.util.ArrayList;
import java.util.List;


public class GeofenceTransitionsIntentService extends IntentService {

    String block3="block3";
    protected static final String TAG = "geofence-transitions-service";

    public GeofenceTransitionsIntentService() {
        // Use the TAG to name the worker thread.
        super(TAG);
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        GeofencingEvent geofencingEvent = GeofencingEvent.fromIntent(intent);
        if (geofencingEvent.hasError()) {
            String errorMessage = GeofenceErrorMessages.getErrorString(this,
                    geofencingEvent.getErrorCode());
            Log.e(TAG, errorMessage);
            return;
        }


        // Get the transition type.
        int geofenceTransition = geofencingEvent.getGeofenceTransition();

        // Test that the reported transition was of interest.
        if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER ||
                geofenceTransition == Geofence.GEOFENCE_TRANSITION_EXIT) {

            // Get the geofences that were triggered. A single event can trigger multiple geofences.
            List<Geofence> triggeringGeofences = geofencingEvent.getTriggeringGeofences();
            Geofence geofence = triggeringGeofences.get(0);

            if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER && geofence.getRequestId().equals("home")) {
                Log.d(TAG, "You are inside Stanford University");
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"youre inside home",Toast.LENGTH_SHORT).show();
                        try
                        {
                            Intent broadCastIntent = new Intent();
                            broadCastIntent.setAction(MapsActivity.BROADCAST_ACTION);

                            // uncomment this line if you want to send data
                            broadCastIntent.putExtra("data", "home");

                            sendBroadcast(broadCastIntent);

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }

                    }
                });
                //   startActivity(new Intent(getApplicationContext(),test.class));
                //   Toast.makeText(getApplicationContext(),"inside",Toast.LENGTH_LONG).show();
            } else
            if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER && geofence.getRequestId().equals("home2")) {
                Log.d(TAG, "You are inside Stanford University");
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"youre inside home2n",Toast.LENGTH_SHORT).show();
                        try
                        {
                            Intent broadCastIntent = new Intent();
                            broadCastIntent.setAction(MapsActivity.BROADCAST_ACTION);

                            // uncomment this line if you want to send data
                            broadCastIntent.putExtra("data", "home2");

                            sendBroadcast(broadCastIntent);

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }


                    }
                });
                //   startActivity(new Intent(getApplicationContext(),test.class));
                //   Toast.makeText(getApplicationContext(),"inside",Toast.LENGTH_LONG).show();
            } else
            if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER && geofence.getRequestId().equals("block1")) {
                Log.d(TAG, "You are inside Stanford University");
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"youre inside block1",Toast.LENGTH_SHORT).show();
                        try
                        {
                            Intent broadCastIntent = new Intent();
                            broadCastIntent.setAction(MapsActivity.BROADCAST_ACTION);

                            // uncomment this line if you want to send data
                            broadCastIntent.putExtra("data", "block1");

                            sendBroadcast(broadCastIntent);

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }

                    }
                });
                //   startActivity(new Intent(getApplicationContext(),test.class));
                //   Toast.makeText(getApplicationContext(),"inside",Toast.LENGTH_LONG).show();
            } else
            if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER && geofence.getRequestId().equals("block2")) {
                Log.d(TAG, "You are inside Stanford University");
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"youre inside block2",Toast.LENGTH_SHORT).show();
                        try
                        {
                            Intent broadCastIntent = new Intent();
                            broadCastIntent.setAction(MapsActivity.BROADCAST_ACTION);

                            // uncomment this line if you want to send data
                            broadCastIntent.putExtra("data", "block2");

                            sendBroadcast(broadCastIntent);

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }


                    }
                });
                //   startActivity(new Intent(getApplicationContext(),test.class));
                //   Toast.makeText(getApplicationContext(),"inside",Toast.LENGTH_LONG).show();
            } else
            if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER && geofence.getRequestId().equals("block3")) {
                Log.d(TAG, "You are inside Stanford University");
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"youre inside block3",Toast.LENGTH_SHORT).show();
                        try
                        {
                            Intent broadCastIntent = new Intent();
                            broadCastIntent.setAction(MapsActivity.BROADCAST_ACTION);

                            // uncomment this line if you want to send data
                            broadCastIntent.putExtra("data", "block3");

                            sendBroadcast(broadCastIntent);

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }

                    }
                });
                //   startActivity(new Intent(getApplicationContext(),test.class));
                //   Toast.makeText(getApplicationContext(),"inside",Toast.LENGTH_LONG).show();
            } else if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_EXIT && geofence.getRequestId().equals("block3")) {
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"youre outside block3",Toast.LENGTH_SHORT).show();
                        try
                        {
                            Intent broadCastIntent = new Intent();
                            broadCastIntent.setAction(MapsActivity.BROADCAST_ACTION);

                            // uncomment this line if you want to send data
                            broadCastIntent.putExtra("data", "block3exit");

                            sendBroadcast(broadCastIntent);

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }

                    }
                });
            }else
            if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER && geofence.getRequestId().equals("block4")) {
                Log.d(TAG, "You are inside Stanford University");
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"youre inside block4",Toast.LENGTH_SHORT).show();
                        try
                        {
                            Intent broadCastIntent = new Intent();
                            broadCastIntent.setAction(MapsActivity.BROADCAST_ACTION);

                            // uncomment this line if you want to send data
                            broadCastIntent.putExtra("data", "block4");

                            sendBroadcast(broadCastIntent);

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }

                    }
                });
                //   startActivity(new Intent(getApplicationContext(),test.class));
                //   Toast.makeText(getApplicationContext(),"inside",Toast.LENGTH_LONG).show();
            } else
            if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER && geofence.getRequestId().equals("central")) {
                Log.d(TAG, "You are inside Stanford University");
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"youre inside central",Toast.LENGTH_SHORT).show();
                        try
                        {
                            Intent broadCastIntent = new Intent();
                            broadCastIntent.setAction(MapsActivity.BROADCAST_ACTION);

                            // uncomment this line if you want to send data
                            broadCastIntent.putExtra("data", "central");

                            sendBroadcast(broadCastIntent);

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }

                    }
                });
                //   startActivity(new Intent(getApplicationContext(),test.class));
                //   Toast.makeText(getApplicationContext(),"inside",Toast.LENGTH_LONG).show();
            } else
            if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER && geofence.getRequestId().equals("puc")) {
                Log.d(TAG, "You are inside Stanford University");
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"youre inside puc",Toast.LENGTH_SHORT).show();
                        try
                        {
                            Intent broadCastIntent = new Intent();
                            broadCastIntent.setAction(MapsActivity.BROADCAST_ACTION);

                            // uncomment this line if you want to send data
                            broadCastIntent.putExtra("data", "puc");

                            sendBroadcast(broadCastIntent);

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }


                    }
                });
                //   startActivity(new Intent(getApplicationContext(),test.class));
                //   Toast.makeText(getApplicationContext(),"inside",Toast.LENGTH_LONG).show();
            } else
            if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER && geofence.getRequestId().equals("block2nd")) {
                Log.d(TAG, "You are inside Stanford University");
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"youre inside block2 second gate",Toast.LENGTH_SHORT).show();

                        try
                        {
                            Intent broadCastIntent = new Intent();
                            broadCastIntent.setAction(MapsActivity.BROADCAST_ACTION);

                            // uncomment this line if you want to send data
                            broadCastIntent.putExtra("data", "block2nd");

                            sendBroadcast(broadCastIntent);

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }
                    }
                });
                //   startActivity(new Intent(getApplicationContext(),test.class));
                //   Toast.makeText(getApplicationContext(),"inside",Toast.LENGTH_LONG).show();
            } else
            if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER && geofence.getRequestId().equals("audienter")) {
                Log.d(TAG, "You are inside Stanford University");
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"youre inside auditorium",Toast.LENGTH_SHORT).show();
                        try
                        {
                            Intent broadCastIntent = new Intent();
                            broadCastIntent.setAction(MapsActivity.BROADCAST_ACTION);

                            // uncomment this line if you want to send data
                            broadCastIntent.putExtra("data", "audicenter");

                            sendBroadcast(broadCastIntent);

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }

                    }
                });
                //   startActivity(new Intent(getApplicationContext(),test.class));
                //   Toast.makeText(getApplicationContext(),"inside",Toast.LENGTH_LONG).show();
            } else
            if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER && geofence.getRequestId().equals("park")) {
                Log.d(TAG, "You are inside Stanford University");
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"youre inside parking",Toast.LENGTH_SHORT).show();

                        try
                        {
                            Intent broadCastIntent = new Intent();
                            broadCastIntent.setAction(MapsActivity.BROADCAST_ACTION);

                            // uncomment this line if you want to send data
                            broadCastIntent.putExtra("data", "park");

                            sendBroadcast(broadCastIntent);

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }
                    }
                });
                //   startActivity(new Intent(getApplicationContext(),test.class));
                //   Toast.makeText(getApplicationContext(),"inside",Toast.LENGTH_LONG).show();
            }else if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_EXIT && geofence.getRequestId().equals("park")) {
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"youre outside parking",Toast.LENGTH_SHORT).show();
                        try
                        {
                            Intent broadCastIntent = new Intent();
                            broadCastIntent.setAction(MapsActivity.BROADCAST_ACTION);

                            // uncomment this line if you want to send data
                            broadCastIntent.putExtra("data", "parkexit");

                            sendBroadcast(broadCastIntent);

                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }

                    }
                });
            }
            else{
                Log.d(TAG, "You are outside Stanford University");
            }

            // Get the transition details as a String.
            String geofenceTransitionDetails = getGeofenceTransitionDetails(
                    this,
                    geofenceTransition,
                    triggeringGeofences
            );

            // Send notification and log the transition details.
          //  sendNotification(geofenceTransitionDetails);
            Log.i(TAG, geofenceTransitionDetails);
        } else {
            // Log the error.
            Log.e(TAG, getString(R.string.geofence_transition_invalid_type, geofenceTransition));
        }
    }

    private String getGeofenceTransitionDetails(
            Context context,
            int geofenceTransition,
            List<Geofence> triggeringGeofences) {



        String geofenceTransitionString = getTransitionString(geofenceTransition);

        // Get the Ids of each geofence that was triggered.
        ArrayList<String> triggeringGeofencesIdsList = new ArrayList<>();
        for (Geofence geofence : triggeringGeofences) {
            triggeringGeofencesIdsList.add(geofence.getRequestId());

            if (triggeringGeofencesIdsList.contains("home")){
                Toast.makeText(getApplicationContext(),"kfbgf",Toast.LENGTH_LONG).show();

            }
        }
        String triggeringGeofencesIdsString = TextUtils.join(", ", triggeringGeofencesIdsList);

        return geofenceTransitionString + ": " + triggeringGeofencesIdsString;
    }

    private String getTransitionString(int transitionType) {
        switch (transitionType) {
            case Geofence.GEOFENCE_TRANSITION_ENTER:
                return getString(R.string.geofence_transition_entered);
            case Geofence.GEOFENCE_TRANSITION_EXIT:
                return getString(R.string.geofence_transition_exited);
            default:
                return getString(R.string.unknown_geofence_transition);
        }
    }


}
