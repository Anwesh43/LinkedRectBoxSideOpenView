package com.anwesh.uiprojects.linkedrectboxsideopenview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.rectboxsideopenview.RectBoxSideOpenView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        RectBoxSideOpenView.create(this)
    }
}
