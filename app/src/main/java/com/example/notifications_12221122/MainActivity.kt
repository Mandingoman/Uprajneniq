package com.example.notifications_12221122


import android.app.Activity.NOTIFICATION_SERVICE
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.ContentResolver
import android.content.Context
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.provider.Settings.Global.getString
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getString
import androidx.core.content.ContextCompat.getSystemService


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.layout_main)
        val datePicker = findViewById<DatePicker>(R.id.DatePicker)

        findViewById<Button>(R.id.ToastButton)
            .setOnClickListener {
                val day = datePicker.dayOfMonth
                val month = datePicker.month
                val year = datePicker.year

                val length = Toast.LENGTH_SHORT
                val toast = Toast.makeText(this, "$day-$month- $year", length)
                toast.show()

            }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = getString(R.string.channel_name)
            val descriptionText = getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel("1", name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system.
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
            findViewById<Button>(R.id.NotificationButton)
                .setOnClickListener {
                    val notificationBuilder = NotificationCompat.Builder(this, "1")
                    val day = datePicker.dayOfMonth
                    val month = datePicker.month

                    if (month == 2 && day > 20 || month == 3 && day < 20) {
                        val sign = "Aries"
                        notificationBuilder
                            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.aries))
                            .setSmallIcon(R.drawable.zodiac_icon)
                            .setContentTitle("Zodiac sign")
                            .setContentText("Your zodiac sign is: $sign ")
                            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        notificationManager.notify(1,notificationBuilder.build())

                    }
                    if (month == 3 && day >= 20 || month == 4 && day <= 20) {
                        val sign = "Taurus"
                        notificationBuilder
                            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.taurus))
                            .setSmallIcon(R.drawable.zodiac_icon)
                            .setContentTitle("Zodiac sign")
                            .setContentText("Your zodiac sign is: $sign ")
                            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        notificationManager.notify(1,notificationBuilder.build())

                    }
                    if (month == 4 && day > 20 || month == 5 && day <= 21) {
                        val sign = "Gemini"
                        notificationBuilder
                            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.gemini))
                            .setSmallIcon(R.drawable.zodiac_icon)
                            .setContentTitle("Zodiac sign")
                            .setContentText("Your zodiac sign is: $sign ")
                            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        notificationManager.notify(1,notificationBuilder.build())

                    }
                    if (month == 5 && day >= 22 || month == 6 && day <= 22) {
                        val sign = "Cancer"
                        notificationBuilder
                            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.cancer))
                            .setSmallIcon(R.drawable.zodiac_icon)
                            .setContentTitle("Zodiac sign")
                            .setContentText("Your zodiac sign is: $sign ")
                            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        notificationManager.notify(1,notificationBuilder.build())

                    }
                    if (month == 6 && day >= 23 || month == 7 && day <= 22) {
                        val sign = "Leo"
                        notificationBuilder
                            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.leo))
                            .setSmallIcon(R.drawable.zodiac_icon)
                            .setContentTitle("Zodiac sign")
                            .setContentText("Your zodiac sign is: $sign ")
                            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        notificationManager.notify(1,notificationBuilder.build())

                    }
                    if (month == 7 && day >= 23 || month == 8 && day <= 22) {
                        val sign = "Virgo"
                        notificationBuilder
                            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.virgo))
                            .setSmallIcon(R.drawable.zodiac_icon)
                            .setContentTitle("Zodiac sign")
                            .setContentText("Your zodiac sign is: $sign ")
                            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        notificationManager.notify(1,notificationBuilder.build())

                    }
                    if (month == 8 && day >= 23 || month == 9 && day <= 23) {
                        val sign = "Libra"
                        notificationBuilder
                            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.libra))
                            .setSmallIcon(R.drawable.zodiac_icon)
                            .setContentTitle("Zodiac sign")
                            .setContentText("Your zodiac sign is: $sign ")
                            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        notificationManager.notify(1,notificationBuilder.build())

                    }
                    if (month == 9 && day >= 24 || month == 10 && day <= 21) {
                        val sign = "Scorpius"
                        notificationBuilder
                            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.scorpio))
                            .setSmallIcon(R.drawable.zodiac_icon)
                            .setContentTitle("Zodiac sign")
                            .setContentText("Your zodiac sign is: $sign ")
                            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        notificationManager.notify(1,notificationBuilder.build())

                    }
                    if (month == 10 && day >= 22 || month == 11 && day <= 21) {
                        val sign = "Sagittarius"
                        notificationBuilder
                            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.sagittarius))
                            .setSmallIcon(R.drawable.zodiac_icon)
                            .setContentTitle("Zodiac sign")
                            .setContentText("Your zodiac sign is: $sign ")
                            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        notificationManager.notify(1,notificationBuilder.build())

                    }
                    if (month == 11 && day >= 22 || month == 0 && day <= 19) {
                        val sign = "Capricornus"
                        notificationBuilder
                            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.capricorn))
                            .setSmallIcon(R.drawable.zodiac_icon)
                            .setContentTitle("Zodiac sign")
                            .setContentText("Your zodiac sign is: $sign ")
                            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        notificationManager.notify(1,notificationBuilder.build())

                    }
                    if (month == 0 && day >= 20 || month == 1 && day <= 20) {
                        val sign = "Aquarius"
                        notificationBuilder
                            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.aquarius))
                            .setSmallIcon(R.drawable.zodiac_icon)
                            .setContentTitle("Zodiac sign")
                            .setContentText("Your zodiac sign is: $sign ")
                            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        notificationManager.notify(1,notificationBuilder.build())

                    }
                    if (month == 1 && day >= 19 || month == 2 && day <= 20) {
                        val sign = "Pisces"
                        notificationBuilder
                            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.pisces))
                            .setSmallIcon(R.drawable.zodiac_icon)
                            .setContentTitle("Zodiac sign")
                            .setContentText("Your zodiac sign is: $sign ")
                            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        notificationManager.notify(1,notificationBuilder.build())

                    }
                }


        }
    }
}






