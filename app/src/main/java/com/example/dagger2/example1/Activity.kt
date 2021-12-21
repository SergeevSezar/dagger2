package com.example.dagger2.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard

    @Inject
    lateinit var mouse: Mouse

    init {
       DaggerNewComponent.create().inject(this)
    }
}