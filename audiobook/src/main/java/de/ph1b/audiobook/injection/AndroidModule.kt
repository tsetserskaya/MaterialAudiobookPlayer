package de.ph1b.audiobook.injection

import android.app.ActivityManager
import android.app.Application
import android.app.NotificationManager
import android.content.Context
import android.hardware.SensorManager
import android.media.AudioManager
import android.net.ConnectivityManager
import android.telephony.TelephonyManager
import android.view.WindowManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Module providing Android SDK Related instances.
 *
 * @author Paul Woitaschek
 */
@Module class AndroidModule constructor(private val application: Application) {
  @Provides fun provideContext(): Context = application
  @Provides @Singleton fun provideAudioManager(context: Context) = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
  @Provides @Singleton fun provideActivityManager(context: Context) = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
  @Provides @Singleton fun provideTelephonyManager(context: Context) = context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
  @Provides @Singleton fun provideConnectivityManager(context: Context) = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
  @Provides @Singleton fun provideWindowManager(context: Context) = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
  @Provides @Singleton fun provideNotificationManager(context: Context) = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
  @Provides @Singleton fun provideSensorManager(context: Context) = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager?
}