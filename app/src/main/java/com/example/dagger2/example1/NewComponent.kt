package com.example.dagger2.example1

import dagger.Component

@Component
interface NewComponent {

    fun inject(activity: Activity)
}