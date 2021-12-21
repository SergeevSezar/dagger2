package com.example.dagger2.example1

import javax.inject.Inject

class ComputerTower @Inject constructor (
    val storage: Storage,
    val memory: Memory,
    val processor: Processor
)