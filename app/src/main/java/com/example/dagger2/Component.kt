package com.example.dagger2

class Component {

    private fun getComputer(): Computer {
        val monitor = Monitor()
        val keyboard = KeyBoard()
        val mouse = Mouse()
        val computerTower = ComputerTower(
            Storage(),
            Memory(),
            Processor()
        )
        return Computer(monitor, computerTower, keyboard, mouse)
    }

    fun inject(activity: MainActivity) {
        activity.computer = getComputer()
        activity.keyboard = KeyBoard()
    }
}