package com.example.marcin.meetfriends.mvp

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import javax.inject.Inject

/**
 * Created by marci on 2017-11-09.
 */
abstract class BaseActivity<P : MvpPresenter> : AppCompatActivity() {

  @Inject lateinit var presenter: P

  override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onPostCreate(savedInstanceState, persistentState)
    presenter.onViewCreated()
  }

  override fun onStart() {
    super.onStart()
    presenter.start()
  }

  override fun onResume() {
    super.onResume()
    presenter.resume()
  }

  override fun onPause() {
    super.onPause()
    presenter.pause()
  }

  override fun onStop() {
    super.onStop()
    presenter.stop()
  }

  override fun onDestroy() {
    super.onDestroy()
    presenter.destroy()
  }
}