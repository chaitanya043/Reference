package com.puzzle.reference;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.telephony.VisualVoicemailSmsFilterSettings;
import android.view.View;
import android.view.textclassifier.TextClassifierEvent;
import android.widget.Button;

import static androidx.core.app.NotificationCompat.*;

public class NotificationActivity extends AppCompatActivity {

    Button not;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        not = findViewById(R.id.not);

        not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Message = "Hi this is Chaitanya";
                NotificationCompat.Builder builder = new NotificationCompat.Builder(

                        NotificationActivity.this
                )
                        .setSmallIcon(R.drawable.ic_baseline_notification_important_24)
                        .setContentTitle("New Notification")
                        .setContentText(Message)
                        .setAutoCancel(true)
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

                NotificationManager notificationManager = (NotificationManager)
                        getSystemService(NOTIFICATION_SERVICE);


                Intent intent = new Intent(NotificationActivity.this, OpActivity.class);

                PendingIntent pendingIntent = PendingIntent.getActivity(NotificationActivity.this, 0, intent,
                        PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);





                notificationManager.notify(0, builder.build());
            }
        });






    }
}