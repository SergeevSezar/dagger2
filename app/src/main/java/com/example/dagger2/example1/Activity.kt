package com.example.dagger2.example1

import javax.inject.Inject

class Activity {

    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()
    val mouse: Mouse = DaggerNewComponent.create().getMouse()
    val monitor: Monitor = DaggerNewComponent.create().getMonitor()

//    @Inject
//    lateinit var keyboard: Keyboard
//
//    @Inject
//    lateinit var mouse: Mouse
//
//    init {
//       DaggerNewComponent.create().inject(this)
//    }
}