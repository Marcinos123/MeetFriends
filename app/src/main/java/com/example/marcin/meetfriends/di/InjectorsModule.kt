package com.example.marcin.meetfriends.di

import com.example.marcin.meetfriends.ui.main.MainActivity
import com.example.marcin.meetfriends.ui.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by marci on 2017-11-09.
 */

@Module
abstract class InjectorsModule {

  @ScreenScope
  @ContributesAndroidInjector(modules = arrayOf(MainModule::class))
  abstract fun mainActivity(): MainActivity
}