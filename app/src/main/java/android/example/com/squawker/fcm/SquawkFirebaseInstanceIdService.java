package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class SquawkFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static String LOG_TAG = SquawkFirebaseInstanceIdService.class.getSimpleName();


    /**
     * Called if instanceID token is updated. this may occur if the security of
     * the previous token had been compromised.
     * Note : this is called when the instanceID token is initially generated so
     * this where you would retrieve the token
     */
    @Override
    public void onTokenRefresh() {

        // Get updated InstanceID Token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(LOG_TAG, "Refreshed token : " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegisterationToServer(refreshedToken);
    }

    /**
     * Persist token to third-party servers.
     *
     * @param token the new Token
     */
    private void sendRegisterationToServer(String token) {


    }
}
